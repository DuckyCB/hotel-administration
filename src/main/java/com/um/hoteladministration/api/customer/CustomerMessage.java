package main.java.com.um.hoteladministration.api.customer;

import main.java.com.um.hoteladministration.repository.entities.Rooms;

public class CustomerMessage {
    private Long customerId;
    private String fullName;
    private String email;
    private Rooms room;

    public CustomerMessage (Long customerId, String fullName, String email, Rooms room) {
        this.customerId = customerId;
        this.email = email;
        this.fullName = fullName;
        this. room = room;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }
}
