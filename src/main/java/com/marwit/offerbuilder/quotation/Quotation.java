package com.marwit.offerbuilder.quotation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marwit.offerbuilder.customer.Customer;
import com.marwit.offerbuilder.inquiry.Inquiry;
import com.marwit.offerbuilder.quotationdetails.QuotationDetails;
import com.marwit.offerbuilder.specificationimpl.model.Specification;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quotationId;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @CreatedDate
    @Column(updatable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdDate;

    @Transient
    @JsonProperty
    private String quotationItem;

    @JsonIgnore
    private Inquiry inquiry;

    @ManyToOne
    @JoinColumn(name = "orderDetailsId")
    private QuotationDetails quotationDetails;

    @ManyToOne
    private Specification specification;

    private BigDecimal unitPrice;

    public String getQuotationItem() {
        return "Quotation for" + specification.getSpecificationName();
    }
}
