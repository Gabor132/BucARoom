/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.daos;

import com.BucARoom.entities.Users;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dragos
 */
public interface UserDao {
    
    @Transactional
    public List<Users> getAllUsers();
    @Transactional
    public Users getUserById(Long id);
    @Transactional
    public Users addUser(Users user);
}
