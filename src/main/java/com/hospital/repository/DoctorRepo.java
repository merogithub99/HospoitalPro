package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
	
	Doctor findByEmailAndPassword(String email,String password);
	

}
