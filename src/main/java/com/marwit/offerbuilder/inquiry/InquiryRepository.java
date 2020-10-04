package com.marwit.offerbuilder.inquiry;

import com.marwit.offerbuilder.inquiry.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
