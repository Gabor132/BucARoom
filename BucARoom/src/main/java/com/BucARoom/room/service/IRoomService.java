/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.room.service;

import com.BucARoom.room.entitie.Rooms;
import java.util.List;

/**
 *
 * @author DragosGabor
 */
public interface IRoomService {
    
    public Rooms getRoomById(long id);
    
    public List<Rooms> getAllRooms();
    
    public Rooms addRoom(Rooms room);
    
    public Rooms getRoomByRoomNumber(int roomNumber);
}
