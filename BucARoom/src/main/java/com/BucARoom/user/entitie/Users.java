
package com.BucARoom.user.entitie;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dragos
 */
@Entity
@Table(name="USERS")
@NamedQueries({
    @NamedQuery(name="Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name="Users.findExistance", query="SELECT u FROM Users u where u.username =:username AND u.password = :password")
})
public class Users implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    
    @Column(name="username", unique = true)
    @NotNull
    private String username;
    
    @Column(name="firstName")
    @NotNull
    private String firstName;
    
    @Column(name="lastName")
    @NotNull
    private String lastName;
    
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
