package com.marwit.offerbuilder.quotationdetails;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
public class QuotationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long quotationDetailsId;

    @NotNull
    private String quotationDetailsDisplayName;

    private List<String> quotationDetail;
}
