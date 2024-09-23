package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.model.Patient;
import com.hospital.repository.PatientRepo;

@Controller
public class PatientController {
	@Autowired
	PatientRepo patientRepo;

	@GetMapping("/PatientSignup")
	public String signupatient() {
		return "PatientSignup";
	}

	@GetMapping("/PatientLogin")
	public String loginPatient() {
		return "PatientLogin";
	}
	
	
	@PostMapping("/postPatientSignup")
	public String postPatientSignup(@ModelAttribute Patient patient) {
		
		patientRepo.save(patient);
		return "PatientLogin";
	}
	
	@PostMapping("/postPatientLogin")
	public String postPatientLogin(@ModelAttribute Patient patient,Model model) {
		
		Patient p= patientRepo.findByNameAndPassword(patient.getName(), patient.getPassword());
		
		if(p!=null) {
			model.addAttribute("p",p.getName());
			return "PatientHome";
		}
		model.addAttribute("msg","not valid patient");
		
		return "PatientLogin";
	}
	
	
}
