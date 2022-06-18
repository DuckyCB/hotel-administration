package main.java.com.um.hoteladministration.api.room;

import main.java.com.um.hoteladministration.repository.entities.Customer;
import main.java.com.um.hoteladministration.repository.entities.Hotel;

public class RoomMessage {

    private Long roomId;
    private Hotel hotel;
    private Customer customer;
    private Boolean isTaken;
    private Integer capacity;

    public RoomMessage(Long roomId, Hotel hotel, Integer capacity) {
        this.capacity = capacity;
        this.roomId = roomId;
        this.hotel = hotel;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(Boolean taken) {
        isTaken = taken;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
