package com.example.renal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.renal.entity.User;
import com.example.renal.service.UserService;

@Controller
@RestController
@RequestMapping("/renal")
public class UserController {
	@Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work
 
	//-------------------Return all users--------------------------------------------------------
    
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAll();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    
  //-------------------Retrieve Single User--------------------------------------------------------
	
  	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<User> getUser(@PathVariable("id") long id) {
  		System.out.println("Fetching User with id " + id);
  		User user = userService.findById(id);
  		if (user == null) {
  			System.out.println("User with id " + id + " not found");
  			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
  		}
  		return new ResponseEntity<User>(user, HttpStatus.OK);
  	}
 
}

