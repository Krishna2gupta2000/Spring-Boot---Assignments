package com.topgear.assignment4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employee")
	public String creatingEmployee(Employee employee) { //@RequestBody Employee employee//@ModelAttribute int id,@ModelAttribute String name,@ModelAttribute String email,@ModelAttribute String location
		employeeRepository.save(employee);
		System.out.println("saved!");
		return "Saved Successully";
	}
	
	@GetMapping("/displayAll")
	public List<Employee> displayAll(){
		return employeeRepository.findAll();
	}
	@GetMapping("/display/{userid}")
	public Optional<Employee> getEmployeeById(@PathVariable int userid) {
		
		return employeeRepository.findById(userid);
	}
	
	
	
}
 	