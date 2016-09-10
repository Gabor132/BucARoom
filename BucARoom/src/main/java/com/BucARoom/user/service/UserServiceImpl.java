/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.user.service;

import com.BucARoom.user.dao.UserDao;
import com.BucARoom.user.entitie.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 *
 * @author Dragos
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    
    @Autowired
    public UserDao userDao;
    
    @Override
    public Users getUserById(long id){
        return userDao.getUserById(id);
    }
    
    @Override
    public List<Users> getAllUsers(){
        return userDao.getAllUsers();
    }
    
    @Override
    public Users addUser(Users user){
        return userDao.addUser(user);
    }
}
