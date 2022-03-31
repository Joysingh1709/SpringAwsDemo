package com.demoProj.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping
	public String helloWorl() {
		return "Hello From Spring Project";
	}

}
