package com.um.hoteladministration.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "hotel_administration")
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 40)
    private String fullName;

    @Column(name = "email", nullable = false, length = 40)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}


