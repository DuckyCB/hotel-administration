package main.java.com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "room", schema = "hotel_administration")
public class Rooms {
    @Id
    @Column(name = "roomId", nullable = false)
    private Long roomId;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "isTaken", nullable = false)
    private Boolean isTaken;

    @ManyToOne
    @JoinColumn(name = "hotel", referencedColumnName = "hotelId")
    private Hotel hotel;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(Boolean isTaken) {
        this.isTaken = isTaken;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}