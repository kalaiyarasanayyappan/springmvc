package com.chainsys.springmvc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    private int doctor_id;
    private String name;
    private Date dob;
    private String speciality;
    private String city;
    private long phone_number;
    @Column(name = "std_fees")
    private float std_fees;

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

   

    public float getStd_fees() {
		return std_fees;
	}

	public void setStd_fees(float std_fees) {
		this.std_fees = std_fees;
	}

	@Override
    public String toString() {
        return String.format("%d, %s, %s,%s, %s, %s, %d", doctor_id, name, dob,speciality, city, phone_number, std_fees);
    }
}