/*
 * COGNIZANT CONFIDENTIAL AND/OR TRADE SECRET
 *
 * Copyright [2015] - [2020] Cognizant.  All rights reserved.
 *
 * NOTICE: This unpublished material is proprietary to Cognizant and
 * its suppliers, if any.  The methods, techniques and technical
 * concepts herein are considered Cognizant confidential ane/or trade
 * secret information.  This material may be covered by U.S. and/or
 * foreign patents or patent applications.  Use, distribution or
 * copying, in whole or in part, is forbidden, except by express written
 * permission of Cognizant.
 *
 */

package com.emanuel.sfgmypetclinic.bootstrap;

import com.emanuel.sfgmypetclinic.model.Owner;
import com.emanuel.sfgmypetclinic.model.Pet;
import com.emanuel.sfgmypetclinic.model.PetType;
import com.emanuel.sfgmypetclinic.model.Vet;
import com.emanuel.sfgmypetclinic.services.OwnerService;
import com.emanuel.sfgmypetclinic.services.PetTypeService;
import com.emanuel.sfgmypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    // @Autowired is no longer required with a constructor like the following.
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("7205555555");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("7205555555");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
