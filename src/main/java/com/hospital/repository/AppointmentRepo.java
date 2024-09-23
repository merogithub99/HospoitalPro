package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long>{

}
