package com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "hotel", schema = "hotel_administration")
public class Hotel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @Column(name = "address", nullable = false, length = 40)
    private String address;

    @Column(name = "room_qty", nullable = false)
    private Integer roomQty;

    public Hotel(Long id, String name, String address, Integer roomQty) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.roomQty = roomQty;
    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String hotelName) {
        this.name = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRoomQty() {
        return roomQty;
    }

    public void setRoomQty(Integer roomQty) {
        this.roomQty = roomQty;
    }
}


