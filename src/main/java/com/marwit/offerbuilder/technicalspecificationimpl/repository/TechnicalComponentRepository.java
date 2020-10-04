package com.marwit.offerbuilder.technicalspecificationimpl.repository;

import com.marwit.offerbuilder.technicalspecificationimpl.model.TechnicalComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicalComponentRepository extends JpaRepository<TechnicalComponent, Long> {
}
