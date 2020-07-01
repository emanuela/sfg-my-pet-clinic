package com.emanuel.sfgmypetclinic.repositories;

import com.emanuel.sfgmypetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
