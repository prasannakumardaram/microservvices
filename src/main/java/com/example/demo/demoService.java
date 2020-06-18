package com.example.demo;

import reactor.core.publisher.Flux;

public interface demoService {

	Flux<DemoClass> getAll() throws Exception;

	
}
