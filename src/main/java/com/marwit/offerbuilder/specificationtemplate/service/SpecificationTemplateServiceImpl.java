package com.marwit.offerbuilder.specificationtemplate.service;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import com.marwit.offerbuilder.specificationtemplate.model.ComponentTemplate;
import com.marwit.offerbuilder.specificationtemplate.model.SpecificationTemplate;
import com.marwit.offerbuilder.specificationtemplate.repository.SpecificationTemplateRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecificationTemplateServiceImpl implements SpecificationTemplateService {

    private SpecificationTemplateRepo specificationTemplateRepo;

    public SpecificationTemplateServiceImpl(SpecificationTemplateRepo specificationTemplateRepo) {
        this.specificationTemplateRepo = specificationTemplateRepo;
    }

    @Override
    public List<SpecificationTemplate> findAll() {
        return specificationTemplateRepo.findAll();
    }

    @Override
    public SpecificationTemplate findById(Long specificationTemplateId) {
        Optional<SpecificationTemplate> result = specificationTemplateRepo.findById(specificationTemplateId);
        SpecificationTemplate specificationTemplate;
        if(result.isPresent()) specificationTemplate = result.get();
        else throw new EntityNotFoundException("technical specification template", specificationTemplateId.toString());
        return specificationTemplate;
    }

    @Override
    public void save(SpecificationTemplate specificationTemplate) {
        specificationTemplateRepo.save(specificationTemplate);
    }

    @Override
    public void deleteById(Long specificationTemplateId) {
        specificationTemplateRepo.deleteById(specificationTemplateId);
    }
}
