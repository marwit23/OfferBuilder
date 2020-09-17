package com.marwit.offerbuilder.customer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class ContactPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactPersonId;

    @NotNull
    private String contactPersonName;

    @Email
    private String contactPersonEmail;

    private String contactPersonPhoneNumber;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


}
