package com.example.demo.appointmentservice;

import com.example.demo.Model.Duser;
import com.example.demo.Model.Login;

public interface Loginservice {
	
	Login savelogin(Login users);
	
	boolean authenticateUser(String username,String password);

}
