/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.services;

import com.BucARoom.entities.Users;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dragos
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    
    public EntityManagerFactory EMF;
    
    public EntityManager EM;
    
    public UserServiceImpl(){
        EMF = Persistence.createEntityManagerFactory("BucARoomPU");
        EM = EMF.createEntityManager();
    }
    
    @Override
    public List<Users> getAllUsers(){
        List<Users> users;
        
        TypedQuery<Users> query = EM.createNamedQuery("Users.findAll", Users.class);
        users = query.getResultList();
        for(Users u:users){
            u.setPassword(hidePassword(u.getPassword()));
        }
        return users;
    }
    
    @Override
    public Users getUserById(Long id){
        Users user = EM.find(Users.class, id);
        user.setPassword(hidePassword(user.getPassword()));
        return user;
    }
    
    @Override
    public Users addUsers(Users user){
        
        Users newUser = new Users();
        newUser.setPassword(user.getPassword());
        newUser.setUsername(user.getUsername());
        try{
            EM.getTransaction().begin();
            EM.persist(newUser);
            EM.getTransaction().commit();
        }catch(RollbackException ex){
            newUser = null;
        }finally{
            if(EM.getTransaction().isActive()){
                EM.getTransaction().rollback();
            }
        }
        return newUser;
    }
    
    private String hidePassword(String pass){
        String newPass = "";
        for(int i = 0; i<pass.length();i++){
            newPass += "*";
        }
        return newPass;
    }
}
