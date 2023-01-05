package br.com.gfrancodev.personapi.service;

import br.com.gfrancodev.personapi.entity.AddressEntity;
import br.com.gfrancodev.personapi.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<AddressEntity> getAdrress() {
        return addressRepository.findAll();
    }

    public AddressEntity getAddressById(Long id) {
        return addressRepository.getById(id);
    }

    public AddressEntity newAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public AddressEntity editAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public void delAddress(Long id ) {
        addressRepository.deleteById(id);
    }
}
