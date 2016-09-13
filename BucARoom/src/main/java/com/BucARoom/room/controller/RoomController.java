/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.room.controller;

import com.BucARoom.room.entitie.Rooms;
import com.BucARoom.room.service.IRoomService;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DragosGabor
 */
@RestController
@RequestMapping
public class RoomController {
    
    @Autowired
    public IRoomService roomService;
    
    public RoomController(){}
    
    @RequestMapping(value="/room")
    public ModelAndView roomView(){
        return new ModelAndView("room");
    }
    
    @RequestMapping(value="/all", method=GET)
    public List<Rooms> getAllRooms(){
        List<Rooms> listRooms = roomService.getAllRooms();
        listRooms.sort(new Comparator<Rooms>() {
            @Override
            public int compare(Rooms o1, Rooms o2) {
                return o1.getRoomNumber() - o2.getRoomNumber();
            }
        });
        return listRooms;
    }
    
    @RequestMapping(value="getById/{id}", method=GET)
    public Rooms getRoomById(@PathVariable long id){
        return roomService.getRoomById(id);
    }
    
    @RequestMapping(value="/addRoom", method=POST)
    public Rooms addRoom(Rooms room){
        if(roomService.getRoomByRoomNumber(room.getRoomNumber()) == null){
            return roomService.addRoom(room);
        }
        return null;
    }
    
    @RequestMapping(value="getByNumber/{roomNumber}", method=GET)
    public Rooms getRoomByNumber(@PathVariable int roomNumber){
        return roomService.getRoomByRoomNumber(roomNumber);
    }
}
