package com.example.renal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.renal.service.UserService;

@RestController
@RequestMapping("/renal/user")
public class userController {

	@GetMapping(value = "/{id}")
	public String user(@PathVariable("id") Long id) {
		UserService  userService = new UserService();
		String name = "";
		name = userService.testarServico(id);
		return name;
	}

}

