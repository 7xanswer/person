package com.example.person.repositories;

import com.example.person.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByName(String name);
  }
