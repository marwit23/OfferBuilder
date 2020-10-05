package com.marwit.offerbuilder.specificationimpl.repository;

import com.marwit.offerbuilder.specificationimpl.model.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecificationRepository extends JpaRepository<Specification, Long> {
}
