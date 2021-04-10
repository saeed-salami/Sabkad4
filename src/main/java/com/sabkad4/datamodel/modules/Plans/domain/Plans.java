package com.sabkad4.datamodel.modules.Plans.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tblPlans")
public class Plans {

    @Id
    @Column(name = "PlanId")
    private int planId;

    @Column(name = "PlanName", unique = true, nullable = false, length = 1000)
    private String planName;

    @Column(name = "Description")
    private String description;

    @Column(name = "PlanNature")//need change
    private boolean planNature;

    @Column(name = "ParentPlanId")//need to check
    private int parentPlanId;

    @Column(name = "Icon")//need to check
    private String icon;

    @Column(name = "Fdate", length = 10)
    private String fDate;

    @Column(name = "Tdate", length = 10)
    private String tDate;

    @Column(name = "NeededLogin", nullable = false)
    private boolean neededLogin;

    @ManyToOne//need to check
    private AssignNeedyToPlans assignNeedyToPlans;

}
