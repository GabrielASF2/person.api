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

    @Column(nullable = false)
    private DateFormat birthDate;

    @Column(nullable = false)
    private String adress;

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

    public DateFormat getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateFormat birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
