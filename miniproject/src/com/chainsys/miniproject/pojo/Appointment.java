package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment extends Doctor{
private int appoint_Id;
private Date appoint_Date;
private int doctor_Id;
private String patient_Name;
private String fees_Collected;

public int getAppoint_Id() {
	return appoint_Id;
}
public void setAppoint_Id(int appoint_Id) {
	this.appoint_Id = appoint_Id;
}
public Date getAppoint_Date() {
	return appoint_Date;
}
public void setAppoint_Date(Date appoint_Date) {
	this.appoint_Date = appoint_Date;
}
public int getDoc_Id() {
	return doctor_Id;
}
public void setDoc_Id(int doc_Id) {
	this.doctor_Id = doc_Id;
}
public String getPatient_Name() {
	return patient_Name;
}
public void setPatient_Name(String patient_Name) {
	this.patient_Name = patient_Name;
}
public void setFees_Collected(String fees) {
	// TODO Auto-generated method stub
	this.fees_Collected=fees;
}
public String getFees_Collected() {
	// TODO Auto-generated method stub
	return fees_Collected;
}

}
