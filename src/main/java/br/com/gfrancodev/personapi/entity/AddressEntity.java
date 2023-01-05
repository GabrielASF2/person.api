package br.com.gfrancodev.personapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class AddressEntity  implements Serializable {

    @Id
    @GeneratedValue
    private Long idAddress;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String cep;

    public Long getId() {
        return idAddress;
    }

    public void setId(Long id) {
        this.idAddress = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}