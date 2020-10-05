package com.marwit.offerbuilder.customer;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import com.marwit.offerbuilder.contactperson.ContactPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long customerId) {
        Optional<Customer> result = customerRepository.findById(customerId);
        Customer customer;
        if(result.isPresent()) customer = result.get();
        else throw new EntityNotFoundException("customer", customerId.toString());
        return customer;
    }

    @Override
    public void save(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    @Override
    public void deleteById(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
