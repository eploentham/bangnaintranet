/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pop
 */
@Entity
@Table(name = "b_branch")
@NamedQueries({@NamedQuery(name = "BBranch.findAll", query = "SELECT b FROM BBranch b"), @NamedQuery(name = "BBranch.findByBranchId", query = "SELECT b FROM BBranch b WHERE b.branchId = :branchId"), @NamedQuery(name = "BBranch.findByBranchNamet", query = "SELECT b FROM BBranch b WHERE b.branchNamet = :branchNamet"), @NamedQuery(name = "BBranch.findByFileImportsso", query = "SELECT b FROM BBranch b WHERE b.fileImportsso = :fileImportsso"), @NamedQuery(name = "BBranch.findByBranchStatus", query = "SELECT b FROM BBranch b WHERE b.branchStatus = :branchStatus")})
public class BBranch implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "branch_id", nullable = false, length = 255)
    private String branchId="";
    @Column(name = "branch_namet", length = 255)
    private String branchNamet="";
    @Column(name = "file_importsso", length = 255)
    private String fileImportsso="";
    @Column(name = "branch_status", length = 255)
    private String branchStatus="";

    public BBranch() { 
    }

    public BBranch(String branchId) {
        this.branchId = branchId;
    }
    public String getBBranch() {
        return "b_branch";
    }

    public String getFBranchId() {
        return "branch_id";
    }
    public String getFBranchNamet() {
        return "branch_namet";
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchNamet() {
        return branchNamet;
    }

    public void setBranchNamet(String branchNamet) {
        this.branchNamet = branchNamet;
    }

    public String getFileImportsso() {
        return fileImportsso;
    }

    public void setFileImportsso(String fileImportsso) {
        this.fileImportsso = fileImportsso;
    }

    public String getBranchStatus() {
        return branchStatus;
    }

    public void setBranchStatus(String branchStatus) {
        this.branchStatus = branchStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchId != null ? branchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BBranch)) {
            return false;
        }
        BBranch other = (BBranch) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BBranch[branchId=" + branchId + "]";
    }

}
