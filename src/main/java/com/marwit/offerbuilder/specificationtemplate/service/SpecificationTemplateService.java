package com.marwit.offerbuilder.specificationtemplate.service;

import com.marwit.offerbuilder.specificationtemplate.model.SpecificationTemplate;

import java.util.List;

public interface SpecificationTemplateService {
    List<SpecificationTemplate> findAll();
    SpecificationTemplate findById(Long specificationTemplateId);
    void save(SpecificationTemplate specificationTemplate);
    void deleteById(Long specificationTemplateId);
}
