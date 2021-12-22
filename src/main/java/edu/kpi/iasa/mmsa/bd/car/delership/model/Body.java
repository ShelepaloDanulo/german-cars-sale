package edu.kpi.iasa.mmsa.bd.car.delership.model;

import lombok.ToString;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "body_type")
@ToString
public class Body {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Valid
    private Long Id;
    @Column(name = "wheels")
    @Valid
    private Long wheels;
    @Column(name = "name")
    @Valid
    private String Name;

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public Long getWheels() {
        return wheels;
    }

    public String getName() {
        return Name;
    }
}
