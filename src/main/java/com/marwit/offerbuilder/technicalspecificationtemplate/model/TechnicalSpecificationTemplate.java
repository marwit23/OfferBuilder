package com.marwit.offerbuilder.technicalspecificationtemplate.model;

import com.marwit.offerbuilder.technicalspecificationimpl.model.TechnicalComponent;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class TechnicalSpecificationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long technicalSpecificationTemplateId;
    private String technicalSpecificationTemplateName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TechnicalComponent> technicalComponentList;
}
