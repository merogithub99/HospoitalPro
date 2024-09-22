package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

@GetMapping("/signupPatient")
public String signinPatient() {
	
	
	return "PatientSignup";
}
}
