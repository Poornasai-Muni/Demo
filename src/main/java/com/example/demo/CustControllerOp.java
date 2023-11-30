package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustControllerOp {
	
	@RequestMapping(path="/product")
	
		
		@GetMapping(path="/details")
		public String Accountdetails() {
			return "Product details";
		}
	
	@GetMapping(path="/moredetails")
	public String ProDetails() {
		return "ProductDeailsssss  Microoo";
	}}
