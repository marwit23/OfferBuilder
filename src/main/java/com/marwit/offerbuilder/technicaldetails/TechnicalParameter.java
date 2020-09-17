package com.marwit.offerbuilder.technicaldetails;

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
public class TechnicalParameter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parameterId;

    @NotNull
    private String parameterName;

    private Operator parameterOperator;

    private ValueScope valueScope;

    @NotNull
    private String parameterValue;

    private UnitOfMeasurement unitOfMeasurement;
}
