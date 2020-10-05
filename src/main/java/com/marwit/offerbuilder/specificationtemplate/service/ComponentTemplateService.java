package com.marwit.offerbuilder.specificationtemplate.service;

import com.marwit.offerbuilder.specificationtemplate.model.ComponentTemplate;

import java.util.List;

public interface ComponentTemplateService {
    List<ComponentTemplate> findAll();
    ComponentTemplate findById(Long componentId);
    void save(ComponentTemplate componentTemplate);
    void deleteById(Long componentId);
}
