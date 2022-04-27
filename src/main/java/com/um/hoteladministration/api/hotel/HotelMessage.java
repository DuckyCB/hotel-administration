package com.um.hoteladministration.api.hotel;

public class HotelMessage {

    private Long id;
    private String hotelName;
    private String address;
    private Integer roomQty;

    public HotelMessage(Long id, String hotelName, String address, Integer roomQty) {
        this.id = id;
        this.hotelName = hotelName;
        this.address = address;
        this.roomQty = roomQty;
    }

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
