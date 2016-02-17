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
@Table(name = "doctor_b_checkup_form", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "DoctorBCheckupForm.findAll", query = "SELECT b FROM DoctorBDoctorCheckupForm b"), @NamedQuery(name = "DoctorBCheckupForm.findByCheckupFormId", query = "SELECT b FROM DoctorBCheckupForm b WHERE b.checkupFormId = :checkupFormId"), @NamedQuery(name = "DoctorBCheckupForm.findByCheckupFormNamet", query = "SELECT b FROM DoctorBCheckupForm b WHERE b.checkupFormNamet = :checkupFormNamet"), @NamedQuery(name = "DoctorBCheckupForm.findByCheckupActive", query = "SELECT b FROM DoctorBCheckupForm b WHERE b.checkupActive = :checkupActive")})
public class DoctorBCheckupForm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "checkup_form_id", nullable = false, length = 255)
    private String checkupFormId;
    @Column(name = "checkup_form_namet", length = 255)
    private String checkupFormNamet;
    @Column(name = "checkup_active", length = 255)
    private String checkupActive;

    public DoctorBCheckupForm() {
    }
    public String getBDoctorCheckupForm() {
        return "doctor_b_checkup_form";
    }
    public String getFChcekupFormId() {
        return "checkup_form_id";
    }
    public String getFChcekupFormNamet() {
        return "checkup_form_namet";
    }
    public String getFChcekupFormActive() {
        return "checkup_active";
    }

    public DoctorBCheckupForm(String checkupFormId) {
        this.checkupFormId = checkupFormId;
    }

    public String getCheckupFormId() {
        return checkupFormId;
    }

    public void setCheckupFormId(String checkupFormId) {
        this.checkupFormId = checkupFormId;
    }

    public String getCheckupFormNamet() {
        return checkupFormNamet;
    }

    public void setCheckupFormNamet(String checkupFormNamet) {
        this.checkupFormNamet = checkupFormNamet;
    }

    public String getCheckupActive() {
        return checkupActive;
    }

    public void setCheckupActive(String checkupActive) {
        this.checkupActive = checkupActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checkupFormId != null ? checkupFormId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorBCheckupForm)) {
            return false;
        }
        DoctorBCheckupForm other = (DoctorBCheckupForm) object;
        if ((this.checkupFormId == null && other.checkupFormId != null) || (this.checkupFormId != null && !this.checkupFormId.equals(other.checkupFormId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.DoctorBCheckupForm[checkupFormId=" + checkupFormId + "]";
    }

}
