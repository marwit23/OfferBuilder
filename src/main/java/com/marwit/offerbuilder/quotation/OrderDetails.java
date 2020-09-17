package com.marwit.offerbuilder.quotation;

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
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private String orderDetailsId;

    @NotNull
    private String orderDetailsDisplayName;

    private List<String> orderDetail;
}
