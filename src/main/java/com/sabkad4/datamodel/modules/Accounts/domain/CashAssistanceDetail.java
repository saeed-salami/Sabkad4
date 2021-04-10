package com.sabkad4.datamodel.modules.Accounts.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tblCashAssistanceDetail")
public class CashAssistanceDetail {

    @Id
    @Column(name = "CashAssistanceDetailId")
    private int cashAssistanceDetailId;

    @Column(name = "AssignNeedyPlanId")
    private int assignNeedyPlanId;

    @Column(name = "PlanId")
    private int planId;

    @Column(name = "NeededPrice")
    private long neededPrice;

    @Column(name = "MinPrice")
    private long minPrice;

    @Column(name = "Description")
    private String description;

}
