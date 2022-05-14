package main.java.com.um.hoteladministration.services;

import main.java.com.um.hoteladministration.repository.entities.Hotel;
import main.java.com.um.hoteladministration.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
