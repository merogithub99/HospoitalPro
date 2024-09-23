package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer>{
	
	Patient findByNameAndPassword(String name, String password);

}
