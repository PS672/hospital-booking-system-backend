package com.example.demo.controllerr;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.AUser;
import com.example.demo.Model.Duser;
import com.example.demo.appointmentservice.Appointmentservice;





@RestController
@CrossOrigin("*")
@RequestMapping("/api/ahospital")
public class AController {
	
	private Appointmentservice service;

	public AController(Appointmentservice service) {
		super();
		this.service = service;
	}

	
	@PostMapping
	public ResponseEntity<AUser>savePatientdetails(@RequestBody AUser users){
		return new ResponseEntity<AUser>(service.saveAppointmentdetails(users),HttpStatus.CREATED);
	}
	
	//get all values
			@GetMapping
			public List<AUser>getalldoctordetails(){
				return service.getallAppointmentdetails();
			}
			
			
			@PutMapping("{id}")
			public ResponseEntity<AUser>updatePatientdetails(@PathVariable("id") long id,
			                          @RequestBody AUser  users){
			    return new ResponseEntity<AUser>(service.updateAppointmentdetails(users, id),HttpStatus.OK);
			}
			
			
			@DeleteMapping("{id}")
			public ResponseEntity<String> deleteAppointdetai(@PathVariable("id")long id){
				//delete id from DB
				service.deleteAppointdetail(id);
				return new ResponseEntity<String>("id is deleted",HttpStatus.OK);
			}
			
			@GetMapping("{id}")
			public ResponseEntity<AUser>getPatientdetailsbyid(@PathVariable("id")long patientid){
				return new ResponseEntity<AUser>(service.getAppointdetailsbyid(patientid),HttpStatus.OK);
			}
			
			@GetMapping("/details/{email}")
	        public AUser getByEmail(@PathVariable ("email") String user_email) {
	            return service.getByEmail(user_email);
	        }
			
			
			@GetMapping("/doctordetails/{name}")
	        public List<AUser> getByDoctorname(@PathVariable ("name") String doctor_name) {
	            return service.getByDoctorname(doctor_name);
	        }
			
			
}

