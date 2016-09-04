/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.controllers;

import com.BucARoom.entities.Users;
import com.BucARoom.services.UserServiceImpl;
import java.util.List;
import javax.validation.Valid;
import javax.validation.ValidationException;
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
public class UsersController {
    
    @Autowired
    public UserServiceImpl userService;
    
    public UsersController(){}
    
    @RequestMapping(value="/users")
    public ModelAndView users(){
        ModelAndView mv = new ModelAndView("users");
        return mv;
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
