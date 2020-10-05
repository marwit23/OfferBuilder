package com.marwit.offerbuilder.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @PostMapping("/{customerId}")
    public Customer addCustomer(@RequestBody Customer customer){
        customerService.save(customer);
        return customer;
    }

    @GetMapping("/{customerId}")
    public Customer findById(@PathVariable Long customerId) {
        return customerService.findById(customerId);
    }

    @PutMapping("/{customerId}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long customerId) {
        customer.setCustomerId(customerId);
        customerService.save(customer);
        return customer;
    }

    @DeleteMapping("/{customerId}")
    public String deleteById(@PathVariable Long customerId) {
        customerService.deleteById(customerId);
        return "Deleted Customer id: " + customerId;
    }
}
