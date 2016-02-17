/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pop
 */
@Entity
@Table(name = "b_branch_database", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BBranchDatabase.findAll", query = "SELECT b FROM BBranchDatabase b"), @NamedQuery(name = "BBranchDatabase.findByBranchId", query = "SELECT b FROM BBranchDatabase b WHERE b.bBranchDatabasePK.branchId = :branchId"), @NamedQuery(name = "BBranchDatabase.findByHostName", query = "SELECT b FROM BBranchDatabase b WHERE b.bBranchDatabasePK.hostName = :hostName"), @NamedQuery(name = "BBranchDatabase.findByHostUserName", query = "SELECT b FROM BBranchDatabase b WHERE b.hostUserName = :hostUserName"), @NamedQuery(name = "BBranchDatabase.findByHostPassword", query = "SELECT b FROM BBranchDatabase b WHERE b.hostPassword = :hostPassword"), @NamedQuery(name = "BBranchDatabase.findByHostDatabaseName", query = "SELECT b FROM BBranchDatabase b WHERE b.hostDatabaseName = :hostDatabaseName"), @NamedQuery(name = "BBranchDatabase.findByHostDatabaseDriver", query = "SELECT b FROM BBranchDatabase b WHERE b.hostDatabaseDriver = :hostDatabaseDriver"), @NamedQuery(name = "BBranchDatabase.findByHostAddress", query = "SELECT b FROM BBranchDatabase b WHERE b.hostAddress = :hostAddress")})
public class BBranchDatabase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BBranchDatabasePK bBranchDatabasePK;
    @Column(name = "host_user_name", length = 255)
    private String hostUserName;
    @Column(name = "host_password", length = 255)
    private String hostPassword;
    @Column(name = "host_database_name", length = 255)
    private String hostDatabaseName;
    @Column(name = "host_database_driver", length = 255)
    private String hostDatabaseDriver;
    @Column(name = "host_address", length = 255)
    private String hostAddress;

    public BBranchDatabase() {
    }

    public BBranchDatabase(BBranchDatabasePK bBranchDatabasePK) {
        this.bBranchDatabasePK = bBranchDatabasePK;
    }

    public BBranchDatabase(String branchId, String hostName) {
        this.bBranchDatabasePK = new BBranchDatabasePK(branchId, hostName);
    }

    public BBranchDatabasePK getBBranchDatabasePK() {
        return bBranchDatabasePK;
    }

    public void setBBranchDatabasePK(BBranchDatabasePK bBranchDatabasePK) {
        this.bBranchDatabasePK = bBranchDatabasePK;
    }

    public String getHostUserName() {
        return hostUserName;
    }

    public void setHostUserName(String hostUserName) {
        this.hostUserName = hostUserName;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public void setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
    }

    public String getHostDatabaseName() {
        return hostDatabaseName;
    }

    public void setHostDatabaseName(String hostDatabaseName) {
        this.hostDatabaseName = hostDatabaseName;
    }

    public String getHostDatabaseDriver() {
        return hostDatabaseDriver;
    }

    public void setHostDatabaseDriver(String hostDatabaseDriver) {
        this.hostDatabaseDriver = hostDatabaseDriver;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bBranchDatabasePK != null ? bBranchDatabasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BBranchDatabase)) {
            return false;
        }
        BBranchDatabase other = (BBranchDatabase) object;
        if ((this.bBranchDatabasePK == null && other.bBranchDatabasePK != null) || (this.bBranchDatabasePK != null && !this.bBranchDatabasePK.equals(other.bBranchDatabasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BBranchDatabase[bBranchDatabasePK=" + bBranchDatabasePK + "]";
    }

}
