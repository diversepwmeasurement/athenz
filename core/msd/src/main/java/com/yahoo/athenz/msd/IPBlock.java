//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// IPBlock - Struct representing ip blocks used by network policy in CIDR
// (Classless inter-domain routing) format
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class IPBlock {
    public String cidr;

    public IPBlock setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return cidr;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != IPBlock.class) {
                return false;
            }
            IPBlock a = (IPBlock) another;
            if (cidr == null ? a.cidr != null : !cidr.equals(a.cidr)) {
                return false;
            }
        }
        return true;
    }
}
