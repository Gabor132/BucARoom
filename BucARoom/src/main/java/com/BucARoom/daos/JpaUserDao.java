/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.daos;

import com.BucARoom.entities.Users;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dragos
 */
@Repository
public class JpaUserDao implements UserDao{
    
    @PersistenceContext
    public EntityManager entityManager;
    
    public JpaUserDao(){}
    
    @Transactional
    @Override
    public List<Users> getAllUsers(){
        List<Users> users;
        
        TypedQuery<Users> query = entityManager.createNamedQuery("Users.findAll", Users.class);
        users = query.getResultList();
        for(Users u:users){
            u.setPassword("");
        }
        return users;
    }
    
    @Transactional
    @Override
    public Users getUserById(Long id){
        Users user = entityManager.find(Users.class, id);
        user.setPassword("");
        return user;
    }
    
    @Transactional
    @Override
    public Users addUser(Users user){
        
        Users newUser = new Users();
        newUser.setPassword(user.getPassword());
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        try{
            entityManager.persist(newUser);
        }catch(RollbackException ex){
            newUser = null;
        }
        return newUser;
    }
}