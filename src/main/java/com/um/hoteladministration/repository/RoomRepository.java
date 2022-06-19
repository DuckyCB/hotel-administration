package com.um.hoteladministration.repository;

import com.um.hoteladministration.repository.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT r FROM Room r, Hotel h WHERE h.id = :hotelId and h.id = r.hotelId")
    Set<Room> getAllByHotelId(Long hotelId);

    @Query("SELECT r FROM Room r, Hotel h WHERE h.id = :hotelId and h.id = r.hotelId and r.isTaken = false")
    Set<Room> getAllByHotelIdNotTaken(Long hotelId);
}
