package com.marwit.offerbuilder.specificationimpl.service;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import com.marwit.offerbuilder.specificationimpl.model.Specification;
import com.marwit.offerbuilder.specificationimpl.repository.SpecificationRepository;
import com.marwit.offerbuilder.specificationtemplate.model.SpecificationTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    private SpecificationRepository specificationRepository;

    public SpecificationServiceImpl(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }

    @Override
    public List<Specification> findAll() {
        return specificationRepository.findAll();
    }

    @Override
    public Specification findById(Long specificationId) {
        Optional<Specification> result = specificationRepository.findById(specificationId);
        Specification specification;
        if(result.isPresent()) specification = result.get();
        else throw new EntityNotFoundException("technical specification ", specificationId.toString());
        return specification;
    }

    @Override
    public void save(Specification specification) {
        specificationRepository.save(specification);
    }

    @Override
    public void deleteById(Long specificationId) {
        specificationRepository.deleteById(specificationId);
    }
}
