package com.sabkad4.datamodel.modules.Accounts.repasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeedyAccounts extends JpaRepository<NeedyAccounts, Integer> {
}
