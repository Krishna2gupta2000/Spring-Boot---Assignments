package com.topgear.assignment5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
	
	@Autowired 
	private Map<Integer,Employee> employees;
	
	@GetMapping("/employees")
	public Map<Integer,Employee> displayEmployees(){
		return employees;
	}
	@GetMapping("/employees/{empid}")
	public Employee displayEmployee(@PathVariable int empid){
		return employees.get(empid);
	}
	@PostMapping("/employees")
	public Map<Integer,Employee> createEmployees(@RequestBody EmployeeWithId empId){
		
		employees.put(empId.getId(),empId.getEmployee());

		return employees;
	}
	
	@PutMapping("/employees")
	public String updateEmployees(@RequestBody EmployeeWithId empId){
		if(employees.containsKey(empId.getId())) {
			employees.put(empId.getId(),empId.getEmployee());
			return "Updated Successfully";
		}
		else {
			return "Employee with ID: "+empId.getId()+" not Exists!";
		}
	}
	@DeleteMapping("/employees/{empid}")
	public String deleteEmployee(@PathVariable int empid){
		if(employees.containsKey(empid)) {
			employees.remove(empid);
			return "Employee with Id: "+empid+" removed Successfully";
		}
		else {
			return "Employee with ID: "+empid+" not Exists!";
		}
	}
	
}
 	