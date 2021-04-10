package com.sabkad4.datamodel.modules.person.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tblPersonal")
public class Personal {

    @Id
    @Column(name = "PersonId")
    private int personId;

    @Column(name = "Name", nullable = false, length = 500)
    private String name;

    @Column(name = "Family", nullable = false, length = 500)
    private String family;

    @Column(name = "NationalCode", length = 10)
    private String nationalCode;

    @Column(name = "IdNumber", length = 10)
    private String idNumber;

    @Column(name = "Sex", nullable = false)
    private boolean sex;

    @Column(name = "BirthDate", length = 10)
    private String birthDate;

    @Column(name = "BirthPlace", length = 500)
    private String birthPlace;

    @Column(name = "PersonType", nullable = false)//need change
    private int personType;

    @Column(name = "PersonPhoto")//need change
    private String personPhoto;

    @Column(name = "SecretCode", length = 20)
    private String secretCode;


}
