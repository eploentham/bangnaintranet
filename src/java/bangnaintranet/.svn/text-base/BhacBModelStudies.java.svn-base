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
@Table(name = "bhac_b_model_studies", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BhacBModelStudies.findAll", query = "SELECT b FROM BhacBModelStudies b"), @NamedQuery(name = "BhacBModelStudies.findByModelStudiesId", query = "SELECT b FROM BhacBModelStudies b WHERE b.modelStudiesId = :modelStudiesId"), @NamedQuery(name = "BhacBModelStudies.findByModelStudiesNamet", query = "SELECT b FROM BhacBModelStudies b WHERE b.modelStudiesNamet = :modelStudiesNamet"), @NamedQuery(name = "BhacBModelStudies.findByModelStudiesActive", query = "SELECT b FROM BhacBModelStudies b WHERE b.modelStudiesActive = :modelStudiesActive"), @NamedQuery(name = "BhacBModelStudies.findByRemark", query = "SELECT b FROM BhacBModelStudies b WHERE b.remark = :remark")})
public class BhacBModelStudies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "model_studies_id", nullable = false, length = 255)
    private String modelStudiesId;
    @Column(name = "model_studies_namet", length = 255)
    private String modelStudiesNamet;
    @Column(name = "model_studies_active", length = 255)
    private String modelStudiesActive;
    @Column(name = "remark", length = 255)
    private String remark;

    public BhacBModelStudies() {
    }
    public String getBhacBModelStudies(){
        return "bhac_b_model_studies";
    }
    public String getFModelStudiesId(){
        return "model_studies_id";
    }
    public String getFModelStudiesNamet(){
        return "model_studies_namet";
    }
    public String getFModelStudiesActive(){
        return "model_studies_active";
    }
    public String getFRemark(){
        return "remark";
    }

    public BhacBModelStudies(String modelStudiesId) {
        this.modelStudiesId = modelStudiesId;
    }

    public String getModelStudiesId() {
        return modelStudiesId;
    }

    public void setModelStudiesId(String modelStudiesId) {
        this.modelStudiesId = modelStudiesId;
    }

    public String getModelStudiesNamet() {
        return modelStudiesNamet;
    }

    public void setModelStudiesNamet(String modelStudiesNamet) {
        this.modelStudiesNamet = modelStudiesNamet;
    }

    public String getModelStudiesActive() {
        return modelStudiesActive;
    }

    public void setModelStudiesActive(String modelStudiesActive) {
        this.modelStudiesActive = modelStudiesActive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modelStudiesId != null ? modelStudiesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BhacBModelStudies)) {
            return false;
        }
        BhacBModelStudies other = (BhacBModelStudies) object;
        if ((this.modelStudiesId == null && other.modelStudiesId != null) || (this.modelStudiesId != null && !this.modelStudiesId.equals(other.modelStudiesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BhacBModelStudies[modelStudiesId=" + modelStudiesId + "]";
    }

}
