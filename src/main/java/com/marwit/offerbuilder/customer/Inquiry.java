package com.marwit.offerbuilder.customer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.marwit.offerbuilder.customer.ContactPerson;
import com.marwit.offerbuilder.customer.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long inquiryId;

    @Nullable
    private ContactPerson contactPerson;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate localDate;

    @NotNull
    private String message;

}
