package com.marwit.offerbuilder.technicaldetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    private Long technicalDetailsId;

    private String technicalDetailsName;

    @OneToMany
    @JoinColumn(name = "technicalComponentId")
    private List<TechnicalComponent> technicalComponentList;
}
