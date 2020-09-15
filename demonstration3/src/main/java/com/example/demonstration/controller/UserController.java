package com.example.demonstration.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demonstration.dao.repository.UserRepository;
import com.example.demonstration.entities.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping(value="/add", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
	public String addUser(@RequestBody User user) {
		System.out.print(user.getLastName());
		userRepository.save(user);
		
		return "test";
	}
	
	/*@GetMapping (value="/get/{lastName}",  produces= MediaType.APPLICATION_JSON_VALUE)
	public User getUserbylastName(@PathVariable String lastName) {
		
	User user = userRepository.findByLastName(lastName).orElseThrow(() -> new UsernameNotFoundException("User not found"));
	
		return user;
	}*/
	
}
