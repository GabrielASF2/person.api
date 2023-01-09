package br.com.gfrancodev.personapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
public class AddressEntity  implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(nullable = true)
    private String street;

    @Column(nullable = true)
    private String number;

    @Column(nullable = true)
    private String city;

    @Column(nullable = true)
    private String cep;


}
