package com.um.hoteladministration.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "hotel_administration")
public class Hotel {
    @Id
    @Column(name = "customer_id", nullable = false)
    private Long customer_id;

    @Column(name = "full_name", nullable = false, length = 40)
    private String hotelName;

    @Column(name = "email", nullable = false, length = 40)
    private String address;

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
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
}
