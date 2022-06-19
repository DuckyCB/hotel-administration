package com.um.hoteladministration.repository.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomCustomerModel {
    @JsonProperty("roomId")
    private Long roomId;
    @JsonProperty("customerId")
    private String customerId;

    public RoomCustomerModel(Long roomId, String customerId) {
        this.roomId = roomId;
        this.customerId = customerId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
