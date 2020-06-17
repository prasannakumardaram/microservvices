package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Component
public class DemoServiceImpl implements demoService{
	
	@Autowired
	WebClient webClient;

	@Override
	public Flux<DemoClass> getAll() throws Exception{
		return webClient.get()
		        .uri("/todos")
		        .retrieve()
		        .bodyToFlux(DemoClass.class);
		
	}
}
