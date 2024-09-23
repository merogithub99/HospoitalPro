package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.model.Specialization;
import com.hospital.repository.SpecializationRepo;

@Controller
public class SpecializationController {
	@Autowired
	private SpecializationRepo specializationRepo;

	@GetMapping("/getSpecialization")
	public String getSpecialization() {
		return "Specialization";
	}
	
	
	
	@PostMapping("/postSpecialization")
	public String postSpecialization(@ModelAttribute Specialization specialization , Model model) {
		specializationRepo.save(specialization);
		model.addAttribute("sp","successfully added specialization");
		return "DoctorHome";
	}
}
