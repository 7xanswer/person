package com.example.person;
import java.util.Optional;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import com.example.person.model.Person;
import com.example.person.controller.PersonController;
import com.example.person.repositories.PersonRepository;
import java.util.List;
import java.net.*;
import java.util.ArrayList;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
class PersonControllerTest{

  @Autowired
    PersonController personController;
  @Autowired
  PersonRepository personRepository;
    @Test
    void testPerson() throws URISyntaxException {


        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://127.0.0.1:8080/api/persons/609e6269cbef205664826e6a";

        URI uri = new URI(baseUrl);
 
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        Assertions.assertEquals(200, result.getStatusCodeValue());        

    }

    @Test
    void testPersons() throws URISyntaxException {

        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://127.0.0.1:8080/api/persons";

        URI uri = new URI(baseUrl);
 
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        Assertions.assertEquals(200, result.getStatusCodeValue());        

    }

    void testName() {


        List<Person> personne = personRepository.findByName("Ruchalski");

    }
    @Test
    @When("^the client calls /api/persons$")
    public void the_client_issues_GET_version() throws Throwable{

        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://127.0.0.1:8080/api/persons";

        URI uri = new URI(baseUrl);

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        Assertions.assertNotEquals(404, result.getStatusCodeValue());
    }
    @Test
    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of() throws Throwable {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://127.0.0.1:8080/api/persons";

        URI uri = new URI(baseUrl);

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        Assertions.assertEquals(200, result.getStatusCodeValue());
    }
}