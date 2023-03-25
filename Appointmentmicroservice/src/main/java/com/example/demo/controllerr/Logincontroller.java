package com.example.demo.controllerr;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Duser;
import com.example.demo.Model.Login;
import com.example.demo.appointmentservice.Loginservice;



@RestController

@RequestMapping("/api/usecase")
@CrossOrigin("*")
public class Logincontroller {
	private Loginservice loginservice;

	public Logincontroller(Loginservice loginservice) {
		super();
		this.loginservice = loginservice;
	}
	
	
	@PostMapping
	public ResponseEntity<Login>savePatientdetails(@RequestBody Login users){
		return new ResponseEntity<Login>(loginservice.savelogin(users),HttpStatus.CREATED);
	}
	
	
	@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login login) {
        String username = login.getUsername();
        String password = login.getPassword();
        boolean isAuthenticated = loginservice.authenticateUser(username , password);

        if (isAuthenticated) {
            // return success response
            return ResponseEntity.ok("User authenticated successfully");
        } else {
            // return error response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

}
