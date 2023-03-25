package com.example.demo.appointmentservice;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Puser;


@Service
public interface PPatientService {
	//define
	Puser savePatientdetails(Puser users);
	//get
	List<Puser>getallPatientdetails();
	//update
	Puser updatePatientdetails(Puser users,long id);
	//delete
	void deletePatientdetail(long id);
	//get by id
	Puser getPatientdetailsbyid(long id);
	
	////////////
//   String login(String EmailAddress,String Password);

}
