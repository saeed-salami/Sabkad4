package com.sabkad4.datamodel.modules.commonBase.domain;

import lombok.CustomLog;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblCommonBaseType")
@Data
public class CommonBaseType {

    @Id
    @Column(name = "CommonBaseTypeId")
    private int commonBaseTypeId;

    @Column(name = "BaseTypeTitle", length = 800, unique = true, nullable = false)
    private String baseTypeTitle;

    @Column(name = "BaseTypeCode", unique = true, length = 3)
    private String baseTypeCode;

    @OneToOne(mappedBy = "commonBaseType", optional = false)
    private CommonBaseData commonBaseData;

}
