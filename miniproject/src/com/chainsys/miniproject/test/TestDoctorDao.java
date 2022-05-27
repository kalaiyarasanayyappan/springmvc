package com.chainsys.miniproject.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class TestDoctorDao {
   public static void testInsertDoctor() {
	   Doctor doc=new Doctor();
   	doc.setDoctor_id(101);
   	doc.setName("ajith");
	Calendar c1 =Calendar.getInstance();
   	java.util.Date newDate =new java.util.Date();
   	doc.setDate(newDate);
   	doc.setSpeciality("skin");
   	doc.setCity("Chennai");
   	doc.setNumber("88989768745");
   doc.setStd_Fees(10000);   
   	int result =DoctorDao.insertDoctor(doc);
   	System.out.println(result);
   }
   
   public static void testUpdateDoctor() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(456);
   	newdoc.setName("ramu");
	Calendar c1 =Calendar.getInstance();
   	java.util.Date newDate =new java.util.Date();
   	newdoc.setDate(newDate);
   	newdoc.setSpeciality("heart");
   	newdoc.setCity("Chennai");
   	newdoc.setNumber("98989768798");
   	newdoc.setStd_Fees(10000);   
   	int result =DoctorDao.updateDoctor(newdoc);
   	System.out.println(result);
   }
   
   public static void testUpdateDoctorName() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(456);
   	newdoc.setName("john");
   	int result =DoctorDao.updateDoctorFirstName(555,"mani");
   	System.out.println(result);
   }
   public static void testUpdateDoctorFees() {
	   Doctor newdoc=new Doctor();
   	newdoc.setDoctor_id(456);
   	newdoc.setStd_Fees(7000);
   	int result =DoctorDao.updateDoctorFees(456, 78000);
   	System.out.println(result);
   }
   
   public static void testDeleteDoctor() {
	//   Doctor newdoc=new Doctor();
   	int result =DoctorDao.deleteDoctor(666);
   	System.out.println(result);
   }
   
   public static void testGetDoctorById() {
	 	Doctor result =DoctorDao.getDoctorById(456);
	 	System.out.println(result.getDoctor_id()+" "+result.getName()+" "+result.getDate()+" "+result.getSpeciality()+" "+result.getCity()+" "+result.getNumber()+" "+result.getStd_Fees());
   }
   
   public static void testGetAllDoctors() {
  	 List<Doctor> allDoctors =DoctorDao.getAllDoctor();
  	 Iterator <Doctor> drIterator = allDoctors.iterator();
  	 while(drIterator.hasNext()) {
  		 Doctor dr =drIterator.next();
  		System.out.println(dr.getDoctor_id()+" "+dr.getName()+" "+dr.getDate()+" "+dr.getSpeciality()+" "+dr.getCity()+" "+dr.getNumber()+" "+dr.getStd_Fees());
  	 }
   }
}  

