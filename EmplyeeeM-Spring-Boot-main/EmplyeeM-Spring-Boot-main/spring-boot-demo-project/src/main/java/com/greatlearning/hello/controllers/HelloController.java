package com.greatlearning.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.hello.Entity.Hello;

@RestController
public class HelloController {

	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return ("Hello World! 123");
	}

	@PostMapping("/customHelloWorld")
	public Hello customGetHelloWorld(int id, String name) {
		return new Hello(id, name);
	}

}
