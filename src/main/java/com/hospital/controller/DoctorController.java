package com.hospital.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepo;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorRepo doctorRepo;
	
	
	@GetMapping("/DoctorSignup")
	public String signupDoctor() {
		return "DoctorSignup";
	}

    @PostMapping("/submitDoctorSignup")
    public String submitDoctorSignup(@ModelAttribute Doctor doctor) {
//    	, @RequestParam("photo") MultipartFile photoFile
//        try {
//            doctor.setPhoto(photoFile.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "error"; 
//        }
    	doctorRepo.save(doctor);
        return "DoctorLogin";  
    }
    
    @GetMapping("/doctorLogin")
    public String getLogin() {
    	
    	return "DoctorLogin";
    }
    
    @PostMapping("/postDoctorLogin")
    public String postLogin(@ModelAttribute Doctor doctor, Model model) {
    	Doctor d= doctorRepo.findByEmailAndPassword(doctor.getEmail(), doctor.getPassword());
    	if(d!=null) {
    		model.addAttribute("name", doctor.getName());
    		return "DoctorHome";
    	}
    	model.addAttribute("message","doctor not found");
    	return "DoctorLogin";
    }
}
