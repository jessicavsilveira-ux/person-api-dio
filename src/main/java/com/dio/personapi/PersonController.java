package com.dio.personapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository repository;

    @PostMapping
    public Person create(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping
    public List<Person> list() {
        return repository.findAll();
    }
}