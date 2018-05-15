package com.example.renal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.User;
import com.example.renal.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findById(long id) {
		User users = new User();
		 users = userRepository.findById(id).get();
		 return users ;
	}

	public List<User> findAll(){
		return userRepository.findAll();
	}
	
		
		
	 
	

}
