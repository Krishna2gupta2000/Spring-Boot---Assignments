package com.topgear.assignment2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Assignment2Controller {
	
	@GetMapping("/banks")
	public ModelAndView getBanks() {
		ModelAndView mv = new ModelAndView();
		List<String> banks = new ArrayList<String>();
		banks.add("Aditya Nagar");
		banks.add("Koramangala");
		banks.add("Ramanjaneyanagar");
		banks.add("M G Road");
		banks.add("Madhavanagar");
		banks.add("Electronic City Bangalore");
		banks.add("Sampangiramnagar");
		banks.add("Fort Branch");
		banks.add("Malleswaram");
		banks.add("Hanumanthanagar");
		mv.addObject("banks", banks);
		mv.setViewName("BankName");
		return mv;
	}
	
	@GetMapping("/services")
	public ModelAndView getServices() {
		ModelAndView mv = new ModelAndView();
		List<String> services = new ArrayList<String>();
		services.add("Domestic Treasury");
		services.add("Broking Services ");
		services.add("Revised Service Charges ");
		services.add("ATM Services ");
		services.add("Internet Banking ");
		services.add("E-Pay ");
		services.add("E-Rail ");
		services.add("Safe Deposit Locker");
		services.add("Foreign Inward Remittances");
		services.add("Sbi No Queue App Faq");
		mv.addObject("banks", services);
		mv.setViewName("BankName");
		return mv;
	}
	
}
