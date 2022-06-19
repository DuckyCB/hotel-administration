package com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "room", schema = "hotel_administration")
public class Room {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "hotel_id", nullable = false)
    private Long hotelId;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "is_taken", nullable = false)
    private Boolean isTaken;

    public Long getId() {
        return id;
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
