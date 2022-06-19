package com.um.hoteladministration.repository.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("roomQty")
    private Integer roomQty;

    public HotelModel(Long id, String name, String address, Integer roomQty) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.roomQty = roomQty;
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

    public void setName(String name) {
        this.name = name;
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
