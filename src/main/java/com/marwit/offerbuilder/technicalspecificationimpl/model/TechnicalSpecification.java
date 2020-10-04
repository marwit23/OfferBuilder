package com.marwit.offerbuilder.technicalspecificationimpl.model;

import com.marwit.offerbuilder.technicalspecificationimpl.model.TechnicalComponent;
import com.marwit.offerbuilder.technicalspecificationtemplate.model.TechnicalComponentTemplate;
import com.marwit.offerbuilder.technicalspecificationtemplate.model.TechnicalSpecificationTemplate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class TechnicalSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long technicalSpecificationId;

    private String technicalSpecificationName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TechnicalComponent> technicalComponentList;

    @ManyToOne
    private TechnicalSpecificationTemplate technicalSpecificationTemplate;
}
