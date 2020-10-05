package com.marwit.offerbuilder.specificationtemplate.controller;

import com.marwit.offerbuilder.specificationtemplate.model.ComponentTemplate;
import com.marwit.offerbuilder.specificationtemplate.service.ComponentTemplateService;
import com.marwit.offerbuilder.specificationtemplate.service.ComponentTemplateServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/component-template")
public class ComponentTemplateController {

    private ComponentTemplateService componentTemplateService;

    public ComponentTemplateController(ComponentTemplateService componentTemplateService) {
        this.componentTemplateService = componentTemplateService;
    }

    @GetMapping
    public List<ComponentTemplate> findAll() {
        return componentTemplateService.findAll();
    }

    @PostMapping
    public ComponentTemplate addComponentTemplate(@RequestBody ComponentTemplate componentTemplate){
        componentTemplateService.save(componentTemplate);
        return componentTemplate;
    }

    @GetMapping("/{componentId}")
    public ComponentTemplate findById(Long componentId) {
        return componentTemplateService.findById(componentId);
    }

    @PutMapping("/{componentId}")
    public ComponentTemplate componentTemplate(@RequestBody ComponentTemplate componentTemplate, @PathVariable Long componentId) {
        componentTemplate.setComponentId(componentId);
        componentTemplateService.save(componentTemplate);
        return componentTemplate;
    }

    @DeleteMapping("/{componentId}")
    public String deleteById(@PathVariable Long componentId) {
        componentTemplateService.deleteById(componentId);
        return "Deleted Component Template id: " + componentId;
    }
}
