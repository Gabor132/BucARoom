/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.user.service;

import com.BucARoom.user.entitie.Users;
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
