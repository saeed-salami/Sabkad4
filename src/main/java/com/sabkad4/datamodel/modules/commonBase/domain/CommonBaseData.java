package com.sabkad4.datamodel.modules.commonBase.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblCommonBaseData")
@Data
public class CommonBaseData {

    @Id
    @Column(name = "CommonBaseDataId")
    private int commonBaseDataId;

    @Column(name = "BaseCode", length = 6)
    private String baseCode;

    @Column(name = "BaseValue", length = 800)
    private String baseValue;

    @OneToOne
    @JoinColumn(name = "CommonBaseTypeId")
    private CommonBaseType commonBaseType;

}
