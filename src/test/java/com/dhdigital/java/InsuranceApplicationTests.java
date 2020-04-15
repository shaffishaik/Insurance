package com.dhdigital.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dhdigital.java.services.GenerateInsurance;

@SpringBootTest
class InsuranceApplicationTests {

	@Autowired
	private GenerateInsurance generateInsurance;
	
	@Test
	void contextLoads() {
	}

	
}
