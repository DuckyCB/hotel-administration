package main.java.com.um.hoteladministration.repository;

import main.java.com.um.hoteladministration.repository.entities.Hotel;
import main.java.com.um.hoteladministration.repository.entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Hotel getById(Long id);
    Rooms getRoomById (Long hotelId, Long roomId);
    }
