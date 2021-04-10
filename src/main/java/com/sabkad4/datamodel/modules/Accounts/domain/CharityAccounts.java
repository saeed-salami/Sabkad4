package com.sabkad4.datamodel.modules.Accounts.domain;

import com.sabkad4.datamodel.modules.commonBase.repasitory.CommonBaseData;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tblCharityAccounts")
public class CharityAccounts {

    @Id
    @Column(name = "CharityAccountId")
    private int charityAccountId;

    @ManyToOne
    @JoinColumn(name = "BankId")
    private CommonBaseData commonBaseData;

    @Column(name = "BranchName", nullable = false, length = 500)
    private String branchName;

    @Column(name = "OwnerName", nullable = false, length = 1000)
    private String ownerName;

    @Column(name = "CardNumber", length = 20)
    private String cardNumber;

    @Column(name = "AccountNumber", unique = true, nullable = false, length = 10)
    private String accountNumber;

    @Column(name = "AccountName", length = 500)
    private String accountName;
}
