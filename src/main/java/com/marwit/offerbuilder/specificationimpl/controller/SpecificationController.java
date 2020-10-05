package com.marwit.offerbuilder.specificationimpl.controller;

import com.marwit.offerbuilder.specificationimpl.model.Specification;
import com.marwit.offerbuilder.specificationimpl.service.SpecificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specifications")
public class SpecificationController {

    private SpecificationService specificationService;

    public SpecificationController(SpecificationService specificationService) {
        this.specificationService = specificationService;
    }

    @GetMapping
    public List<Specification> findAll() {
        return specificationService.findAll();
    }

    @PostMapping
    public Specification addSpecification(@RequestBody Specification specification){
        specificationService.save(specification);
        return specification;
    }

    @GetMapping("/{specificationId}")
    public Specification findById(Long specificationId) {
        return specificationService.findById(specificationId);
    }

    @PutMapping("/{specificationId}")
    public Specification updateSpecification(@RequestBody Specification specification, @PathVariable Long specificationId) {
        specification.setSpecificationId(specificationId);
        specificationService.save(specification);
        return specification;
    }

    @DeleteMapping("/{specificationId}")
    public String deleteById(@PathVariable Long specificationId) {
        specificationService.deleteById(specificationId);
        return "Deleted Specification id: " + specificationId;
    }
}
