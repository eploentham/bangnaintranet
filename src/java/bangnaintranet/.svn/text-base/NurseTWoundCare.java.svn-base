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
@Table(name = "nurse_t_wound_care", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "NurseTWoundCare.findAll", query = "SELECT n FROM NurseTWoundCare n"), @NamedQuery(name = "NurseTWoundCare.findByWoundCareId", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundCareId = :woundCareId"), @NamedQuery(name = "NurseTWoundCare.findByPatientHnNo", query = "SELECT n FROM NurseTWoundCare n WHERE n.patientHnNo = :patientHnNo"), @NamedQuery(name = "NurseTWoundCare.findByPatientAge", query = "SELECT n FROM NurseTWoundCare n WHERE n.patientAge = :patientAge"), @NamedQuery(name = "NurseTWoundCare.findByPatientFullNamet", query = "SELECT n FROM NurseTWoundCare n WHERE n.patientFullNamet = :patientFullNamet"), @NamedQuery(name = "NurseTWoundCare.findByPatientAn", query = "SELECT n FROM NurseTWoundCare n WHERE n.patientAn = :patientAn"), @NamedQuery(name = "NurseTWoundCare.findByPatientPhoneNumber", query = "SELECT n FROM NurseTWoundCare n WHERE n.patientPhoneNumber = :patientPhoneNumber"), @NamedQuery(name = "NurseTWoundCare.findByPatientBedRoom", query = "SELECT n FROM NurseTWoundCare n WHERE n.patientBedRoom = :patientBedRoom"), @NamedQuery(name = "NurseTWoundCare.findByWoundCareRunningDocNo", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundCareRunningDocNo = :woundCareRunningDocNo"), @NamedQuery(name = "NurseTWoundCare.findByWoundCause", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundCause = :woundCause"), @NamedQuery(name = "NurseTWoundCare.findByWoundType", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundType = :woundType"), @NamedQuery(name = "NurseTWoundCare.findByWoundAppearance", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundAppearance = :woundAppearance"), @NamedQuery(name = "NurseTWoundCare.findByWoundCategory", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundCategory = :woundCategory"), @NamedQuery(name = "NurseTWoundCare.findByWoundLocation", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundLocation = :woundLocation"), @NamedQuery(name = "NurseTWoundCare.findByWoundTreatmentCuredEstimate", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundTreatmentCuredEstimate = :woundTreatmentCuredEstimate"), @NamedQuery(name = "NurseTWoundCare.findByWoundTreatmentCuredReal", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundTreatmentCuredReal = :woundTreatmentCuredReal"), @NamedQuery(name = "NurseTWoundCare.findByNurseRemark", query = "SELECT n FROM NurseTWoundCare n WHERE n.nurseRemark = :nurseRemark"), @NamedQuery(name = "NurseTWoundCare.findByWoundDescription", query = "SELECT n FROM NurseTWoundCare n WHERE n.woundDescription = :woundDescription")})
public class NurseTWoundCare implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wound_care_id", nullable = false, length = 255)
    private String woundCareId="";
    @Column(name = "patient_hn_no", length = 255)
    private String patientHnNo="";
    @Column(name = "patient_age", length = 255)
    private String patientAge="";
    @Column(name = "patient_full_namet", length = 255)
    private String patientFullNamet="";
    @Column(name = "patient_an", length = 255)
    private String patientAn="";
    @Column(name = "patient_phone_number", length = 255)
    private String patientPhoneNumber="";
    @Column(name = "patient_bed_room", length = 255)
    private String patientBedRoom="";
    @Column(name = "wound_care_running_doc_no", length = 255)
    private String woundCareRunningDocNo="";
    @Column(name = "wound_cause", length = 255)
    private String woundCause="";
    @Column(name = "wound_type", length = 255)
    private String woundType="";
    @Column(name = "wound_appearance", length = 255)
    private String woundAppearance="";
    @Column(name = "wound_category", length = 255)
    private String woundCategory="";
    @Column(name = "wound_location", length = 255)
    private String woundLocation="";
    @Column(name = "wound_treatment_cured_estimate", length = 255)
    private String woundTreatmentCuredEstimate="";
    @Column(name = "wound_treatment_cured_real", length = 255)
    private String woundTreatmentCuredReal="";
    @Column(name = "nurse_remark", length = 255)
    private String nurseRemark="";
    @Column(name = "wound_description", length = 255)
    private String woundDescription="";
    @Column(name = "wound_care_date_start", length = 255)
    private String woundCareDateStart="";
    @Column(name = "wound_care_date_end", length = 255)
    private String woundCareDateEnd="";
    @Column(name = "wound_care_active", length = 255)
    private String woundCareActive="";
    @Column(name = "wound_care_status", length = 255)
    private String woundCareStatus="";
    @Column(name = "user_remark", length = 255)
    private String userRemark="";

    public NurseTWoundCare() {
    }
    public String NurseTWoundCare() {
        return "nurse_t_wound_care";
    }
    public String WoundCareId() {
        return "wound_care_id";
    }
    public String PatientHnNo() {
        return "patient_hn_no";
    }
    public String PatientAge() {
        return "patient_age";
    }
    public String PatientFullNameT() {
        return "patient_full_namet";
    }
    public String PatientAN() {
        return "patient_an";
    }
    public String PatientPhoneNumber() {
        return "patient_phone_number";
    }
    public String PatientBedRoom() {
        return "patient_bed_room";
    }
    public String WoundCareRunningDocNo() {
        return "wound_care_running_doc_no";
    }
    public String WoundCause() {
        return "wound_cause";
    }
    public String WoundType() {
        return "wound_Type";
    }
    public String WoundAppearance() {
        return "wound_appearance";
    }
    public String WoundCategory() {
        return "wound_category";
    }
    public String WoundLocation() {
        return "wound_location";
    }
    public String WoundTreatmentCuredEstimate() {
        return "wound_treatment_cured_estimate";
    }
    public String WoundTreatmentCuredReal() {
        return "wound_treatment_cured_real";
    }
    public String NurseRemark() {
        return "nurse_remark";
    }
    public String WoundDescription() {
        return "wound_description";
    }
    public String WoundCareDateStart() {
        return "wound_care_date_start";
    }
    public String WoundCareDateEnd() {
        return "wound_care_date_end";
    }
    public String WoundCareActive() {
        return "wound_care_active";
    }
    public String WoundCareStatus() {
        return "wound_care_status";
    }
    
    public NurseTWoundCare(String woundCareId) {
        this.woundCareId = woundCareId;
    }

    public String getWoundCareId() {
        return woundCareId;
    }

    public void setWoundCareId(String woundCareId) {
        this.woundCareId = woundCareId;
    }

    public String getPatientHnNo() {
        return patientHnNo;
    }

    public void setPatientHnNo(String patientHnNo) {
        this.patientHnNo = patientHnNo;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientFullNamet() {
        return patientFullNamet;
    }

    public void setPatientFullNamet(String patientFullNamet) {
        this.patientFullNamet = patientFullNamet;
    }

    public String getPatientAn() {
        return patientAn;
    }

    public void setPatientAn(String patientAn) {
        this.patientAn = patientAn;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientBedRoom() {
        return patientBedRoom;
    }

    public void setPatientBedRoom(String patientBedRoom) {
        this.patientBedRoom = patientBedRoom;
    }

    public String getWoundCareRunningDocNo() {
        return woundCareRunningDocNo;
    }

    public void setWoundCareRunningDocNo(String woundCareRunningDocNo) {
        this.woundCareRunningDocNo = woundCareRunningDocNo;
    }

    public String getWoundCause() {
        return woundCause;
    }

    public void setWoundCause(String woundCause) {
        this.woundCause = woundCause;
    }

    public String getWoundType() {
        return woundType;
    }

    public void setWoundType(String woundType) {
        this.woundType = woundType;
    }

    public String getWoundAppearance() {
        return woundAppearance;
    }

    public void setWoundAppearance(String woundAppearance) {
        this.woundAppearance = woundAppearance;
    }

    public String getWoundCategory() {
        return woundCategory;
    }

    public void setWoundCategory(String woundCategory) {
        this.woundCategory = woundCategory;
    }

    public String getWoundLocation() {
        return woundLocation;
    }

    public void setWoundLocation(String woundLocation) {
        this.woundLocation = woundLocation;
    }

    public String getWoundTreatmentCuredEstimate() {
        return woundTreatmentCuredEstimate;
    }

    public void setWoundTreatmentCuredEstimate(String woundTreatmentCuredEstimate) {
        this.woundTreatmentCuredEstimate = woundTreatmentCuredEstimate;
    }

    public String getWoundTreatmentCuredReal() {
        return woundTreatmentCuredReal;
    }

    public void setWoundTreatmentCuredReal(String woundTreatmentCuredReal) {
        this.woundTreatmentCuredReal = woundTreatmentCuredReal;
    }

    public String getNurseRemark() {
        return nurseRemark;
    }

    public void setNurseRemark(String nurseRemark) {
        this.nurseRemark = nurseRemark;
    }

    public String getWoundDescription() {
        return woundDescription;
    }
    public void setWoundDescription(String woundDescription) {
        this.woundDescription = woundDescription;
    }
    public String getWoundCareDateStart() {
        return woundCareDateStart;
    }
    public void setWoundCareDateStart(String woundCareDateStart) {
        this.woundCareDateStart = woundCareDateStart;
    }
    public String getWoundCareDateEnd() {
        return woundCareDateEnd;
    }
    public void setWoundCareDateEnd(String woundCareDateEnd) {
        this.woundCareDateEnd = woundCareDateEnd;
    }
    public String getWoundCareActive() {
        return woundCareActive;
    }
    public void setWoundCareActive(String woundCareActive) {
        this.woundCareActive = woundCareActive;
    }
    public String getWoundCareStatus() {
        return woundCareStatus;
    }
    public void setWoundCareStatus(String woundCareStatus) {
        this.woundCareStatus = woundCareStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (woundCareId != null ? woundCareId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NurseTWoundCare)) {
            return false;
        }
        NurseTWoundCare other = (NurseTWoundCare) object;
        if ((this.woundCareId == null && other.woundCareId != null) || (this.woundCareId != null && !this.woundCareId.equals(other.woundCareId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NurseTWoundCare[woundCareId=" + woundCareId + "]";
    }

}
