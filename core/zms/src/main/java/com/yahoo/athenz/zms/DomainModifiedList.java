//
// This file generated by rdl 1.4.12. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainModifiedList - A list of {domain, modified-timestamp} tuples.
//
public class DomainModifiedList {
    public List<DomainModified> nameModList;

    public DomainModifiedList setNameModList(List<DomainModified> nameModList) {
        this.nameModList = nameModList;
        return this;
    }
    public List<DomainModified> getNameModList() {
        return nameModList;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainModifiedList.class) {
                return false;
            }
            DomainModifiedList a = (DomainModifiedList) another;
            if (nameModList == null ? a.nameModList != null : !nameModList.equals(a.nameModList)) {
                return false;
            }
        }
        return true;
    }
}
