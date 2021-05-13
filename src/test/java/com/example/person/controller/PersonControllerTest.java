package com.example.person;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Assertions;
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
public class PersonControllerTest{

  @Autowired
    PersonController personController;
  @Autowired
  PersonRepository personRepository;
    @Test
    void testPerson() throws URISyntaxException {


        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://127.0.0.1:8080/api/persons/609d89b93e5e577b068a85ae";

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

}