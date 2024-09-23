package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.model.Appointment;
import com.hospital.repository.AppointmentRepo;

@Controller
public class AppointmentController {

	@Autowired
	AppointmentRepo appointmentRepo;

	@GetMapping("/addAppointment")
	public String addAppointment() {
		return "AddAppointment";
	}

	@PostMapping("/PostAddAppointment")
	public String postAddAppointment(@ModelAttribute Appointment appointment, Model model) {
		appointmentRepo.save(appointment);
		model.addAttribute("apt","appointment success!");
		return "PatientHome";
	}

}
