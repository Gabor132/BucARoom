/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.login.controller;

import com.BucARoom.user.entitie.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dragos
 */
@RestController
@RequestMapping
public class LoginController {
    
    public LoginController(){}
    
    @RequestMapping(value="/login")
    public ModelAndView loginView(){
        return new ModelAndView("login");
    }
    
    @RequestMapping(value="/register")
    public ModelAndView registerView(){
        return new ModelAndView("register");
    }
    
    @RequestMapping(value="/checkUser", method=POST)
    public Boolean login(Users user){
        return user.getUsername() != null && user.getPassword() != null;
    }
}
