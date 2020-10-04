package com.marwit.offerbuilder.quotation;

import com.marwit.offerbuilder.quotation.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotationRepository extends JpaRepository<Quotation, Long> {
}
