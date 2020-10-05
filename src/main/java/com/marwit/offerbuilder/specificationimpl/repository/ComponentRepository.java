package com.marwit.offerbuilder.specificationimpl.repository;

import com.marwit.offerbuilder.specificationimpl.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Long> {
}
