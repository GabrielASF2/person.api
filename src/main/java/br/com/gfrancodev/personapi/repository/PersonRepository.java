package br.com.gfrancodev.personapi.repository;

import br.com.gfrancodev.personapi.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {

}
