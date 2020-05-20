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
import com.emanuel.sfgmypetclinic.model.Vet;
import com.emanuel.sfgmypetclinic.services.OwnerService;
import com.emanuel.sfgmypetclinic.services.VetService;
import com.emanuel.sfgmypetclinic.services.map.OwnerServiceMap;
import com.emanuel.sfgmypetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
