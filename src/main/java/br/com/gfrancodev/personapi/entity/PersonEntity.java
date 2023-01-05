package br.com.gfrancodev.personapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.text.DateFormat;


@Entity
public class PersonEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    //@Column(nullable = false)
    //private String birthDate;

    @ManyToOne(optional = true)
    @JoinColumn(referencedColumnName = "id")
    private AddressEntity idAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // public String getBirthDate() {
   //     return birthDate;
   // }

   //public void setBirthDate(String birthDate) {
   //    this.birthDate = birthDate;
   //}

    public AddressEntity getAddress() {
        return idAddress;
    }

    public void setAddress(AddressEntity idAddress) {
        this.idAddress = idAddress;
    }
}
