package br.com.gfrancodev.personapi.service;

import br.com.gfrancodev.personapi.entity.AddressEntity;
import br.com.gfrancodev.personapi.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<AddressEntity> getAddress() {
        return addressRepository.findAll();
    }

    public Optional<AddressEntity> getAddressById(UUID id) {
        return addressRepository.findById(id);
    }

    public AddressEntity newAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public AddressEntity editAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public void delAddress(UUID id ) {
        addressRepository.deleteById(id);
    }
}
