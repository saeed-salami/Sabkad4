package com.sabkad4.datamodel.modules.Plans.domain;

import com.sabkad4.datamodel.modules.Accounts.domain.NeedyAccounts;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "tblAssignNeedyToPlans")
public class AssignNeedyToPlans {

    @Id
    @Column(name = "AssignNeedyPlanId")
    private int assignNeedyPlanId;

    @OneToMany
    @JoinColumn(name = "NeedyId")
    private List<NeedyAccounts> needyAccounts;

    @OneToMany(mappedBy = "assignNeedyToPlans")
    @JoinColumn(name = "PlanId")
    private List<Plans> plans;

    @Column(name = "Fdate",nullable = false, length = 10)
    private String fDate;

    @Column(name = "Tdate", nullable = false, length = 10)
    private String tDate;
}
