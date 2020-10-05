package com.marwit.offerbuilder.inquiry;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InquiryServiceImpl implements InquiryService {

    private InquiryRepository inquiryRepository;

    public InquiryServiceImpl(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @Override
    public List<Inquiry> findAll() {
        return inquiryRepository.findAll();
    }

    @Override
    public Inquiry findById(Long inquiryId) {
        Optional<Inquiry> result = inquiryRepository.findById(inquiryId);
        Inquiry inquiry;
        if(result.isPresent()) inquiry = result.get();
        else throw new EntityNotFoundException("inquiry", inquiryId.toString());
        return inquiry;
    }

    @Override
    public void save(Inquiry inquiry) {
        inquiryRepository.save(inquiry);
    }

    @Override
    public void deleteById(Long inquiryId) {
        inquiryRepository.deleteById(inquiryId);
    }
}
