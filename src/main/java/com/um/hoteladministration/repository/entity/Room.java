package com.um.hoteladministration.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room", schema = "hotel_administration")
public class Hotel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "is_taken", nullable = false)
        private Boolean is_taken;

    @ManyToOne
    @JoinColumn(name="room", referencedColumnName="hotel_id")
    private Hotel hotel;

