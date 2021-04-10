package com.sabkad4.datamodel.modules.commonBase.repasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonBaseData extends JpaRepository<CommonBaseData , Integer> {
}
