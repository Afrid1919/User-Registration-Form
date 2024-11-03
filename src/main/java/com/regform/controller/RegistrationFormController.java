package com.regform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regform.entity.RegistrationForm;
import com.regform.services.RegistrationServices;

@Controller
public class RegistrationFormController {
	@Autowired
	private RegistrationServices regServices;
	
	@RequestMapping("/viewregpage")
	public String viewRegPage() {
		return "reg";
	}
	@RequestMapping("/verifyReg")
	public String verifyReg(RegistrationForm registration,ModelMap model) {
		regServices.saveRegistration(registration);
		model.addAttribute("msg", "Your Data is saved successfully!");
		return "reg";
	}

}
