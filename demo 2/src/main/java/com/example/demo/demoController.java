package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class demoController {
	
	@Autowired
	demoService dmService;
	
	@GetMapping("/getallTodos")
	public Flux<DemoClass> getallTodos() throws Exception{
		
		return dmService.getAll();
	}
	
	@PostMapping("/addingTodos")
	public String posttodo(@RequestBody DemoClass demoClass) throws Exception{
		return null;
		
	}

}
