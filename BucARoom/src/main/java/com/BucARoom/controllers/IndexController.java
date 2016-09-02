/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.controllers;

import com.BucARoom.entities.Users;
import com.BucARoom.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class IndexController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value="/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    @RequestMapping(value="users", method=GET)
    public ModelAndView getUsers(){
        ModelAndView mv = new ModelAndView("index");
        List<Users> users = userService.getAllUsers();
        mv.addObject(users);
        return mv;
    }
    
    @RequestMapping(value="addUser", method=POST)
    public ModelAndView addUser(@ModelAttribute Users user){
        
        ModelAndView mv = new ModelAndView("index");
        userService.addUsers(user);
        mv.addObject("id",user.getId());
        mv.addObject("username",user.getUsername());
        mv.addObject("password",user.getPassword());
        
        return mv;
    }
    
}
