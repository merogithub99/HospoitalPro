package com.hospital.model;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_table")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private String gender;
	private Long phone;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String maritalStatus;
	private String presentAddress;
	private String communicationAddress;
	private String medicalHistory;
	private String otherMedicalHistory;
	
	
	public Patient() {
		
	}


	public Patient( String name, String password, String gender, Long phone, Date dob, String maritalStatus,
			String presentAddress, String communicationAddress, String medicalHistory, String otherMedicalHistory) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
		this.dob = dob;
		this.maritalStatus = maritalStatus;
		this.presentAddress = presentAddress;
		this.communicationAddress = communicationAddress;
		this.medicalHistory = medicalHistory;
		this.otherMedicalHistory = otherMedicalHistory;
	}
	

	public String getOtherMedicalHistory() {
		return otherMedicalHistory;
	}


	public void setOtherMedicalHistory(String otherMedicalHistory) {
		this.otherMedicalHistory = otherMedicalHistory;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getPhone() {
	    return phone;
	}

	public void setPhone(Long phone) {
	    this.phone = phone;
	}


	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

}
