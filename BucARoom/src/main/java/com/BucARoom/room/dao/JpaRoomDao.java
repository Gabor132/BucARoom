/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.room.dao;

import com.BucARoom.room.entitie.Rooms;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dragos
 */
@Repository
@Component
public class JpaRoomDao implements RoomDao{

    
    @PersistenceContext
    public EntityManager entityManager;
    
    public JpaRoomDao(){}
    
    @Transactional
    @Override
    public List<Rooms> getAllRooms() {
        List<Rooms> listRooms;
        
        TypedQuery<Rooms> query = entityManager.createNamedQuery("Rooms.findAll",Rooms.class);
        listRooms = query.getResultList();
        
        return listRooms;
    }

    @Transactional
    @Override
    public Rooms getRoomById(Long id) {
        return entityManager.find(Rooms.class, id);
    }

    @Transactional
    @Override
    public Rooms addRoom(Rooms room) {
        if(room != null){
            entityManager.persist(room);
            return room;
        }
        return null;
    }

    @Transactional
    @Override
    public Rooms getRoomByRoomNumber(int roomNumber) {
        TypedQuery<Rooms> query = entityManager.createNamedQuery("Rooms.findByRoomNumber",Rooms.class);
        query.setParameter("roomNumber", roomNumber);
        Rooms room;
        try{
            room = query.getSingleResult();
        }catch(NoResultException ex){
            room = null;
        }
        return room;
    }
    
}
