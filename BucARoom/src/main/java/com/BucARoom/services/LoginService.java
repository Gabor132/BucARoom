/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Dragos
 */
@Service
public class LoginService {
    
    boolean loggedIn = false;
    
    public Boolean isLoggedIn(){
        return loggedIn;
    }
}
