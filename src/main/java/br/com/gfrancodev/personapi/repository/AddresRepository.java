package br.com.gfrancodev.personapi.repository;

import br.com.gfrancodev.personapi.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddresRepository extends JpaRepository<AddressEntity, Long> {

}

