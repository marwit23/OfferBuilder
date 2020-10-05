package com.marwit.offerbuilder.specificationimpl.model;

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

@Getter
@Setter
@Entity
public class Parameter {

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

    // ! add not null constraint later
    private String parameterValue;

    @NotNull
    private UnitOfMeasurement unitOfMeasurement;
}
