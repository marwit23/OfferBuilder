package com.marwit.offerbuilder.technicalspecificationimpl.repository;

import com.marwit.offerbuilder.technicalspecificationimpl.model.TechnicalSpecification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicalSpecificationRepository extends JpaRepository<TechnicalSpecification, Long> {
}
