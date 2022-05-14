package main.java.com.um.hoteladministration.services.mapper;

import main.java.com.um.hoteladministration.api.customer.CustomerMessage;
import main.java.com.um.hoteladministration.repository.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public CustomerMessage toCustomerMessage(Customer customer) {
        return new CustomerMessage(
                customer.getCustomerId(),
                customer.getFullName(),
                customer.getEmail(),
                customer.getRoom()
        );
    }
}
