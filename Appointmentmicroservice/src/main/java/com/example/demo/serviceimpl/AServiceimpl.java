package com.example.demo.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.resourceexecption.ResourceNotFoundException;
import com.example.demo.Model.AUser;
import com.example.demo.Model.Duser;
import com.example.demo.Repositortyy.ARepository;
import com.example.demo.appointmentservice.Appointmentservice;


@Service
public class AServiceimpl implements  Appointmentservice {
	private ARepository repository;

	public AServiceimpl(ARepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public AUser saveAppointmentdetails(AUser users) {
		
		return  repository.save(users);
	}

	@Override
	public List<AUser> getallAppointmentdetails() {
		
		return repository.findAll();
	}

	@Override
	public AUser updateAppointmentdetails(AUser users, long id) {
		AUser existPatientdetails=repository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("users","Id",id));
		existPatientdetails.setDoctorName(users.getDoctorName());
		existPatientdetails.setPatientAge(users.getPatientAge());
		existPatientdetails.setPatientGender(users.getPatientGender());
		existPatientdetails.setUserEmail(users.getUserEmail());
		existPatientdetails.setAppointmentDate(users.getAppointmentDate());
		existPatientdetails.setAppointmentSlot(users.getAppointmentSlot());
	
		repository.save(existPatientdetails);
		
		return existPatientdetails;
	}

	@Override
	public void deleteAppointdetail(long id) {
		
		repository.findById(id).orElseThrow(()->new ResourceNotFoundException("user","Id",id));
		
	      repository.deleteById(id);
	}

	@Override
	public AUser getAppointdetailsbyid(long id) {
		
		Optional<AUser>users=repository.findById(id);
		if(users.isPresent()) {
			return users.get();
		}
		
		else {
			throw new ResourceNotFoundException("user","Id",id);
		}
	}

	@Override
	public AUser getByEmail(String user_email) {
		  return repository.getByEmail(user_email);

	}

	@Override
	public List<AUser> getByDoctorname(String doctor_name) {
		
		return repository.getByDoctorname(doctor_name);
	}
	

}
