package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctor {
private int doctor_id;
private String name;
private Date date;
private String speciality;
private String city;
private String number;
private float std_Fees;
public int getDoctor_id() {
	return doctor_id;
}
public void setDoctor_id(int doctor_id) {
	this.doctor_id = doctor_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public float getStd_Fees() {
	return std_Fees;
}
public void setStd_Fees(float std_Fees) {
	this.std_Fees = std_Fees;
}

}
