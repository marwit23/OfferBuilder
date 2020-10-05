package com.marwit.offerbuilder.specificationtemplate.model;

import com.marwit.offerbuilder._constants.Operator;
import com.marwit.offerbuilder._constants.UnitOfMeasurement;
import com.marwit.offerbuilder._constants.ValueScope;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Getter
@Setter
@Entity
public class ParameterTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parameterId;
    private int priority;

    @NotNull
    private String parameterName;

    @NotNull
    private Operator parameterOperator;

    @Nullable
    private ValueScope valueScope;

    @Null
    private String parameterValue;

    @NotNull
    private UnitOfMeasurement unitOfMeasurement;
}
