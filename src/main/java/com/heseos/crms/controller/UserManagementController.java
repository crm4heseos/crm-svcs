package com.heseos.crms.controller;

import com.heseos.crms.domain.Partner;
import com.heseos.crms.exceptions.BadRequestException;
import com.heseos.crms.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
public class UserManagementController extends BaseController{

    @Autowired
    UserManagementService userManagementService;

    @PostMapping("/addPartner")
    public ResponseEntity<Partner> addPartner(@RequestBody Partner requestPartner) throws BadRequestException {
        System.out.println(userManagementService);
        System.out.println(requestPartner);
        Partner responsePartner = userManagementService.addPartner(requestPartner);
        if (Objects.isNull(responsePartner)){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(responsePartner);
        }

    }
}
