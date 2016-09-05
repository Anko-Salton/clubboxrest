package com.clubboxrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clubboxrest.model.User;
import com.clubboxrest.model.mapper.UserInterface;

@Controller
public class TestController {

	@Autowired
	private UserInterface userInterface;
	
	@RequestMapping("test")
	@ResponseBody
	public String test(){
		User a = userInterface.findOne(1); 
		return a.getName();
	}
	

}
