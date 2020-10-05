package com.marwit.offerbuilder.specificationtemplate.model;

import com.marwit.offerbuilder.specificationimpl.model.Parameter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class ComponentTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long componentId;
    private int priority;

    private String componentName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Parameter> parameterList;
}
