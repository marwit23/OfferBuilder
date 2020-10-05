package com.marwit.offerbuilder.specificationimpl.repository;

import com.marwit.offerbuilder.specificationimpl.model.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {
}
