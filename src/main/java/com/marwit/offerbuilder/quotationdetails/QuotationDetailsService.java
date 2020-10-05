package com.marwit.offerbuilder.quotationdetails;

import java.util.List;

public interface QuotationDetailsService {
    List<QuotationDetails> findAll();
    QuotationDetails findById(Long quotationDetailsId);
    void save(QuotationDetails quotationDetails);
    void deleteById(Long quotationDetailsId);
}
