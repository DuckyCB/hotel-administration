package main.java.com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "room", schema = "hotel_administration")
public class Rooms {
    @Id
    @Column(name = "roomId", nullable = false)
    private Long id;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "isTaken", nullable = false)
    private Boolean isTaken;

    @ManyToOne
    @JoinColumn(name = "hotel", referencedColumnName = "hotelId")
    private Hotel hotel;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getisTaken() {
        return isTaken;
    }

    public void setisTaken(Boolean isTaken) {
        this.isTaken = isTaken;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}