package com.example.renal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.User;
import com.example.renal.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public String testarServico(Long id) {

		User user = new User();
	
		Optional<User> users = userRepository.findById(id);
		
		return users.toString();
		
	 }
	

}


