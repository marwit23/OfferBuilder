package com.marwit.offerbuilder.specificationtemplate.controller;

import com.marwit.offerbuilder.specificationtemplate.model.SpecificationTemplate;
import com.marwit.offerbuilder.specificationtemplate.service.SpecificationTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specification-templates")
public class SpecificationTemplateController {

    private SpecificationTemplateService specificationTemplateService;

    public SpecificationTemplateController(SpecificationTemplateService specificationTemplateService) {
        this.specificationTemplateService = specificationTemplateService;
    }

    @GetMapping
    public List<SpecificationTemplate> findAll() {
        return specificationTemplateService.findAll();
    }

    @PostMapping
    public SpecificationTemplate addSpecificationTemplate(@RequestBody SpecificationTemplate specificationTemplate){
        specificationTemplateService.save(specificationTemplate);
        return specificationTemplate;
    }

    @GetMapping("/{specificationTemplateId}")
    public SpecificationTemplate findById(@PathVariable Long specificationTemplateId) {
        return specificationTemplateService.findById(specificationTemplateId);
    }

    @PutMapping("/{specificationTemplateId}")
    public SpecificationTemplate updateSpecificationTemplate(@RequestBody SpecificationTemplate specificationTemplate, @PathVariable Long specificationTemplateId) {
        specificationTemplate.setSpecificationTemplateId(specificationTemplateId);
        specificationTemplateService.save(specificationTemplate);
        return specificationTemplate;
    }

    @DeleteMapping("/{specificationTemplateId}")
    public String deleteById(@PathVariable Long specificationTemplateId) {
        specificationTemplateService.deleteById(specificationTemplateId);
        return "Deleted Specification Template id: " + specificationTemplateId;
    }
}
