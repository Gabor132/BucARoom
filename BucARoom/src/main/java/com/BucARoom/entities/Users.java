/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dragos
 */
@Entity
@NamedQuery(name="Users.findAll", query = "SELECT u FROM Users u")
public class Users implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    
    @Column(name="username", unique = true)
    @NotNull
    private String username;
    
    @Column(name = "password")
    @NotNull
    private String password;
    
    @Column(name = "email")
    @NotNull
    private String email;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
