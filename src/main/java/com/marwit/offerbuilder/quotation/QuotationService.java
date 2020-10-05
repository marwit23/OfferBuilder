package com.marwit.offerbuilder.quotation;

import java.util.List;

public interface QuotationService {
    List<Quotation> findAll();
    Quotation findById(Long quotationId);
    void save(Quotation quotation);
    void deleteById(Long quotationId);
}
