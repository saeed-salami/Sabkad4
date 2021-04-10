package com.sabkad4.datamodel.modules.Accounts.domain;

import com.sabkad4.datamodel.modules.person.domain.Personal;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "tblPayment")
public class Payment {

    @Id
    @Column(name = "PaymentId")
    private int paymentId;

    @OneToMany
    @JoinColumn(name = "DonatorId")
    private List<Personal> personals;

    @OneToMany
    @JoinColumn(name = "DonatorId")
    private List<CashAssistanceDetail> cashAssistanceDetails;

    @Column(name = "PaymentPrice", nullable = false)
    private long paymentPrice;

    @Column(name = "PaymentGatewayId", length = 10)
    private String paymentGatewayId;

    @Column(name = "PaymentDate")
    @CreationTimestamp
    private LocalDateTime paymentDate;

    @Column(name = "PaymentStatus", nullable = false, length = 500)
    private String paymentStatus;

    @Column(name = "SourceAccoutNumber", length = 10)
    private String sourceAccoutNumber;

    @Column(name = "TargetAccountNumber", nullable = false,length = 10)
    private String targetAccountNumber;

    @OneToMany//need to check
    @JoinColumn(name = "CharityAccountId")
    private List<CharityAccounts> charityAccounts;

    @Column(name = "FollowCode", nullable = false, length = 10)
    private String followCode;

    @OneToMany//need to check
    @JoinColumn(name = "NeedyId")
    private List<NeedyAccounts> needyAccounts;

}
