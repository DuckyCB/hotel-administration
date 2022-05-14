package main.java.com.um.hoteladministration.repository;

import main.java.com.um.hoteladministration.repository.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer getById(Long id);
}