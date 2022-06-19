package com.um.hoteladministration.services;

import com.um.hoteladministration.repository.CustomerRepository;
import com.um.hoteladministration.repository.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getById(Long customerId) {
        return customerRepository.getById(customerId);
    }

    public Set<Customer> getAllByHotelId(Long hotelId) {
        return customerRepository.getAllByHotelId(hotelId);
    }

    public Set<Customer> getAllByRoomId(Long roomId) {
        return customerRepository.getAllByRoomId(roomId);
    }

    public Customer createNew(Customer customer) {
        return customerRepository.save(customer);
    }
}
