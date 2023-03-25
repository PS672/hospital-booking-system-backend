package com.example.demo.controllerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Puser;
import com.example.demo.appointmentservice.PPatientService;

//import com.example.demo.model.Authentity;

//import com.example.demo.util.Jwtutil;

@RestController

@RequestMapping("/api/phospital")
@CrossOrigin("*")
public class PController {
	
	
	
//	 @Autowired
//	    private Jwtutil jwtutil;
//	 
//	    @Autowired
//	    private AuthenticationManager authenticationManager;
//	    
	    @Autowired
	private PPatientService service;

	public PController(PPatientService service) {
		super();
		this.service = service;
		
		
	}


	@PostMapping("/signup")
	public ResponseEntity<Puser>savePatientdetails(@RequestBody Puser users){
		return new ResponseEntity<Puser>(service.savePatientdetails(users),HttpStatus.CREATED);
	}

	//get all values
	@GetMapping
	public List<Puser>getallSpringproject(){
		return service.getallPatientdetails();
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Puser>updatePatientdetails(@PathVariable("id") long id,
	                          @RequestBody Puser users){
	    return new ResponseEntity<Puser>(service.updatePatientdetails(users, id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSpringproject(@PathVariable("id")long id){
		//delete id from DB
		service.deletePatientdetail(id);
		return new ResponseEntity<String>("id is deleted",HttpStatus.OK);
	}
	@GetMapping("{id}")
	public ResponseEntity<Puser>getPatientdetailsbyid(@PathVariable("id")long patientid){
		return new ResponseEntity<Puser>(service.getPatientdetailsbyid(patientid),HttpStatus.OK);
	}
	
	
	
	
	
//	
//	@PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody user users){
//        System.out.println("EMAILLL " + users.getEmailAddress());
//        String token =service.login(users.getEmailAddress(),users.getPassword());
//        System.out.println("TOKEN" + token);
//        return ResponseEntity.ok(token);
//    }
//	
//	
//	@PostMapping("/authenticate")
//    public String generateToken(@RequestBody Authentity authentity) throws Exception {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken( authentity.getEmailAddress(), authentity.getPassword())
//            );
//        } catch (Exception ex) {
//            throw new Exception("inavalid username/password");
//        }
//        return jwtutil.generateToken( authentity.getEmailAddress());
//	}
//	
	
	                          
}
