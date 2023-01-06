package br.com.gfrancodev.personapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
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

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private List<AddressEntity> address;

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

    public Date getBirthDate() {
        return birthDate;
    }

   public void setBirthDate(Date birthDate) {
       this.birthDate = birthDate;
   }

    public List<AddressEntity> getAddress() {
        return address;
    }

    public void setAddress(List<AddressEntity> address) {
        this.address = address;
    }
}
