package com.example.demo.Repositortyy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Login;

public interface LoginRepository  extends JpaRepository<Login ,Long> {
	
	@Query("SELECT l FROM Login l WHERE l.username = ?1")
    Login findByUsername(String username);

}
