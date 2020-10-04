package com.marwit.offerbuilder.customer;

import com.marwit.offerbuilder.customer.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
    Customer findById(Long customerId);
    void save(Customer theCustomer);
    void deleteById(Long customerId);

}
