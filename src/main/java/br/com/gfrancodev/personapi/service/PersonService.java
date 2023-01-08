package br.com.gfrancodev.personapi.service;

import br.com.gfrancodev.personapi.entity.AddressEntity;
import br.com.gfrancodev.personapi.entity.PersonEntity;
import br.com.gfrancodev.personapi.repository.AddressRepository;
import br.com.gfrancodev.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AddressRepository addressRepository;

    public List<PersonEntity> getUsers() {
        return personRepository.findAll();
    }

    public Optional<PersonEntity> getUserById(Long id) {

        final Optional<PersonEntity> person = personRepository.findById(id);
        return person;
    }

    public PersonEntity newUser(PersonEntity person) {
        return personRepository.save(person);
    }

    public PersonEntity addAddress(Long idPerson, Long idAddress) {
       PersonEntity person = personRepository.getReferenceById(idPerson);
       AddressEntity address = addressRepository.getReferenceById(idAddress);
       person.getAddress().add(address);

        return personRepository.save(person);
    }

    public PersonEntity editUser(PersonEntity person) {
        return personRepository.save(person);
    }

    public void delUser(Long id) {
        personRepository.deleteById(id);
    }
}

