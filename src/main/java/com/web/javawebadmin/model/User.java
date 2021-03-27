package com.web.javawebadmin.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = User.TABLE_NAME)
public class User {
    public static final String TABLE_NAME = "USERS";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, columnDefinition = "VARCHAR (100) UNIQUE")
    private String username;
    @Column(nullable = false, columnDefinition = "VARCHAR (50) UNIQUE")
    private String email;
    @Column(nullable = false, columnDefinition = "VARCHAR (50)")
    private String password;
    @Column(nullable = false, columnDefinition = "VARCHAR (30)")
    private String firstname;
    @Column(nullable = false, columnDefinition = "VARCHAR (30)")
    private String lastname;
    @Column(nullable = false, columnDefinition = "VARCHAR (100)")
    private String address;
    @Column(nullable = false, columnDefinition = "BOOLEAN default false")
    private Boolean logged_in;
    @Column(nullable = false, columnDefinition = "BOOLEAN default true")
    private Boolean active;
    @Column(columnDefinition = "TIMESTAMP default NOW()")
    private Timestamp created_at;
    @Column(columnDefinition = "TIMESTAMP default NOW()")
    private Timestamp updated_at;

    public User(String username,
                String email,
                String password,
                String firstname,
                String lastname,
                String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.active = true;
        this.logged_in = false;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname(String firstname) {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(String lastname) {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getLogged_in(Boolean logged_in) {
        return logged_in;
    }

    public void setLogged_in(Boolean logged_in) {
        this.logged_in = logged_in;
    }

    public Timestamp getUpdated_at(Timestamp updated_at) {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}