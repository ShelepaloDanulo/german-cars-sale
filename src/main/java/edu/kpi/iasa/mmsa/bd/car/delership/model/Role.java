package edu.kpi.iasa.mmsa.bd.car.delership.model;

import lombok.ToString;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "roles")
@ToString
public class Role {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Valid
    private Long Id;
    private String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
