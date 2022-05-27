package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.common.InvalidInputDataException;
import com.chainsys.miniproject.common.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class AppointmentUi {
	public static void addNewAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
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
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newap.setAppoint_Date(newDate);
			System.out.println("Enter Doctor_Id :");
			String id1 = sc.nextLine();
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
			System.out.println("Enter Patient Name :");
			String name = sc.nextLine();
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
			System.out.println("Enter Fees Collected :");
			String fees = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}

			newap.setFees_Collected(fees);
			int result = AppointmentDao.insertAppointment(newap);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
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
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newap.setAppoint_Date(newDate);
			System.out.println("Enter Update Doctor_Id :");
			String id1 = sc.nextLine();
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
			System.out.println("Enter Update Patient Name :");
			String name = sc.nextLine();
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
			System.out.println("Enter Update Fees Collected :");
			String fees = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}

			newap.setFees_Collected(fees);
			int result = AppointmentDao.updateAppointment(newap);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updatePatientName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment Id :");
			String id = sc.nextLine();
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
			System.out.println("Enter Update Patient Name :");
			String name = sc.nextLine();
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
			int result = AppointmentDao.updatePatientName(Integer.parseInt(id), name);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateFeesCollected() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
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
			System.out.println("Enter Update Fees :");
			String fees = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}

			newap.setFees_Collected(fees);
			int result = AppointmentDao.updateFeesCollected(Integer.parseInt(id), fees);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void deleteAppointment() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
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
		} finally {
			sc.close();
		}
	}

	public static void getPatientById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Appointment newap = new Appointment();
			System.out.println("Enter Appointment_id :");
			String id = sc.nextLine();
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
			Appointment result = AppointmentDao.getPatientById(Integer.parseInt(id));
			System.out.println(result.getAppoint_Id() + " " + result.getAppoint_Date() + " " + result.getDoc_Id() + " "
					+ result.getPatient_Name() + " " + result.getFees_Collected());
		} finally {
			sc.close();
		}
	}

	public static void getAllAppointmentDetails() {
		List<Appointment> allAppointments = AppointmentDao.getAllAppoinments();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			System.out.println(ap.getAppoint_Id() + " " + ap.getAppoint_Date() + " " + ap.getDoc_Id() + " "
					+ ap.getPatient_Name() + " " + ap.getFees_Collected());
		}
	}

	public static void getInnerJoinDoctorAndAppointment() {
		List<Appointment> allAppointments = AppointmentDao.getInnerJoinDoctorAndAppointment();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}

	public static void getLeftOuterJoinDoctorAndAppointment() {
		List<Appointment> allAppointments = AppointmentDao.getLeftOuterJoinDoctorAndAppointment();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}

	public static void getRightOuterJoinDoctorAndAppointment() {
		List<Appointment> allAppointments = AppointmentDao.getRightOuterJoinDoctorAndAppointment();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}

	public static void getFullOuterJoinDoctorAndAppointment() {
		List<Appointment> allAppointments = AppointmentDao.getFullOuterJoinDoctorAndAppointment();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			System.out.println(ap.getDoc_Id() + " " + ap.getName() + " " + ap.getDate() + " " + ap.getSpeciality() + " "
					+ ap.getCity() + " " + ap.getNumber() + " " + ap.getStd_Fees() + " " + ap.getAppoint_Id() + " "
					+ ap.getAppoint_Date() + " " + ap.getDoc_Id() + " " + ap.getPatient_Name() + " "
					+ ap.getFees_Collected());
			// select
			// a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_colle
		}
	}
}
