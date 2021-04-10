package com.sabkad4.datamodel.modules.person.repasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Personal extends JpaRepository<Personal, Integer> {
}
