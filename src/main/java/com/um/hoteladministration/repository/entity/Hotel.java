package com.um.hoteladministration.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel", schema = "hotel_administration")
public class Hotel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "hotel_name", nullable = false, length = 40)
    private String hotelName;

    @Column(name = "address", nullable = false, length = 40)
    private String address;

    @Column(name = "room_qty", nullable = false)
    private Integer roomQty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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
