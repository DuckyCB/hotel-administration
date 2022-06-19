package com.um.hoteladministration.api.customer;

import com.um.hoteladministration.repository.entities.Customer;
import com.um.hoteladministration.services.CustomerService;
import com.um.hoteladministration.services.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping(path = "api/customer")
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @GetMapping(path = {"/{customerId}"})
    public ResponseEntity<CustomerMessage> getById(@PathVariable Long customerId) {
        Customer customer = customerService.getById(customerId);
        CustomerMessage customerMessage = customerMapper.toCustomerMessage(customer);
        return new ResponseEntity<>(customerMessage, HttpStatus.OK);
    }

    @GetMapping(path = {"/hotel/{hotelId}"})
    public ResponseEntity<Set<CustomerMessage>> getAllByHotelId(@PathVariable Long hotelId) {
        Set<Customer> customerSet = customerService.getAllByHotelId(hotelId);
        Set<CustomerMessage> customerMessageSet = customerSet.stream()
                .map(customerMapper::toCustomerMessage)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(customerMessageSet, HttpStatus.OK);
    }

    @GetMapping(path = {"/room/{roomId}"})
    public ResponseEntity<Set<CustomerMessage>> getAllByRoomId(@PathVariable Long roomId) {
        Set<Customer> customerSet = customerService.getAllByRoomId(roomId);
        Set<CustomerMessage> customerMessageSet = customerSet.stream()
                .map(customerMapper::toCustomerMessage)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(customerMessageSet, HttpStatus.OK);
    }

    @PostMapping("/new")
    Customer newCustomer(@RequestBody Customer newCustomer) {
        return customerService.createNew(newCustomer);
    }
}
