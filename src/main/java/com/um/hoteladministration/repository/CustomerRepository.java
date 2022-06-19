package com.um.hoteladministration.repository;

import com.um.hoteladministration.repository.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c, RoomCustomer rc, Room r, Hotel h WHERE h.id = :hotelId and h.id = r.hotelId and r.id = rc.roomId and rc.customerId = c.id")
    Set<Customer> getAllByHotelId(Long hotelId);

    @Query("SELECT c FROM Customer c, RoomCustomer rc WHERE rc.roomId = :roomId and rc.customerId = c.id")
    Set<Customer> getAllByRoomId(Long roomId);
}
