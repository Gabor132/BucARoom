/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.room.dao;

import com.BucARoom.room.entitie.Rooms;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dragos
 */
public interface RoomDao {
    
    @Transactional
    public List<Rooms> getAllRooms();
    @Transactional
    public Rooms getRoomById(Long id);
    @Transactional
    public Rooms addRoom(Rooms room);
    @Transactional
    public Rooms getRoomByRoomNumber(int roomNumber);
    
}
