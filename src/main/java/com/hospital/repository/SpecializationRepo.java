package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Specialization;
@Repository
public interface SpecializationRepo extends JpaRepository<Specialization, Long> {

}
