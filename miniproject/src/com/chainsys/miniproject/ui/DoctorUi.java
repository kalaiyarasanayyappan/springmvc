package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.common.InvalidInputDataException;
import com.chainsys.miniproject.common.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class DoctorUi {
	public static void addNewDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
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
			System.out.println("Enter Update Name :");
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
			newdoc.setName(name);
			
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newdoc.setDate(newDate);
			System.out.println("Enter  Speciality :");
			String sp = sc.nextLine();
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
			System.out.println("Enter  City :");
			String cy = sc.nextLine();
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
			System.out.println("Enter Phone_Number");
			String ph = sc.nextLine();
			try {
				Validator.checkStringForParseInt(ph);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setNumber(ph);
			System.out.println("Enter  Standard_Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkSlaryOnlyNumbers((int)fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setStd_Fees(fees);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
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
			System.out.println("Enter Update Name :");
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
			newdoc.setName(name);
			
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newdoc.setDate(newDate);
			System.out.println("Enter Update Speciality :");
			String sp = sc.nextLine();
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
			System.out.println("Enter Update City :");
			String cy = sc.nextLine();
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
			System.out.println("Enter Update Phone_Number");
			String ph = sc.nextLine();
			try {
				Validator.checkStringForParseInt(ph);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setNumber(ph);
			System.out.println("Enter Update Standard_Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkSlaryOnlyNumbers((int)fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setStd_Fees(fees);
			int result = DoctorDao.updateDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
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
			System.out.println("Enter Update Name :");
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
			newdoc.setName(name);
			int result = DoctorDao.updateDoctorFirstName(Integer.parseInt(id), name);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFees() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
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
			System.out.println("Enter Update Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setStd_Fees(fees);
			int result = DoctorDao.updateDoctorFees(Integer.parseInt(id), fees);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void deleteDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
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
		} finally {
			sc.close();
		}
	}

	public static void getDoctorById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
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
			Doctor result = DoctorDao.getDoctorById(Integer.parseInt(id));
			System.out.println(result.getDoctor_id() + " " + result.getName() + " " + result.getDate() + " "
					+ result.getSpeciality() + " " + result.getCity() + " " + result.getNumber() + " "
					+ result.getStd_Fees());
		} finally {
			sc.close();
		}
	}

	public static void getAllDoctorDetails() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDoctor_id() + " " + dr.getName() + " " + dr.getDate() + " " + dr.getSpeciality()
					+ " " + dr.getCity() + " " + dr.getNumber() + " " + dr.getStd_Fees());
		}
	}
}
