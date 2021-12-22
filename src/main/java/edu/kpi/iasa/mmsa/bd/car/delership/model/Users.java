package edu.kpi.iasa.mmsa.bd.car.delership.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

@Entity
@Table(name = "users")
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Valid
    private Long Id;
    @Column(name = "role_id")
    @Valid
    @Reference
    private Long roleId;
    @Column(name = "first_name")
    @Valid
    private String firstName;
    @Column(name = "last_name")
    @Valid
    private String lastName;
    @Valid
    private String login;
    @Valid
    private String password;
    private String email;
    private String phone;
    private Float rating;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

}
