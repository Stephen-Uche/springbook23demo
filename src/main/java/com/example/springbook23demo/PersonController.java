package com.example.springbook23demo;

import com.example.springbook23demo.entity.Person;
import com.example.springbook23demo.repository.PersonRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/names")
public class PersonController {

    private final PersonRepository repo;

    public PersonController(PersonRepository personRepository) {
        repo = personRepository;
    }

    @GetMapping("/{id}")
    Person getAName(@PathVariable long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping()
    List<Person> getNames(){
        return repo.findAll();
    }
    @PostMapping()
    void addName(@RequestBody Person person) {
        repo.save(person);
    }

    @GetMapping("/lang")
    String preferredLanguage(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String lang) {

        return lang;
    }

}
