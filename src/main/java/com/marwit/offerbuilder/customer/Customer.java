package com.marwit.offerbuilder.customer;


import com.marwit.offerbuilder.contactperson.ContactPerson;
import com.marwit.offerbuilder.inquiry.Inquiry;
import com.marwit.offerbuilder.quotation.Quotation;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @NotNull
    private String companyName;
    private String companyAddress;
    private Locale.IsoCountryCode countryCode;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<ContactPerson> contactPersonList;

    @OneToMany(mappedBy = "customer")
    private List<Inquiry> inquiryList;

    @OneToMany(mappedBy = "customer")
    private List<Quotation> quotationList;
}
