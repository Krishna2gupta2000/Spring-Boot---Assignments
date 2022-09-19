package com.topgear.assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment1Controller {

	@GetMapping("/name")
	public String bankName() {
		return "State Bank of India";
	}
	
	@GetMapping("/address")
	public String bankAddress() {
		return "18,MAIN BRANCH, BAREILLY, U. P. - 243 001";
	}
}
