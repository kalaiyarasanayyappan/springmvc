package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
    
    @Autowired
    DoctorService drService;
    
    @GetMapping("/getdoctor")
    public String getDoctor(@RequestParam("id")int id,Model model) {
        Doctor dr =drService.findById(id);
        model.addAttribute("getdoctor",dr);
        return "find-doctor-by-id";
    }
    @GetMapping("/deletedoctor")
    public String deleteDoctor(@RequestParam("id")int id) {
        drService.deleteById(id);
         return "redirect:/doctor/getalldoctors";
    }
    @GetMapping("/addform")
    public String showAddForm(Model model) {
        Doctor dr = new Doctor();
        model.addAttribute("adddoc",dr);
        return "add-doctor-form";
    }
    @PostMapping("/adddoctor")
    public String addDoctor(@ModelAttribute("adddoctor")Doctor dr)
    {
     drService.save(dr);
     return "redirect:/doctor/getalldoctors";
    }
    @GetMapping("/updateform")
    public String showUpdateForm(@RequestParam("id")int id,Model model) {
        Doctor dr = drService.findById(id);
        model.addAttribute("updatedoctor",dr);
        return "update-doctor-form";
    }
    @PostMapping("/updatedoctor")
    public String modifyDoctor(@ModelAttribute("updatedoctor") Doctor dr)
    {
        drService.save(dr);
     return "redirect:/doctor/getalldoctors";
     
    }
    @GetMapping("/getalldoctors")
    public String getAllDoctors(Model model){
        List<Doctor> drList= drService.findAllDoctors();
        model.addAttribute("alldoctors",drList);
        return "list-doctors";
    } 
    @GetMapping("/getdocapp")
    public String getAppointments(@RequestParam("id")int id,Model model) {
        DoctorAppointmentsDTO dto = drService.getDoctorAndAppointments(id);
        model.addAttribute("getdoctor",dto.getDoctor());
        model.addAttribute("applist",dto.getAppointments());
        return "list-doctor-app";
    }
 // localhost:8080/doctor/trans?id=666 --> Here we need to give which id not have in doctor table
    @GetMapping("/trans")
    public void testTransaction(@RequestParam("id") int id) {
        DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
        Doctor dr = new Doctor();
        dr.setDoctor_id(id);
        dr.setName("Kalai");
        Date dt = new Date(97,8,14);
        dr.setDob(dt);
        dr.setSpeciality("Dentist");
        dr.setCity("Chennai");
        dr.setPhone_number(9988998899l);
        dr.setFees(70000);
        dto.setDoctor(dr);
         List<Appointment> appList = new <Appointment>ArrayList();
       // int nextAppId = drService.getNextAppointmentId();
        for(int i=0;i<=2;i++) {
            Appointment ap = new Appointment();
            ap.setId(i);
            Date date = new Date(22,7,25);
            ap.setAppoint_date(date);
            ap.setDoctor_id(id);
            ap.setPatient_name("Bruce");
            ap.setFees_collected(i*500);
            dto.addAppointment(ap);
        }
        drService.addDoctorAndAppointments(dto);
        System.out.println("Successfully completed!!!");
    }
    /*
     * 
     * http://localhost:8080/doctor/getalldoctors
     * http://localhost:8080/doctor/addform
     * http://localhost:8080/doctor/getdoctor?id=1200
     * http://localhost:8080/doctor/deletedoctor?id=681
     */
}