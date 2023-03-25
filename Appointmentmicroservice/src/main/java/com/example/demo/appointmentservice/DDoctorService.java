package com.example.demo.appointmentservice;

import java.util.List;

import com.example.demo.Model.Duser;



public interface DDoctorService {
	//define
		Duser saveDoctordetails(Duser users);
		//get
		List<Duser>getalldoctordetails();
		//update
		Duser updatedoctordetails(Duser users,long id);
		//delete
		
		//delete
		void deleteDoctordetail(long id);
		//get by id
		Duser getDoctordetailsbyid(long id);

}
