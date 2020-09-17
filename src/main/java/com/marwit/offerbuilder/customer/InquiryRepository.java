package com.marwit.offerbuilder.customer;

import com.marwit.offerbuilder.customer.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
