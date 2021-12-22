package edu.kpi.iasa.mmsa.bd.car.delership.model;

import lombok.ToString;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "models")
@ToString
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Valid
    private Long Id;
    @Column(name = "name")
    @Valid
    private String Name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
