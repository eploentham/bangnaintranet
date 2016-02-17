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
@Table(name = "bhac_b_school_year", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BhacBSchoolYear.findAll", query = "SELECT b FROM BhacBSchoolYear b"), @NamedQuery(name = "BhacBSchoolYear.findBySchoolYearId", query = "SELECT b FROM BhacBSchoolYear b WHERE b.schoolYearId = :schoolYearId"), @NamedQuery(name = "BhacBSchoolYear.findBySchoolYearNamet", query = "SELECT b FROM BhacBSchoolYear b WHERE b.schoolYearNamet = :schoolYearNamet")})
public class BhacBSchoolYear implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "school_year_id", nullable = false, length = 255)
    private String schoolYearId;
    @Column(name = "school_year_namet", length = 255)
    private String schoolYearNamet;

    public BhacBSchoolYear() {
    }
    public String getBhacSchoolYear(){
        return "bhac_school_year";
    }
    public String getFSchoolYearId(){
        return "school_year_id";
    }
    public String getFSchoolYearNamet(){
        return "school_year_namet";
    }

    public BhacBSchoolYear(String schoolYearId) {
        this.schoolYearId = schoolYearId;
    }

    public String getSchoolYearId() {
        return schoolYearId;
    }

    public void setSchoolYearId(String schoolYearId) {
        this.schoolYearId = schoolYearId;
    }

    public String getSchoolYearNamet() {
        return schoolYearNamet;
    }

    public void setSchoolYearNamet(String schoolYearNamet) {
        this.schoolYearNamet = schoolYearNamet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolYearId != null ? schoolYearId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BhacBSchoolYear)) {
            return false;
        }
        BhacBSchoolYear other = (BhacBSchoolYear) object;
        if ((this.schoolYearId == null && other.schoolYearId != null) || (this.schoolYearId != null && !this.schoolYearId.equals(other.schoolYearId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BhacBSchoolYear[schoolYearId=" + schoolYearId + "]";
    }

}
