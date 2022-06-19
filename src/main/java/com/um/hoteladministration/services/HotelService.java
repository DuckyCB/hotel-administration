package com.um.hoteladministration.services;

import com.um.hoteladministration.repository.HotelRepository;
import com.um.hoteladministration.repository.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Hotel getById(Long hotelId) {
        return hotelRepository.getById(hotelId);
    }

    public Set<Hotel> getAll() { return hotelRepository.getAll(); }
}
