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

import com.example.demo.Model.Duser;
import com.example.demo.appointmentservice.DDoctorService;




@CrossOrigin("*")
@RestController

@RequestMapping("/api/dhospital")
public class DController {
	
	private DDoctorService service;

	public DController(DDoctorService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Duser>savePatientdetails(@RequestBody Duser users){
		return new ResponseEntity<Duser>(service.saveDoctordetails(users),HttpStatus.CREATED);
	}
	
	//get all values
		@GetMapping
		public List<Duser>getalldoctordetails(){
			return service.getalldoctordetails();
		}
		
		@PutMapping("{id}")
		public ResponseEntity<Duser>updatePatientdetails(@PathVariable("id") long id,
		                          @RequestBody Duser users){
		    return new ResponseEntity<Duser>(service.updatedoctordetails(users, id),HttpStatus.OK);
		}

		
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteSpringproject(@PathVariable("id")long id){
			//delete id from DB
			service.deleteDoctordetail(id);
			return new ResponseEntity<String>("id is deleted",HttpStatus.OK);
		}
		
		@GetMapping("{id}")
		public ResponseEntity<Duser>getPatientdetailsbyid(@PathVariable("id")long patientid){
			return new ResponseEntity<Duser>(service.getDoctordetailsbyid(patientid),HttpStatus.OK);
		}
}
