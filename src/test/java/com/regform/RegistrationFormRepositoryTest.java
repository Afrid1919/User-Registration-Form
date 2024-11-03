package com.regform;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.regform.entity.RegistrationForm;
import com.regform.repository.RegistrationFormRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RegistrationFormRepositoryTest {
	@Autowired
	private RegistrationFormRepository regrepo;
	@Test
	public void saveReg() {
		RegistrationForm R = new RegistrationForm("Pam","P","pam@gmail.com","Sangareddy","9010976316");
		regrepo.save(R);
	}

}
