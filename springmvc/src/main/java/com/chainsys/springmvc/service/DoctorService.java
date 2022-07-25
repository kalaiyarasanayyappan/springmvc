package com.chainsys.springmvc.service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.springmvc.dao.AppointmentRepository;
import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;

@Service
public class DoctorService {
    
    @Autowired
    private DoctorRepository repo;
    @Autowired
    private AppointmentRepository aprepo;
    public List<Doctor> findAllDoctors(){
        List<Doctor> drList= repo.findAll();
        return drList;
    }
    @Transactional
    public Doctor save(Doctor dr) {
        repo.save(dr);
        return repo.save(dr);
    }
    public Doctor findById(int id) {
        return repo.findById(id);
    }
    @Transactional
    public void deleteById(int id) {
        repo.deleteById(id);
    }
    public DoctorAppointmentsDTO getDoctorAndAppointments(int id) {
        Doctor dr = findById(id);
        DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
        dto.setDoctor(dr);
        for(int i=0;i<=5;i++) {
            Appointment ap = new Appointment();
            ap.setId(id);
            Date date = new Date(22,7,25);
            ap.setAppoint_date(date);
            ap.setDoctor_id(id);
            ap.setPatient_name("Bruce");
            ap.setFees_collected(i*500);
            dto.addAppointment(ap);
        }
        return dto;
    }
     @Transactional
    public void addDoctorAndAppointments(DoctorAppointmentsDTO dto) {
        Doctor dr = dto.getDoctor();
        save(dr);
        List<Appointment> appList = dto.getAppointments();
        int count = appList.size();
        for(int i=0;i<count;i++) {
            aprepo.save(appList.get(i));
        }
    }
	
	//  public int getNextAppointmentId() { return aprepo.getNextId(); }
	  
}