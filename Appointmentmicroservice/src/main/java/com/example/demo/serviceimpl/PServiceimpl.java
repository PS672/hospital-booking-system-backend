

package com.example.demo.serviceimpl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.example.demo.Model.Puser;
import com.example.demo.Repositortyy.PRepository;
import com.example.demo.appointmentservice.PPatientService;
import com.example.demo.resourceexecption.ResourceNotFoundException;

//import com.example.demo.util.Jwtutil;
//@Service
@Component
public class PServiceimpl implements PPatientService {
	@Autowired
	private PRepository repository;
	
	
//	
//	@Autowired
//	private  PasswordEncoder  passwordEncoder;
//	@Autowired
//	private Jwtutil jwtutil;
	public PServiceimpl() {}

	public PServiceimpl(PRepository repository) {
		super();
		this.repository = repository;
	}
	
//	///password encoder
//	public Serviceimpl(PasswordEncoder  passwordEncoder) {
//		this.passwordEncoder=passwordEncoder;
//	}
//	
	
	
	

	@Override
	public Puser savePatientdetails(Puser users) {
		
		return repository.save(users);
	}

	@Override
	public List<Puser> getallPatientdetails() {
		
		return repository.findAll();
	}

	@Override
	public Puser updatePatientdetails(Puser users, long id) {
		Puser existPatientdetails=repository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("users","Id",id));
		existPatientdetails.setFirstName(users.getFirstName());
		existPatientdetails.setLastName(users.getLastName());
		
		existPatientdetails.setPhoneNumber(users.getPhoneNumber());
		
		existPatientdetails.setEmailAddress(users.getEmailAddress());
		existPatientdetails.setPassword(users.getPassword());
		
		repository.save(existPatientdetails);
		return existPatientdetails;
	}

	@Override
	public void deletePatientdetail(long id) {
             repository.findById(id).orElseThrow(()->new ResourceNotFoundException("user","Id",id));
		
		      repository.deleteById(id);
		
	}

	@Override
	public Puser getPatientdetailsbyid(long id) {
		Optional<Puser>users=repository.findById(id);
		if(users.isPresent()) {
			return users.get();
		}
		
		else {
			throw new ResourceNotFoundException("user","Id",id);
		}
	}

//	public String login(String EmailAddress,String Password) {
//        user users = repository.findByEmailAddress(EmailAddress);
//        System.out.println("Email entered is " + EmailAddress);
//        if(users == null) {
//            throw new IllegalArgumentException("Invalid Email/ password");
//        }
//        else if(!passwordEncoder.matches(Password, users.getPassword())) {
//            throw new IllegalArgumentException("Wrong email and password");
//        }
//        return jwtutil.generateToken(users.getEmailAddress());
//    }
//	
//	

}
