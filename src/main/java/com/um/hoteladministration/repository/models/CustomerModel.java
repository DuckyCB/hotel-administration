package com.um.hoteladministration.repository.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerModel {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("email")
    private String email;

    public CustomerModel(Long id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public CustomerModel() {
    }

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
