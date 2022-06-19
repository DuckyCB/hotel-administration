package com.um.hoteladministration.repository;

import com.um.hoteladministration.repository.entities.RoomCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCustomerRepository extends JpaRepository<RoomCustomer, Long> {
}
