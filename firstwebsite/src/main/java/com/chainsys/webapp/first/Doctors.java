package com.chainsys.webapp.first;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.common.ExceptionManager;
import com.chainsys.miniproject.common.InvalidInputDataException;
import com.chainsys.miniproject.common.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Doctor
 */

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		out.println("<html><body bgcolor=gray><center><h1>All Doctors List</h1></center>");
		out.println("</tr></table>");
  		out.println("<hr><br>");
    	out.println("<table border=0>");
        out.println("<tr><td width=137>&nbsp;</td><td>");
        out.println("<table border=1>");
        out.println("<tr><th bgcolor=silver>Doctor_Id</th><th bgcolor=silver>Doctor Name</th><th bgcolor=silver>DOB</th><th bgcolor=silver>Speciality</th><th bgcolor=silver>City</th><th bgcolor=silver>Phone No</th><th bgcolor=silver>Std_Fees</th>");
        out.println("</tr>");
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			out.println("<tr><td bgcolor=lightblue>");
			out.println(dr.getDoctor_id() + "</td><td bgcolor=lightblue> " + dr.getName() + " </td><td width=70 bgcolor=lightblue> " + dr.getDate() + " </td><td width=157 bgcolor=lightblue>" + dr.getSpeciality() + " </td><td bgcolor=lightblue>"
					+ dr.getCity() + " </td><td bgcolor=lightblue>" + dr.getNumber() + " </td><td bgcolor=lightblue>" + dr.getStd_Fees()+ "</td>");
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
		if(request.getParameter("submit").equals("ADD DOCTOR")) {
		PrintWriter out = response.getWriter();
		Doctor newdoc = new Doctor();
		String id = request.getParameter("Doc_Id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id);
		newdoc.setDoctor_id(Integer.parseInt(id));
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		Doctor doc = DoctorDao.getDoctorById(docId);
		if (doc == null) {
			System.out.println("Doctor Doesn't Exist For Id " + docId);
			return;
		}
		newdoc.setDoctor_id(docId);
		String name = request.getParameter("dname");
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
		newdoc.setName(name);

		 String dateFormat = "dd/MM/yyyy";
		    try {
				newdoc.setDate(new SimpleDateFormat(dateFormat).parse(request.getParameter("date")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		String sp = request.getParameter("speciality");
		try {
			Validator.checkCharLessThanTwenty(sp);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkDataOnlyString(sp);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setSpeciality(sp);
		String cy = request.getParameter("city");
		try {
			Validator.checkCharLessThanTwenty(cy);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkDataOnlyString(cy);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setCity(cy);
		// System.out.println("Enter Phone_Number");
		String ph = request.getParameter("phone");
		try {
			Validator.checkStringForParseInt(ph);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setNumber(ph);
		// System.out.println("Enter Standard_Fees :");
		String fees = request.getParameter("fees");
		float fee = Float.parseFloat(fees);
		try {
			Validator.checkSalaryLessThanTenDigit(fee);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkSalaryOnlyNumbers((int) fee);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setStd_Fees(fee);
		int result = DoctorDao.insertDoctor(newdoc);
		System.out.println(result);
		out.println("<div> Add New Doctor : " + result + "</div>");
	}else if(request.getParameter("submit").equals("UPDATE")) {
		doPut(request,response);
	}else if(request.getParameter("submit").equals("DELETE")) {
		doDelete(request,response);
	}
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Doctor newdoc = new Doctor();
	//	System.out.println("Enter Doctor_Id :");
		String id = request.getParameter("Doc_Id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id);
		newdoc.setDoctor_id(Integer.parseInt(id));
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		Doctor doc = DoctorDao.getDoctorById(docId);
		if (doc == null) {
			System.out.println("Doctor Doesn't Exist For Id " + docId);
			return;
		}
		newdoc.setDoctor_id(docId);
	//	System.out.println("Enter Update Name :");
		String name = request.getParameter("Doc_Name");
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
		newdoc.setName(name);
		
	//	Calendar c1 = Calendar.getInstance();
	//	java.util.Date newDate = new java.util.Date();
	//	newdoc.setDate(newDate);
		 String dateFormat = "dd/MM/yyyy";
		    try {
				newdoc.setDate(new SimpleDateFormat(dateFormat).parse(request.getParameter("date")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
	//	System.out.println("Enter Update Speciality :");
		String sp =  request.getParameter("Speciality");
		try {
			Validator.checkCharLessThanTwenty(sp);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkDataOnlyString(sp);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setSpeciality(sp);
		// newdoc.setSpeciality(sc.nextLine());
	//	System.out.println("Enter Update City :");
		String cy =  request.getParameter("City");
		try {
			Validator.checkCharLessThanTwenty(cy);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkDataOnlyString(cy);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setCity(cy);
	//	System.out.println("Enter Update Phone_Number");
		String ph =  request.getParameter("phone");
		try {
			Validator.checkStringForParseInt(ph);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setNumber(ph);
	//	System.out.println("Enter Update Standard_Fees :");
		String fees =  request.getParameter("fees");
		float fee = Float.parseFloat(fees);
		try {
			Validator.checkSalaryLessThanTenDigit(fee);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		try {
			Validator.checkSalaryOnlyNumbers((int)fee);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newdoc.setStd_Fees(fee);
		int result = DoctorDao.updateDoctor(newdoc);
		System.out.println(result);
		out.println("<div> Doctor Updated " + result + "</div>");
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Doctor newdoc = new Doctor();
	//	System.out.println("Enter Doctor_Id :");
		String id = request.getParameter("Doc_Id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id);
		newdoc.setDoctor_id(Integer.parseInt(id));
		try {
			Validator.checkNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		Doctor doc = DoctorDao.getDoctorById(docId);

		if (doc == null) {
			System.out.println("Doctor Doesn't Exist For Id " + docId);
			return;
		}
		newdoc.setDoctor_id(docId);
		int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
		System.out.println(result);
		out.println("<div> Doctor Deleted " + result + "</div>");
	}

}
