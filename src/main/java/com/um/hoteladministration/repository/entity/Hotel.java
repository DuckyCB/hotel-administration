package com.um.hoteladministration.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "hotel", schema = "hotel_administration")
public class Hotel {
    @Id
    @Column(name = "hotel_id", nullable = false)
    private Long hotel_id;

    @Column(name = "hotel_name", nullable = false, length = 40)
    private String hotelName;

    @Column(name = "hotel_address", nullable = false, length = 40)
    private String hotel_address;

    @Column(name = "room_qty", nullable = false)
    private Integer roomQty;

    @OneToMany(mappedBy="departamento")
    private final List<Room> rooms = new List<Room>();

    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public Integer getRoomQty() {
        return roomQty;
    }

    public void setRoomQty(Integer roomQty) {
        this.roomQty = roomQty;
    }

}
