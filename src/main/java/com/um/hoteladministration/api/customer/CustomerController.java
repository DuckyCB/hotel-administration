package main.java.com.um.hoteladministration.api.customer;

import main.java.com.um.hoteladministration.repository.entities.Customer;
import main.java.com.um.hoteladministration.services.CustomerService;
import main.java.com.um.hoteladministration.services.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/customer")
public class CustomerController {

    private CustomerService customerService;
    private CustomerMapper customerMapper;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @GetMapping(path = {"/{customerId}"})
    public ResponseEntity<CustomerMessage> getById(@PathVariable Long CustomerId) {

        Customer customer = customerService.getById(customerId);
        CustomerMessage customerMessage = customerMapper.toCustomerMessage(customer);
        return new ResponseEntity<>(customerMessage, HttpStatus.OK);
    }
}