package com.marwit.offerbuilder.quotationdetails;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import com.marwit.offerbuilder.inquiry.Inquiry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuotationDetailsServiceImpl implements QuotationDetailsService {

    private QuotationDetailsRepository quotationDetailsRepository;

    public QuotationDetailsServiceImpl(QuotationDetailsRepository quotationDetailsRepository) {
        this.quotationDetailsRepository = quotationDetailsRepository;
    }

    @Override
    public List<QuotationDetails> findAll() {
        return quotationDetailsRepository.findAll();
    }

    @Override
    public QuotationDetails findById(Long quotationDetailsId) {
        Optional<QuotationDetails> result = quotationDetailsRepository.findById(quotationDetailsId);
        QuotationDetails quotationDetails;
        if(result.isPresent()) quotationDetails = result.get();
        else throw new EntityNotFoundException("quotation details", quotationDetailsId.toString());
        return quotationDetails;
    }

    @Override
    public void save(QuotationDetails quotationDetails) {
        quotationDetailsRepository.save(quotationDetails);
    }

    @Override
    public void deleteById(Long quotationDetailsId) {
        quotationDetailsRepository.deleteById(quotationDetailsId);
    }
}
