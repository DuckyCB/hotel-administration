package main.java.com.um.hoteladministration.services;

import main.java.com.um.hoteladministration.repository.entities.Customer;
import main.java.com.um.hoteladministration.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
