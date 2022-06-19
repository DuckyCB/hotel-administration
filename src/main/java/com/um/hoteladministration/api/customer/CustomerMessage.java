package com.um.hoteladministration.api.customer;

public class CustomerMessage {
    private final Long id;
    private final String fullName;
    private final String email;

    public CustomerMessage (Long id, String fullName, String email) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
