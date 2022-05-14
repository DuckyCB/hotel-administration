package main.java.com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "hotel_administration")
public class Customer {
    @Id
    @Column(name = "customerId", nullable = false)
    private Long customerId;

    @Column(name = "fullName", nullable = false, length = 40)
    private String fullName;

    @Column(name = "email", nullable = false, length = 40)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room", referencedColumnName = "roomId")
    private Rooms room;

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


