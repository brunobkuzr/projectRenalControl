package com.example.renal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.renal.repository.UserRepository;
import com.example.renal.service.UserService;

@SpringBootApplication
public class ProjectRenalApplication {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjectRenalApplication.class, args);
	}
	
	@Autowired
	private UserService userServie;
	

	
}
