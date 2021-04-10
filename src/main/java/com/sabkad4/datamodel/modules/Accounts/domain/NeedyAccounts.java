package com.sabkad4.datamodel.modules.Accounts.domain;

import com.sabkad4.datamodel.modules.commonBase.domain.CommonBaseData;
import com.sabkad4.datamodel.modules.person.domain.Personal;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tblNeedyAccounts")
public class NeedyAccounts {

    @Id
    @Column(name = "NeedyAccountId")
    private int needyAccountId;

    @ManyToOne//need to check
    @JoinColumn(name = "BankId")
    private CommonBaseData commonBaseData;

    @ManyToOne//need to check
    @JoinColumn(name = "NeedyId", nullable = false)
    private Personal personal;

    @Column(name = "OwnerName", nullable = false, length = 1000)
    private String ownerName;

    @Column(name = "CardNumber", length = 20)
    private String cardNumber;

    @Column(name = "AccountNumber", unique = true, nullable = false, length = 10)
    private String accountNumber;

    @Column(name = "AccountName", length = 500)
    private String accountName;

    @Column(name = "ShebaNumber", unique = true, nullable = false, length = 26)
    private String shebaNumber;

}
