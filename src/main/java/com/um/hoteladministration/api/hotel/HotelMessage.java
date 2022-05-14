package main.java.com.um.hoteladministration.api.hotel;

public class HotelMessage {

    private Long hotelId;
    private String hotelName;
    private String address;
    private Integer roomQty;

    public HotelMessage(Long hotelId, String hotelName, String address, Integer roomQty) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.roomQty = roomQty;
    }

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

