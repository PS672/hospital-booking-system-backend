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
@Table(name="Patient_Details")
public class Puser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PatientId")
	private int PatientId;
	
	@Column(name="first_name")
	private String FirstName;
	
	@Column(name="last_name")
	private String LastName;

	
	@Column(name="PhoneNumber")
	private long PhoneNumber;

	@Column(name="EmailAddress")
	private String EmailAddress;
	
	@Column(name="Password")
	private String Password;
	
	
	
	public Puser() {
		
	}




	


	public Puser(int patientId, String firstName, String lastName, long phoneNumber, String emailAddress,
			String password) {
		super();
		PatientId = patientId;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		EmailAddress = emailAddress;
		Password = password;
		
	}







	public int getPatientId() {
		return PatientId;
	}







	public void setPatientId(int patientId) {
		this.PatientId = patientId;
	}







	public String getFirstName() {
		return FirstName;
	}







	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}







	public String getLastName() {
		return LastName;
	}







	public void setLastName(String lastName) {
		this.LastName = lastName;
	}







	public long getPhoneNumber() {
		return PhoneNumber;
	}







	public void setPhoneNumber(long phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}







	public String getEmailAddress() {
		return EmailAddress;
	}







	public void setEmailAddress(String emailAddress) {
		this.EmailAddress = emailAddress;
	}







	public String getPassword() {
		return Password;
	}







	public void setPassword(String password) {
		Password = password;
	}







	@Override
	public String toString() {
		return "user [PatientId=" + PatientId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", PhoneNumber="
				+ PhoneNumber + ", EmailAddress=" + EmailAddress + ", Password=" + Password + "]";
	}

	
	
	
	
}
	
	
	
	
	