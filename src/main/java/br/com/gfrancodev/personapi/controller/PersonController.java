package br.com.gfrancodev.personapi.controller;

import br.com.gfrancodev.personapi.entity.PersonEntity;
import br.com.gfrancodev.personapi.repository.PersonRepository;
import br.com.gfrancodev.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person")
    public List<PersonEntity> getUsers() {
        return personService.getUsers();
    }

    @GetMapping("/person/{id}")
    public PersonEntity getUserById(@PathVariable Long id) {
        return personService.getUserById(id);
    }

    @PostMapping("/person")
    public PersonEntity newUser(@RequestBody PersonEntity person) {
        return personService.newUser(person);
    }

    @PutMapping("/person")
    public PersonEntity ediUser(@RequestBody PersonEntity person) {
        return personService.editUser(person);
    }

    @DeleteMapping("/person/{id}")
    public void delUser(@PathVariable Long id) {
        personService.delUser(id);
    }

}
