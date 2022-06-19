package com.um.hoteladministration.repository.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("hotelId")
    private Long hotelId;
    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("isTaken")
    private Boolean isTaken;

    public RoomModel(Long id, Long hotelId, Integer capacity, Integer number, Boolean isTaken) {
        this.id = id;
        this.hotelId = hotelId;
        this.capacity = capacity;
        this.number = number;
        this.isTaken = isTaken;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Boolean getTaken() {
        return isTaken;
    }

    public void setTaken(Boolean taken) {
        isTaken = taken;
    }
}
