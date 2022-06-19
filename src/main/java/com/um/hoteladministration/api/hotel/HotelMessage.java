package com.um.hoteladministration.api.hotel;

public class HotelMessage {

    private final Long hotelId;
    private final String hotelName;
    private final String address;
    private final Integer roomQty;

    public HotelMessage(Long hotelId, String hotelName, String address, Integer roomQty) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.roomQty = roomQty;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getAddress() {
        return address;
    }

    public Integer getRoomQty() {
        return roomQty;
    }
}

