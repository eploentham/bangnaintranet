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
@Table(name = "dental_t_daily_summary", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "DentalTDailySummary.findAll", query = "SELECT d FROM DentalTDailySummary d"), @NamedQuery(name = "DentalTDailySummary.findByDentalDailyId", query = "SELECT d FROM DentalTDailySummary d WHERE d.dentalDailyId = :dentalDailyId"), @NamedQuery(name = "DentalTDailySummary.findByDateSummary", query = "SELECT d FROM DentalTDailySummary d WHERE d.dateSummary = :dateSummary"), @NamedQuery(name = "DentalTDailySummary.findByPatientCnt", query = "SELECT d FROM DentalTDailySummary d WHERE d.patientCnt = :patientCnt"), @NamedQuery(name = "DentalTDailySummary.findByPatientSummary", query = "SELECT d FROM DentalTDailySummary d WHERE d.patientSummary = :patientSummary"), @NamedQuery(name = "DentalTDailySummary.findByRemark", query = "SELECT d FROM DentalTDailySummary d WHERE d.remark = :remark"), @NamedQuery(name = "DentalTDailySummary.findByDentalActive", query = "SELECT d FROM DentalTDailySummary d WHERE d.dentalActive = :dentalActive"), @NamedQuery(name = "DentalTDailySummary.findByUcTreatment", query = "SELECT d FROM DentalTDailySummary d WHERE d.ucTreatment = :ucTreatment"), @NamedQuery(name = "DentalTDailySummary.findByUcPrevention", query = "SELECT d FROM DentalTDailySummary d WHERE d.ucPrevention = :ucPrevention")})
public class DentalTDailySummary implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dental_daily_id", nullable = false, length = 255)
    private String dentalDailyId="";
    @Column(name = "dental_date", length = 255)
    private String dentalDate="";
    @Column(name = "patient_cnt", precision = 17, scale = 17)
    private Double patientCnt=0.0;
    @Column(name = "patient_summary", precision = 17, scale = 17)
    private Double patientSummary=0.0;
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "dental_active", length = 255)
    private String dentalActive="";
    @Column(name = "uc_treatment", precision = 17, scale = 17)
    private Double ucTreatment=0.0;
    @Column(name = "uc_prevention", precision = 17, scale = 17)
    private Double ucPrevention=0.0;
    @Column(name = "user_id_create", length = 255)
    private String userIdCreate="";
    @Column(name = "user_id_modify", length = 255)
    private String userIdModify="";
    @Column(name = "user_id_cancel", length = 255)
    private String userIdCancel="";
    @Column(name = "date_create", length = 255)
    private String dateCreate="";
    @Column(name = "date_modify", length = 255)
    private String dateModify="";
    @Column(name = "date_cancel", length = 255)
    private String dateCancel="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "patient_cnt_vn", length = 255)
    private Double patientCntVn=0.0;

    public DentalTDailySummary() {
    }

    public String getDentalTDailySummary() {
        return "dental_t_daily_summary";
    }

    public String getFDentalDailyId() {
        return "dental_daily_id";
    }
    public String getFDentalDate() {
        return "dental_date";
    }
    public String getFPatientCnt() {
        return "patient_cnt";
    }
    public String getFPatientSummary() {
        return "patient_summary";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFDentalActive() {
        return "dental_active";
    }
    public String getFUcTreatment() {
        return "uc_treatment";
    }
    public String getFUcPreventiont() {
        return "uc_prevention";
    }
    public String getFUserIdCreate() {
        return "user_id_create";
    }
    public String getFUserIdModify() {
        return "user_id_modify";
    }
    public String getFUserIdCancel() {
        return "user_id_cancel";
    }
    public String getFDateCreate() {
        return "date_create";
    }
    public String getFDateModify() {
        return "date_modify";
    }
    public String getFDateCancel() {
        return "date_cancel";
    }
    public String getFBranchId() {
        return "branch_id";
    }
    public String getFPatientCntVn() {
        return "patient_cnt_vn";
    }

    public DentalTDailySummary(String dentalDailyId) {
        this.dentalDailyId = dentalDailyId;
    }

    public String getDentalDailyId() {
        return dentalDailyId;
    }

    public void setDentalDailyId(String dentalDailyId) {
        this.dentalDailyId = dentalDailyId;
    }

    public String getDentalDate() {
        return dentalDate;
    }

    public void setDentalDate(String dentalDate) {
        this.dentalDate = dentalDate;
    }

    public Double getPatientCnt() {
        return patientCnt;
    }

    public void setPatientCnt(Double patientCnt) {
        this.patientCnt = patientCnt;
    }

    public Double getPatientSummary() {
        return patientSummary;
    }

    public void setPatientSummary(Double patientSummary) {
        this.patientSummary = patientSummary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDentalActive() {
        return dentalActive;
    }

    public void setDentalActive(String dentalActive) {
        this.dentalActive = dentalActive;
    }

    public Double getUcTreatment() {
        return ucTreatment;
    }

    public void setUcTreatment(Double ucTreatment) {
        this.ucTreatment = ucTreatment;
    }

    public Double getUcPrevention() {
        return ucPrevention;
    }

    public void setUcPrevention(Double ucPrevention) {
        this.ucPrevention = ucPrevention;
    }
    public String getUserIdCreate() {
        return userIdCreate;
    }
    public void setUserIdCreate(String userIdCreate) {
        this.userIdCreate = userIdCreate;
    }

    public String getUserIdModify() {
        return userIdModify;
    }
    public void setUserIdModify(String userIdModify) {
        this.userIdModify = userIdModify;
    }

    public String getUserIdCancel() {
        return userIdCancel;
    }
    public void setUserIdCancel(String userIdCancel) {
        this.userIdCancel = userIdCancel;
    }

    public String getDateCreate() {
        return dateCreate;
    }
    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateModify() {
        return dateModify;
    }
    public void setDateModify(String dateModify) {
        this.dateModify = dateModify;
    }

    public String getDateCancel() {
        return dateCancel;
    }
    public void setDateCancel(String dateCancel) {
        this.dateCancel = dateCancel;
    }
    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Double getPatientCntVn() {
        return patientCntVn;
    }
    public void setPatientCntVn(Double patientCntVn) {
        this.patientCntVn = patientCntVn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dentalDailyId != null ? dentalDailyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DentalTDailySummary)) {
            return false;
        }
        DentalTDailySummary other = (DentalTDailySummary) object;
        if ((this.dentalDailyId == null && other.dentalDailyId != null) || (this.dentalDailyId != null && !this.dentalDailyId.equals(other.dentalDailyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.DentalTDailySummary[dentalDailyId=" + dentalDailyId + "]";
    }

}
