package com.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

	@GetMapping("/report")
	public String report() {
		
		return "Jai Shree Ram";
	}
}
