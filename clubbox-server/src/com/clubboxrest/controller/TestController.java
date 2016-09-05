package com.clubboxrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.clubboxrest.model.User;
import com.clubboxrest.model.mapper.UserInterface;

@Controller
public class TestController {

	@Autowired
	private UserInterface userInterface;
	
	@RequestMapping(value="/user",produces="application/json")
	public @ResponseBody Iterable<User> allUser(){
		return userInterface.findAll();
	}
	@RequestMapping(value = "/user/{id}", produces="application/json")
	public @ResponseBody User aUser(@PathVariable Integer id){
		return  userInterface.findOne(id); 
	}
	

}
