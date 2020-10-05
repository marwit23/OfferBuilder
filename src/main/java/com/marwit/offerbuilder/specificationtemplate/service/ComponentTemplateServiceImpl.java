package com.marwit.offerbuilder.specificationtemplate.service;

import com.marwit.offerbuilder._exceptions.EntityNotFoundException;
import com.marwit.offerbuilder.specificationtemplate.model.ComponentTemplate;
import com.marwit.offerbuilder.specificationtemplate.repository.ComponentTemplateRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComponentTemplateServiceImpl implements ComponentTemplateService {

    private ComponentTemplateRepo componentTemplateRepo;

    public ComponentTemplateServiceImpl(ComponentTemplateRepo componentTemplateRepo) {
        this.componentTemplateRepo = componentTemplateRepo;
    }

    @Override
    public List<ComponentTemplate> findAll() {
        return componentTemplateRepo.findAll();
    }

    @Override
    public ComponentTemplate findById(Long componentId) {
        Optional<ComponentTemplate> result = componentTemplateRepo.findById(componentId);
        ComponentTemplate componentTemplate;
        if(result.isPresent()) componentTemplate = result.get();
        else throw new EntityNotFoundException("technocal component template", componentId.toString());
        return componentTemplate;
    }

    @Override
    public void save(ComponentTemplate componentTemplate) {
        componentTemplateRepo.save(componentTemplate);
    }

    @Override
    public void deleteById(Long componentId) {
        componentTemplateRepo.deleteById(componentId);
    }
}
