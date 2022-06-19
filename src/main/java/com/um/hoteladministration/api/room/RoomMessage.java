package com.um.hoteladministration.api.room;

public class RoomMessage {
    private final Long id;
    private final Integer number;
    private final Boolean isTaken;
    private final Integer capacity;

    public RoomMessage(Long id, Integer number, Boolean isTaken, Integer capacity) {
        this.id = id;
        this.number = number;
        this.isTaken = isTaken;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public Boolean getTaken() {
        return isTaken;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
