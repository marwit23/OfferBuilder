package com.marwit.offerbuilder.specificationimpl.service;

import com.marwit.offerbuilder.specificationimpl.model.Specification;
import com.marwit.offerbuilder.specificationtemplate.model.SpecificationTemplate;

import java.util.List;

public interface SpecificationService {
    List<Specification> findAll();
    Specification findById(Long specificationId);
    void save(Specification specification);
    void deleteById(Long specificationId);
}
