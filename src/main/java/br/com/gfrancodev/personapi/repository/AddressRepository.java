package br.com.gfrancodev.personapi.repository;

import br.com.gfrancodev.personapi.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressEntity, UUID> {

}

