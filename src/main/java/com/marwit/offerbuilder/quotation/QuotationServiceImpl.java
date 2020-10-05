package com.marwit.offerbuilder.quotation;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import com.marwit.offerbuilder.contactperson.ContactPerson;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuotationServiceImpl implements QuotationService {

    private QuotationRepository quotationRepository;

    public QuotationServiceImpl(QuotationRepository quotationRepository) {
        this.quotationRepository = quotationRepository;
    }

    @Override
    public List<Quotation> findAll() {
        return quotationRepository.findAll();
    }

    @Override
    public Quotation findById(Long quotationId) {
        Optional<Quotation> result = quotationRepository.findById(quotationId);
        Quotation quotation;
        if(result.isPresent()) quotation = result.get();
        else throw new EntityNotFoundException("quotation", quotationId.toString());
        return quotation;
    }

    @Override
    public void save(Quotation quotation) {
        quotationRepository.save(quotation);
    }

    @Override
    public void deleteById(Long quotationId) {
        quotationRepository.deleteById(quotationId);
    }
}
