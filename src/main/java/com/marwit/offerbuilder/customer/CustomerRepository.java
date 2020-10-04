package com.marwit.offerbuilder.customer;

import com.marwit.offerbuilder.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
