package com.regform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regform.entity.RegistrationForm;
import com.regform.repository.RegistrationFormRepository;

@Service
public class RegistrationServicesImpl implements RegistrationServices {
	@Autowired
	private RegistrationFormRepository regRepo;

	@Override
	public void saveRegistration(RegistrationForm registration) {
		regRepo.save(registration);
		
	}

}
