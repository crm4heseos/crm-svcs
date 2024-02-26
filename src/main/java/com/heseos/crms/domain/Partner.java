package com.heseos.crms.domain;

import lombok.Data;

/**
 * This class represents the Channel Partner, Distributor & Sub-Distributor
 */
@Data
public class Partner {
    String id;
    String name;
    String email;
    String firmName;
    String address;
    String district;
    String state;
    String pincode;
    PartnerType type;
}
