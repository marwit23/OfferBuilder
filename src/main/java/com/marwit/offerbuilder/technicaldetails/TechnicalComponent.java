package com.marwit.offerbuilder.technicaldetails;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class TechnicalComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long componentId;

    private String componentName;

    @OneToMany
    @JoinColumn(name = "technicalParameterId")
    private List<TechnicalParameter> parameterList;
}
