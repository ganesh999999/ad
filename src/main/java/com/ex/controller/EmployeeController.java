package com.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("employee")
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/emp")
	public String emp() {
		return "hiiii";
	}
}
