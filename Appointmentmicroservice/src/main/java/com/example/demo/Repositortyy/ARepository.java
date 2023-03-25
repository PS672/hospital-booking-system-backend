package com.example.demo.Repositortyy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.AUser;



public interface ARepository extends JpaRepository<AUser ,Long> {
	
	@Query(nativeQuery= true, value="SELECT * FROM appointment_Details WHERE user_email = ?1")

  AUser getByEmail(@Param ("user_email") String user_email);
	
	
	
	@Query(nativeQuery= true, value="SELECT * FROM appointment_Details WHERE doctor_name = ?1")

	  List<AUser> getByDoctorname(@Param ("doctor_name") String doctor_name);
		
	
	

}
