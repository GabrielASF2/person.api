package br.com.gfrancodev.personapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Data
@Entity
@NoArgsConstructor
public class AddressEntity  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = true)
    private String street;

    @Column(nullable = true)
    private String number;

    @Column(nullable = true)
    private String city;

    @Column(nullable = true)
    private String cep;


}
