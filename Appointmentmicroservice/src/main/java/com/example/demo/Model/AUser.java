package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Appointment_Details")
public class AUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="userEmail")
	private String userEmail;
	
	@Column(name="patientName")
	private String patientName;
	
	@Column(name="patientAge")
	private int patientAge;
	
	@Column(name="patientGender")
	private String patientGender;
	
	@Column(name="doctorName")
	private String doctorName;
	
	
	@Column(name="appointmentDate")
	private String appointmentDate;
	
	@Column(name="appointmentSlot")
	private String appointmentSlot;
	
	
	
	public AUser() {
		
	}
	
	
	
	

	public AUser(int id, String userEmail, String patientName, int patientAge, String patientGender, String doctorName,
			String appointmentDate, String appointmentSlot) {
		super();
		Id = id;
		this.userEmail = userEmail;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.appointmentSlot = appointmentSlot;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentSlot() {
		return appointmentSlot;
	}

	public void setAppointmentSlot(String appointmentSlot) {
		this.appointmentSlot = appointmentSlot;
	}
	
	

	
	
}