package br.com.gfrancodev.personapi.service;

import br.com.gfrancodev.personapi.entity.PersonEntity;
import br.com.gfrancodev.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<PersonEntity> getUsers() {
        return personRepository.findAll();
    }

    public PersonEntity getUserById(Long id) {
        return personRepository.getById(id);
    }

    public PersonEntity newUser(PersonEntity person) {
        return personRepository.save(person);
    }

    public PersonEntity editUser(PersonEntity person) {
        return personRepository.save(person);
    }

    public void delUser(Long id) {
        personRepository.deleteById(id);
    }
}

