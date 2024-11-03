package com.regform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regform.entity.RegistrationForm;

public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, Long> {

}
