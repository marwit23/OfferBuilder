package com.marwit.offerbuilder.specificationimpl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long componentId;
    private int priority;

    private String componentName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Parameter> parameterList;
}
