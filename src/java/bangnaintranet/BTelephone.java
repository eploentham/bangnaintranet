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
 * @author root
 */
@Entity
@Table(name = "b_telephone", catalog = "bangna5", schema = "public")
@NamedQueries({@NamedQuery(name = "BTelephone.findAll", query = "SELECT b FROM BTelephone b"), @NamedQuery(name = "BTelephone.findByTelephoneId", query = "SELECT b FROM BTelephone b WHERE b.telephoneId = :telephoneId"), @NamedQuery(name = "BTelephone.findByTelephoneNamet", query = "SELECT b FROM BTelephone b WHERE b.telephoneNamet = :telephoneNamet"), @NamedQuery(name = "BTelephone.findByBranchId", query = "SELECT b FROM BTelephone b WHERE b.branchId = :branchId"), @NamedQuery(name = "BTelephone.findByTelephoneActive", query = "SELECT b FROM BTelephone b WHERE b.telephoneActive = :telephoneActive"), @NamedQuery(name = "BTelephone.findByDescription", query = "SELECT b FROM BTelephone b WHERE b.description = :description"), @NamedQuery(name = "BTelephone.findByRemark", query = "SELECT b FROM BTelephone b WHERE b.remark = :remark")})
public class BTelephone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "telephone_id", nullable = false, length = 255)
    private String telephoneId="";
    @Column(name = "telephone_namet", length = 255)
    private String telephoneNamet="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "telephone_active", length = 255)
    private String telephoneActive="";
    @Column(name = "description", length = 255)
    private String description="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "telephone_status", length = 255)
    private String telephoneStatus="";

    public BTelephone() {
    }
    public String getBTelephone(){
        return "b_telephone";
    }
    public String getFTelephoneId(){
        return "telephone_id";
    }
    public String getFTelephoneNamet(){
        return "telephone_namet";
    }
    public String getFBranchId(){
        return "branch_id";
    }
    public String getFTelephoneActive(){
        return "telephone_active";
    }
    public String getFDescription(){
        return "description";
    }
    public String getFRemark(){
        return "remark";
    }
    public String getFTelephoneStatus(){
        return "telephone_status";
    }



    public BTelephone(String telephoneId) {
        this.telephoneId = telephoneId;
    }

    public String getTelephoneId() {
        return telephoneId;
    }

    public void setTelephoneId(String telephoneId) {
        this.telephoneId = telephoneId;
    }

    public String getTelephoneNamet() {
        return telephoneNamet;
    }

    public void setTelephoneNamet(String telephoneNamet) {
        this.telephoneNamet = telephoneNamet;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getTelephoneActive() {
        return telephoneActive;
    }

    public void setTelephoneActive(String telephoneActive) {
        this.telephoneActive = telephoneActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTelephoneStatus() {
        return telephoneStatus;
    }
    public void setTelephoneStatus(String telephoneStatus) {
        this.telephoneStatus = telephoneStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telephoneId != null ? telephoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BTelephone)) {
            return false;
        }
        BTelephone other = (BTelephone) object;
        if ((this.telephoneId == null && other.telephoneId != null) || (this.telephoneId != null && !this.telephoneId.equals(other.telephoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BTelephone[telephoneId=" + telephoneId + "]";
    }

}
