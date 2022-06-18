package main.java.com.um.hoteladministration.services;

import main.java.com.um.hoteladministration.repository.entities.Hotel;
import main.java.com.um.hoteladministration.repository.HotelRepository;
import main.java.com.um.hoteladministration.repository.entities.Rooms;
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
    public Rooms getRoomById(Long hotelId, Long roomId){
        Hotel hotel = hotelRepository.getById(hotelId);
        for(Rooms room: hotel.getRooms()){
            if (room.getRoomId().equals(roomId)){
                return room;
            }
        }
        return null;
    }
    //si está ordenado, podemos hacer return hotel.getRooms()[roomId + 1]; suponiendo que es secuencial empezando en 0
}
