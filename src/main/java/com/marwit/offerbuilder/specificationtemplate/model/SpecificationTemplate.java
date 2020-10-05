package com.marwit.offerbuilder.specificationtemplate.model;

import com.marwit.offerbuilder.specificationimpl.model.Component;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class SpecificationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long specificationTemplateId;
    private String specificationTemplateName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Component> componentList;
}
