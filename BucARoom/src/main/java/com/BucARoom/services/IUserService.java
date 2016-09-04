/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.services;

import com.BucARoom.entities.Users;
import java.util.List;

/**
 *
 * @author Dragos
 */
public interface IUserService {
    
    public Users getUserById(long id);
    
    public List<Users> getAllUsers();
    
    public Users addUser(Users user);
    
}
