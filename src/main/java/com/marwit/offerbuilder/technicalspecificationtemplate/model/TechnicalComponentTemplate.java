package com.marwit.offerbuilder.technicalspecificationtemplate.model;

import com.marwit.offerbuilder.technicalspecificationimpl.model.TechnicalParameter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class TechnicalComponentTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long componentId;
    private int priority;

    private String componentName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TechnicalParameter> parameterList;
}
