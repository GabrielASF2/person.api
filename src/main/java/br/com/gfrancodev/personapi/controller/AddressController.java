package br.com.gfrancodev.personapi.controller;

import br.com.gfrancodev.personapi.entity.AddressEntity;
import br.com.gfrancodev.personapi.repository.AddressRepository;
import br.com.gfrancodev.personapi.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/address")
    public List<AddressEntity> getAddress() {
        return addressService.getAddress();
    }

    @GetMapping("/address/{id}")
    public Optional<AddressEntity> getAddressById(@PathVariable UUID id) {
        return addressService.getAddressById(id);
    }

    @PostMapping("/address")
    public AddressEntity newAddress(@RequestBody AddressEntity address) {
        return addressService.newAddress(address);
    }

    @PutMapping("/address")
    public AddressEntity editAddress(@RequestBody AddressEntity address) {
        return addressService.editAddress(address);
    }

    @DeleteMapping("/address/{id}")
    public void delAddress(@PathVariable UUID id) {
        addressService.delAddress(id);
    }
}
