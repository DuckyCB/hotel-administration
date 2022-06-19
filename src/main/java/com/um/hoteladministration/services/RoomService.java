package com.um.hoteladministration.services;

import com.um.hoteladministration.repository.RoomRepository;
import com.um.hoteladministration.repository.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room getById(Long roomId) {
        return roomRepository.getById(roomId);
    }

    public Set<Room> getAllByHotelId(Long hotelId) {
        return roomRepository.getAllByHotelId(hotelId);
    }

    public Set<Room> getAllByHotelIdNotTaken(Long hotelId) {
        return roomRepository.getAllByHotelIdNotTaken(hotelId);
    }
}
