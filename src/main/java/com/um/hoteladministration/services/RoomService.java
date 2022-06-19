package com.um.hoteladministration.services;

import com.um.hoteladministration.repository.RoomCustomerRepository;
import com.um.hoteladministration.repository.RoomRepository;
import com.um.hoteladministration.repository.entities.Room;
import com.um.hoteladministration.repository.entities.RoomCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomCustomerRepository roomCustomerRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository, RoomCustomerRepository roomCustomerRepository) {
        this.roomRepository = roomRepository;
        this.roomCustomerRepository = roomCustomerRepository;
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

    public Room createNew(Room room) { return roomRepository.save(room); }

    public RoomCustomer addCustomerToRoom(RoomCustomer roomCustomer) {
        return roomCustomerRepository.save(roomCustomer);
    }
}
