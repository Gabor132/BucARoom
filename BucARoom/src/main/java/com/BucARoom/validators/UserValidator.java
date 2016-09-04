/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.validators;

import com.BucARoom.entities.Users;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Dragos
 */
public class UserValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return Users.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
       ValidationUtils.rejectIfEmpty(errors, "username", "username.empty");
       ValidationUtils.rejectIfEmpty(errors, "password", "password.empty");
       ValidationUtils.rejectIfEmpty(errors, "email", "email.empty");
    }
    
}
