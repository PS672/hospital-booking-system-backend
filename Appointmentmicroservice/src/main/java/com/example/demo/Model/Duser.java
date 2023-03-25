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
@Table(name="Doctor_Details")
public class Duser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="PhoneNumber")
	private String PhoneNumber;

	@Column(name="EmailAddress",unique=true)
	private String EmailAddress;
	
	@Column(name="Password")
	private String Password;
	
	@Column(name="Specialization")
	private String Specialization;
	
	@Column(name="avalibility")
	private String avalibility;
	
	

	
	
	
	public Duser() {
		
		
	}






	public Duser(int id, String name, String phoneNumber, String emailAddress, String password, String specialization,
			String avalibility) {
		super();
		Id = id;
		Name = name;
		PhoneNumber = phoneNumber;
		EmailAddress = emailAddress;
		Password = password;
		Specialization = specialization;
		this.avalibility = avalibility;
	}






	public int getId() {
		return Id;
	}






	public void setId(int id) {
		Id = id;
	}






	public String getName() {
		return Name;
	}






	public void setName(String name) {
		Name = name;
	}






	public String getPhoneNumber() {
		return PhoneNumber;
	}






	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}






	public String getEmailAddress() {
		return EmailAddress;
	}






	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}






	public String getPassword() {
		return Password;
	}






	public void setPassword(String password) {
		Password = password;
	}






	public String getSpecialization() {
		return Specialization;
	}






	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}






	public String getAvalibility() {
		return avalibility;
	}



	public void setAvalibility(String avalibility) {
		this.avalibility = avalibility;
	}
	
	
	


	
	



}
	
	
