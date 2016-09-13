/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BucARoom.room.entitie;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DragosGabor
 */
@Entity
@Table(name="ROOMS")
@NamedQueries({
    @NamedQuery(name="Rooms.findAll", query = "SELECT r FROM Rooms r"),
    @NamedQuery(name="Rooms.findByRoomNumber", query = "SELECT r FROM Rooms r where r.roomNumber = :roomNumber")
})
public class Rooms implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "roomNumber", unique = true, nullable = false)
    private int roomNumber;
    
    @Column(name = "roomFloor", nullable = false)
    private int roomFloor;
    
    @Column(name = "canBeReserved", nullable = false)
    private String canBeReserved;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getCanBeReserved() {
        return canBeReserved;
    }

    public void setCanBeReserved(String canBeReserved) {
        this.canBeReserved = canBeReserved;
    }
    
}
