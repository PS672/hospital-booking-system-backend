package com.example.demo.Repositortyy;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.Model.Puser;




// @EnableJpaRepositories
public interface PRepository extends JpaRepository<Puser ,Long>{

//	user findByEmailAddress(String EmailAddress);
//	user save(user users);
	
	
	
}
