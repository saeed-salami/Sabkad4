package com.sabkad4.datamodel.modules.Plans.repasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignNeedyToPlans extends JpaRepository<AssignNeedyToPlans, Integer> {
}
