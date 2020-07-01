package com.emanuel.sfgmypetclinic.repositories;

import com.emanuel.sfgmypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
