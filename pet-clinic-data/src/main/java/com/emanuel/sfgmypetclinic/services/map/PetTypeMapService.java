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

package com.emanuel.sfgmypetclinic.services.map;

import com.emanuel.sfgmypetclinic.model.PetType;
import com.emanuel.sfgmypetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
