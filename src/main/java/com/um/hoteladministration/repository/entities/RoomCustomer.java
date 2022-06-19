package com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "room_customer", schema = "hotel_administration")
public class RoomCustomer {

    @Id
    @Column(name = "room_id", nullable = false)
    private Long roomId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
