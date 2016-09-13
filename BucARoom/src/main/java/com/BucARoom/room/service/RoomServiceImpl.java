/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.room.service;

import com.BucARoom.room.dao.RoomDao;
import com.BucARoom.room.entitie.Rooms;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DragosGabor
 */
@Service("roomService")
public class RoomServiceImpl implements IRoomService{

    @Autowired
    public RoomDao roomDao;
    
    @Override
    public Rooms getRoomById(long id) {
        return roomDao.getRoomById(id);
    }

    @Override
    public List<Rooms> getAllRooms() {
        return roomDao.getAllRooms();
    }

    @Override
    public Rooms addRoom(Rooms room) {
        return roomDao.addRoom(room);
    }

    @Override
    public Rooms getRoomByRoomNumber(int roomNumber) {
        return roomDao.getRoomByRoomNumber(roomNumber);
    }
    
}
