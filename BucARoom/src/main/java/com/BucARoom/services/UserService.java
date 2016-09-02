/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.services;

import com.BucARoom.entities.Users;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dragos
 */
@Service
public class UserService {
    
    private static final Logger LOG = Logger.getGlobal();
    
    private static EntityManagerFactory emf;
    
    private EntityManager em;
    
    public List<Users> getAllUsers(){
        List<Users> users;
        
        emf = Persistence.createEntityManagerFactory("BucARoomPU");
        em = emf.createEntityManager();
        
        TypedQuery<Users> query = em.createNamedQuery("Users.findAll", Users.class);
        users = query.getResultList();
        
        em.close();
        emf.close();
        
        return users;
    }
    
    public void addUsers(Users user){
        emf = Persistence.createEntityManagerFactory("BucARoomPU");
        em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }finally{
            if(em.getTransaction().isActive())
                em.getTransaction().rollback();
        }
        
        em.close();
        emf.close();
    }
}
