package com.example.person;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.person.controller.PersonController;
import org.junit.jupiter.api.Assertions;
@SpringBootTest
@CucumberContextConfiguration
class PersonApplicationTests {

  @Autowired
    PersonController personController;

	@Test
	void contextLoads() {

		Assertions.assertNotNull(personController);
		
	}
}
