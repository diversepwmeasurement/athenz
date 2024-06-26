//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// BulkWorkloadResponse - response of a bulk workload search request
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkWorkloadResponse {
    public List<DomainServices> unmodifiedServices;
    public Workloads workloads;

    public BulkWorkloadResponse setUnmodifiedServices(List<DomainServices> unmodifiedServices) {
        this.unmodifiedServices = unmodifiedServices;
        return this;
    }
    public List<DomainServices> getUnmodifiedServices() {
        return unmodifiedServices;
    }
    public BulkWorkloadResponse setWorkloads(Workloads workloads) {
        this.workloads = workloads;
        return this;
    }
    public Workloads getWorkloads() {
        return workloads;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != BulkWorkloadResponse.class) {
                return false;
            }
            BulkWorkloadResponse a = (BulkWorkloadResponse) another;
            if (unmodifiedServices == null ? a.unmodifiedServices != null : !unmodifiedServices.equals(a.unmodifiedServices)) {
                return false;
            }
            if (workloads == null ? a.workloads != null : !workloads.equals(a.workloads)) {
                return false;
            }
        }
        return true;
    }
}
