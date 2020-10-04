package com.marwit.offerbuilder.technicalspecificationimpl.repository;

import com.marwit.offerbuilder.technicalspecificationimpl.model.TechnicalParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicalParameterRepository extends JpaRepository<TechnicalParameter, Long> {
}
