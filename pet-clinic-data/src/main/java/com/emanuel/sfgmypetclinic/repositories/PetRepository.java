package com.emanuel.sfgmypetclinic.repositories;

import com.emanuel.sfgmypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
