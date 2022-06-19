package com.um.hoteladministration.services.mapper;

import com.um.hoteladministration.api.customer.CustomerMessage;
import com.um.hoteladministration.repository.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public CustomerMessage toCustomerMessage(Customer customer) {
        return new CustomerMessage(
                customer.getId(),
                customer.getFullName(),
                customer.getEmail()
        );
    }
}
