package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Login;
import com.example.demo.Repositortyy.LoginRepository;
import com.example.demo.appointmentservice.Loginservice;
@Service
public class Loginserviceimpl implements Loginservice {
	
	private LoginRepository loginRepository;
	
	

	public Loginserviceimpl(LoginRepository loginRepository) {
		super();
		this.loginRepository = loginRepository;
	}



	@Override
	public Login savelogin(Login users) {
		
		return  loginRepository.save(users);
	}



	@Override
	public boolean authenticateUser(String username, String password) {
		
		Login login=loginRepository.findByUsername(username);
		if (login == null || !login.getPassword().equals(password)) {
            return false;
        }
        return true;
	}

}
