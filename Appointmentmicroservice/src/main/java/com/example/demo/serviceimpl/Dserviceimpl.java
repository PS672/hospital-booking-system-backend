package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Duser;
import com.example.demo.Repositortyy.DRepository;
import com.example.demo.appointmentservice.DDoctorService;
import com.example.demo.resourceexecption.ResourceNotFoundException;


@Service
public class Dserviceimpl implements DDoctorService{
	private DRepository repository;

	public Dserviceimpl(DRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Duser saveDoctordetails(Duser users) {
		// TODO Auto-generated method stub
		return repository.save(users);
	}

	@Override
	public List<Duser> getalldoctordetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Duser updatedoctordetails(Duser users, long id) {
		
		Duser existPatientdetails=repository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("users","Id",id));
		existPatientdetails.setName(users.getName());	
		existPatientdetails.setPhoneNumber(users.getPhoneNumber());
		existPatientdetails.setEmailAddress(users.getEmailAddress());
		existPatientdetails.setPassword(users.getPassword());
		existPatientdetails.setSpecialization(users.getSpecialization());
//		existPatientdetails.setExperience(users.getExperience());
		existPatientdetails.setAvalibility(users.getAvalibility());
		repository.save(existPatientdetails);
		return existPatientdetails;
	}

	@Override
	public void deleteDoctordetail(long id) {
		repository.findById(id).orElseThrow(()->new ResourceNotFoundException("user","Id",id));
		
	      repository.deleteById(id);
	}

	@Override
	public Duser getDoctordetailsbyid(long id) {
		Optional<Duser>users=repository.findById(id);
		if(users.isPresent()) {
			return users.get();
		}
		
		else {
			throw new ResourceNotFoundException("user","Id",id);
		}
	}

}
