package com.marwit.offerbuilder.quotation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marwit.offerbuilder.customer.Customer;
import com.marwit.offerbuilder.customer.Inquiry;
import com.marwit.offerbuilder.technicaldetails.TechnicalSpecification;
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

    private Inquiry inquiry;

    @ManyToOne
    @JoinColumn(name = "orderDetailsId")
    private OrderDetails orderDetails;

    @ManyToOne
    private TechnicalSpecification technicalSpecification;

    private BigDecimal unitPrice;

    public String getQuotationItem() {
        return "Quotation for" + technicalSpecification.getTechnicalDetailsName();
    }
}
