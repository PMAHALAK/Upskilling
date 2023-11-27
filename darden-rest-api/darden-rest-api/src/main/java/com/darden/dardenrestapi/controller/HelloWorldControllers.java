package com.darden.dardenrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;

// By using the both controller and responseBody we can use the RestController@Controller
//@ResponseBody
@RestController
public class HelloWorldControllers {
	
	//HTTP GET Request
	//http://localhost:8080//hello-world
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return"HelloWorld";
		
	}
	

}
