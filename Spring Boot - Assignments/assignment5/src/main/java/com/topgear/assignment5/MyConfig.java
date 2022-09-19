package com.topgear.assignment5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

   @Bean 
   public Map<Integer, Employee> myVal(){
	   Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
		
		employees.put(1,new Employee("Krishna","Krishna.gupta13@wipro.com","Gurgaon"));
		
      return employees;      
   }


}