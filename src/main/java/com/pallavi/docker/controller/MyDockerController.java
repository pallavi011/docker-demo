package com.pallavi.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDockerController {
	@GetMapping(value = "/docker")
	public String getData() {
		return "success docker";
	}

}
