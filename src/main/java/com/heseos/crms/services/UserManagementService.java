package com.heseos.crms.services;

import com.heseos.crms.domain.Partner;
import com.heseos.crms.exceptions.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class UserManagementService {
    public Partner addPartner(Partner partner) throws BadRequestException {
        if ("0000".equals(partner.getId())) return null;
        return partner;
    }
}
