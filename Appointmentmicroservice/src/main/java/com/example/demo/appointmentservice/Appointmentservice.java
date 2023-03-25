package com.example.demo.appointmentservice;

import java.util.List;

import com.example.demo.Model.AUser;
import com.example.demo.Model.Duser;



public interface Appointmentservice {
	
	//define
			AUser saveAppointmentdetails(AUser users);
			//get
			List<AUser>getallAppointmentdetails();
			
			//update
			AUser updateAppointmentdetails(AUser users,long id);
			
			//delete
			void deleteAppointdetail(long id);
			//get by id
			AUser getAppointdetailsbyid(long id);
			
			//useremail
			AUser getByEmail(String user_email);
			
			////userDoctorname		
			List<AUser> getByDoctorname(String doctor_name);

}
