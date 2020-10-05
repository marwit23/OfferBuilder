package com.marwit.offerbuilder.specificationtemplate.repository;

import com.marwit.offerbuilder.specificationtemplate.model.ComponentTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentTemplateRepo extends JpaRepository<ComponentTemplate, Long> {
}
