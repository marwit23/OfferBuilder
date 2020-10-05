package com.marwit.offerbuilder.specificationimpl.model;

import com.marwit.offerbuilder.specificationtemplate.model.SpecificationTemplate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Specification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long specificationId;

    private String specificationName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Component> componentList;

    @ManyToOne
    private SpecificationTemplate specificationTemplate;
}
