/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author pop
 */
@Embeddable
public class BBranchDatabasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "branch_id", nullable = false, length = 255)
    private String branchId;
    @Basic(optional = false)
    @Column(name = "host_name", nullable = false, length = 255)
    private String hostName;

    public BBranchDatabasePK() {
    }

    public BBranchDatabasePK(String branchId, String hostName) {
        this.branchId = branchId;
        this.hostName = hostName;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchId != null ? branchId.hashCode() : 0);
        hash += (hostName != null ? hostName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BBranchDatabasePK)) {
            return false;
        }
        BBranchDatabasePK other = (BBranchDatabasePK) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        if ((this.hostName == null && other.hostName != null) || (this.hostName != null && !this.hostName.equals(other.hostName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BBranchDatabasePK[branchId=" + branchId + ", hostName=" + hostName + "]";
    }

}
