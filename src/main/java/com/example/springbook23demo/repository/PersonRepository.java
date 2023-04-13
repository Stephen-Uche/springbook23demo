package com.example.springbook23demo.repository;

import com.example.springbook23demo.entity.Person;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PersonRepository extends ListCrudRepository<Person, Long> {
    List<Person> findByName(String name);
}
