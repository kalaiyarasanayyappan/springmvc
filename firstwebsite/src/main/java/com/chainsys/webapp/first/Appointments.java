package com.chainsys.webapp.first;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.common.InvalidInputDataException;
import com.chainsys.miniproject.common.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointments() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Appointment> allAppointments = AppointmentDao.getAllAppoinments();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		out.println("<html><body bgcolor=gray><center><h1>All Appointments List</h1></center>");
		out.println("</tr></table>");
  		out.println("<hr><br>");
    	out.println("<table border=0>");
        out.println("<tr><td width=137>&nbsp;</td><td>");
        out.println("<table border=1>");
        out.println("<tr><th bgcolor=silver>App_Id</th><th bgcolor=silver>Appoint_Date</th><th bgcolor=silver>Doc_Id</th><th bgcolor=silver>Patient_Name</th><th bgcolor=silver>Fees Collected</th>");
        out.println("</tr>");
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			out.println("<tr><td bgcolor=lightblue>");
			out.println(ap.getAppoint_Id() + " </td><td bgcolor=lightblue> " + ap.getAppoint_Date() + "</td><td bgcolor=lightblue>  " + ap.getDoc_Id() + " </td><td bgcolor=lightblue> "
					+ ap.getPatient_Name() + " </td><td bgcolor=lightblue> " + ap.getFees_Collected() + "</p>");
		}
		out.println("</table>");		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getParameter("submit").equals("ADD APPOINTMENT")) {
		PrintWriter out = response.getWriter();
		Appointment newap = new Appointment();
		//System.out.println("Enter Appointment_id :");
		String id = request.getParameter("Ap_Id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int apId = Integer.parseInt(id);
		Appointment ap = AppointmentDao.getPatientById(apId);
		if (ap == null) {
			System.out.println("Appointment Doesn't Exist For Id " + apId);
			return;
		}
		try {
			Validator.checkNumberForGreaterThanZero(apId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}

		newap.setAppoint_Id(apId);
	//	System.out.println("Enter Date :");
		String dateFormat = "dd/MM/yyyy";
		try {
			newap.setAppoint_Date(new SimpleDateFormat(dateFormat).parse(request.getParameter("date")));
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	//	System.out.println("Enter Doctor_Id :");
		String id1 = request.getParameter("Doc_Id");
		try {
			Validator.checkStringForParseInt(id1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id1);
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setDoc_Id(docId);
	//	System.out.println("Enter Patient Name :");
		String name = request.getParameter("name");
		try {
			Validator.checkCharLessThanTwenty(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkDataOnlyString(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setPatient_Name(name);
	//	System.out.println("Enter Fees Collected :");
		String fees = request.getParameter("feeses");
		try {
			Validator.checkCharLessThanTwenty(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}

		newap.setFees_Collected(fees);
		int result = AppointmentDao.insertAppointment(newap);
		System.out.println(result);
		out.println("<div> Add New Appointment : " + result + "</div>");
	}else if(request.getParameter("submit").equals("UPDATE")) {
		doPut(request,response);
	}else if(request.getParameter("submit").equals("DELETE")) {
		doDelete(request,response);
	}
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointment newap = new Appointment();
	//	System.out.println("Enter Appointment_id :");
		String id = request.getParameter("App_Id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int apId = Integer.parseInt(id);
		Appointment ap = AppointmentDao.getPatientById(apId);
		if (ap == null) {
			System.out.println("Appointment Doesn't Exist For Id " + apId);
			return;
		}
		try {
			Validator.checkNumberForGreaterThanZero(apId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}

		newap.setAppoint_Id(apId);
		 String dateFormat = "dd/MM/yyyy";
		    try {
				newap.setAppoint_Date(new SimpleDateFormat(dateFormat).parse(request.getParameter("date")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
	//	System.out.println("Enter Update Doctor_Id :");
		String id1 = request.getParameter("Doc_Id");
		try {
			Validator.checkStringForParseInt(id1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id1);
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setDoc_Id(docId);
	//	System.out.println("Enter Update Patient Name :");
		String name = request.getParameter("Patient_Name");
		
		try {
			Validator.checkCharLessThanTwenty(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkDataOnlyString(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newap.setPatient_Name(name);
	//	System.out.println("Enter Update Fees Collected :");
		String fees = request.getParameter("fees");
		try {
			Validator.checkCharLessThanTwenty(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}

		newap.setFees_Collected(fees);
		int result = AppointmentDao.updateAppointment(newap);
		System.out.println(result);
		out.println("<div> Appointment Updated " + result + "</div>");
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointment newap = new Appointment();
	//	System.out.println("Enter Appointment_id :");
		String id = request.getParameter("App_Id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int apId = Integer.parseInt(id);
		try {
			Validator.checkNumberForGreaterThanZero(apId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		Appointment ap = AppointmentDao.getPatientById(apId);
		if (ap == null) {
			System.out.println("Appointment Doesn't Exist For Id " + apId); //
			return;
		}
		newap.setAppoint_Id(apId);
		int result = AppointmentDao.deleteAppointment(Integer.parseInt(id));
		System.out.println(result);
		out.println("<div> Appointment Deleted " + result + "</div>");
	}
}
