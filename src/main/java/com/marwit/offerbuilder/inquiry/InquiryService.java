package com.marwit.offerbuilder.inquiry;

import java.util.List;

public interface InquiryService {
    List<Inquiry> findAll();
    Inquiry findById(Long inquiryId);
    void save(Inquiry inquiry);
    void deleteById(Long inquiryId);
}
