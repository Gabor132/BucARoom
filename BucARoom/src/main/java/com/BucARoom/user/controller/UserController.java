/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.user.controller;

import com.BucARoom.user.entitie.Users;
import com.BucARoom.user.service.UserServiceImpl;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dragos
 */
@RestController
@RequestMapping
public class UserController {
    
    @Autowired
    public UserServiceImpl userService;
    
    public UserController(){}
    
    @RequestMapping(value="/user")
    public ModelAndView userView(){
        return new ModelAndView("user");
    }
    
    @RequestMapping(value="/all", method=GET)
    public List<Users> getAllUsers(Model model){
        List<Users> users = userService.getAllUsers();
        return users;
    }
    
    @RequestMapping(value="/{id}", method=GET)
    public Users getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }
    
    @RequestMapping(value="/addUser", method=POST)
    public Users addUser(@Valid Users user, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            user = userService.addUser(user);
        }else{
            user = null;
        }
        return user;
    }
    
}
