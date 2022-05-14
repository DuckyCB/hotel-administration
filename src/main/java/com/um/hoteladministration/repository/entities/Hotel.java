package main.java.com.um.hoteladministration.repository.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "hotel", schema = "hotel_administration")
public class Hotel {
    @Id
    @Column(name = "hotelId", nullable = false)
    private Long hotelId;

    @Column(name = "hotelName", nullable = false, length = 40)
    private String hotelName;

    @Column(name = "hotelAddress", nullable = false, length = 40)
    private String hotelAddress;

    @Column(name = "roomQty", nullable = false)
    private Integer roomQty;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Rooms> rooms;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public Integer getRoomQty() {
        return roomQty;
    }

    public void setRoomQty(Integer roomQty) {
        this.roomQty = roomQty;
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<Rooms> rooms) {
        this.rooms = rooms;
    }
}


