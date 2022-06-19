package com.um.hoteladministration.api.room;

public class RoomCustomerMessage {
    private final Long roomId;
    private final Long customerId;

    public RoomCustomerMessage(Long roomId, Long customerId) {
        this.roomId = roomId;
        this.customerId = customerId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public Long getCustomerId() {
        return customerId;
    }
}
