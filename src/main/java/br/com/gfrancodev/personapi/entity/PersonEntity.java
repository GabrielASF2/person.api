package br.com.gfrancodev.personapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class PersonEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @JsonFormat(pattern="dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date birthDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private List<AddressEntity> address;

}
