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

package com.emanuel.sfgmypetclinic.controllers;

import com.emanuel.sfgmypetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
