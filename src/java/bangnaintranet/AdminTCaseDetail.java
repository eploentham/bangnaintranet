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
@Table(name = "admin_t_case_detail", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminTCaseDetail.findAll", query = "SELECT a FROM AdminTCaseDetail a"), @NamedQuery(name = "AdminTCaseDetail.findByCaseDetailId", query = "SELECT a FROM AdminTCaseDetail a WHERE a.caseDetailId = :caseDetailId"), @NamedQuery(name = "AdminTCaseDetail.findByPatientHn", query = "SELECT a FROM AdminTCaseDetail a WHERE a.patientHn = :patientHn"), @NamedQuery(name = "AdminTCaseDetail.findByPatientFullnamet", query = "SELECT a FROM AdminTCaseDetail a WHERE a.patientFullnamet = :patientFullnamet"), @NamedQuery(name = "AdminTCaseDetail.findByVisitDate", query = "SELECT a FROM AdminTCaseDetail a WHERE a.visitDate = :visitDate"), @NamedQuery(name = "AdminTCaseDetail.findByVisitTime", query = "SELECT a FROM AdminTCaseDetail a WHERE a.visitTime = :visitTime"), @NamedQuery(name = "AdminTCaseDetail.findByVisitClinicId", query = "SELECT a FROM AdminTCaseDetail a WHERE a.visitClinicId = :visitClinicId"), @NamedQuery(name = "AdminTCaseDetail.findByVisitClinicNamet", query = "SELECT a FROM AdminTCaseDetail a WHERE a.visitClinicNamet = :visitClinicNamet"), @NamedQuery(name = "AdminTCaseDetail.findByVisitPaidId", query = "SELECT a FROM AdminTCaseDetail a WHERE a.visitPaidId = :visitPaidId"), @NamedQuery(name = "AdminTCaseDetail.findByVisitPaidNamet", query = "SELECT a FROM AdminTCaseDetail a WHERE a.visitPaidNamet = :visitPaidNamet"), @NamedQuery(name = "AdminTCaseDetail.findByCaseDetailActive", query = "SELECT a FROM AdminTCaseDetail a WHERE a.caseDetailActive = :caseDetailActive"), @NamedQuery(name = "AdminTCaseDetail.findByDateCreate", query = "SELECT a FROM AdminTCaseDetail a WHERE a.dateCreate = :dateCreate"), @NamedQuery(name = "AdminTCaseDetail.findByDateModify", query = "SELECT a FROM AdminTCaseDetail a WHERE a.dateModify = :dateModify"), @NamedQuery(name = "AdminTCaseDetail.findByDateCancel", query = "SELECT a FROM AdminTCaseDetail a WHERE a.dateCancel = :dateCancel"), @NamedQuery(name = "AdminTCaseDetail.findByUserCreate", query = "SELECT a FROM AdminTCaseDetail a WHERE a.userCreate = :userCreate"), @NamedQuery(name = "AdminTCaseDetail.findByUserModify", query = "SELECT a FROM AdminTCaseDetail a WHERE a.userModify = :userModify"), @NamedQuery(name = "AdminTCaseDetail.findByUserCancel", query = "SELECT a FROM AdminTCaseDetail a WHERE a.userCancel = :userCancel"), @NamedQuery(name = "AdminTCaseDetail.findByBranchId", query = "SELECT a FROM AdminTCaseDetail a WHERE a.branchId = :branchId"), @NamedQuery(name = "AdminTCaseDetail.findByCaseId", query = "SELECT a FROM AdminTCaseDetail a WHERE a.caseId = :caseId")})
public class AdminTCaseDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "case_detail_id", nullable = false, length = 255)
    private String caseDetailId="";
    @Column(name = "patient_hn", length = 255)
    private String patientHn="";
    @Column(name = "patient_fullnamet", length = 255)
    private String patientFullnamet="";
    @Column(name = "visit_date", length = 255)
    private String visitDate="";
    @Column(name = "visit_time", length = 255)
    private String visitTime="";
    @Column(name = "visit_clinic_id", length = 255)
    private String visitClinicId="";
    @Column(name = "visit_clinic_namet", length = 255)
    private String visitClinicNamet="";
    @Column(name = "visit_paid_id", length = 255)
    private String visitPaidId="";
    @Column(name = "visit_paid_namet", length = 255)
    private String visitPaidNamet="";
    @Column(name = "case_detail_active", length = 255)
    private String caseDetailActive="";
    @Column(name = "date_create", length = 255)
    private String dateCreate="";
    @Column(name = "date_modify", length = 255)
    private String dateModify="";
    @Column(name = "date_cancel", length = 255)
    private String dateCancel="";
    @Column(name = "user_create", length = 255)
    private String userCreate="";
    @Column(name = "user_modify", length = 255)
    private String userModify="";
    @Column(name = "user_cancel", length = 255)
    private String userCancel="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "case_id", length = 255)
    private String caseId="";
    @Column(name = "departmnet_id", length = 255)
    private String departmentId="";
    @Column(name = "department_namet", length = 255)
    private String departmentNamet="";
    @Column(name = "patient_vn", length = 255)
    private String patientVn="";
    @Column(name = "visit_status", length = 255)
    private String visitStatus="";

    public AdminTCaseDetail() {
    }
    public String getAdminTCaseDetail(){
        return "admin_t_case_detail";
    }
    public String getFCaseId(){
        return "case_id";
    }
    public String getFCaseDetailId(){
        return "case_detail_id";
    }
    public String getFPatientHn(){
        return "patient_hn";
    }
    public String getFPatientFullNamet(){
        return "patient_fullnamet";
    }
    public String getFVisitDate(){
        return "visit_date";
    }
    public String getFVisitTime(){
        return "visit_time";
    }
    public String getFVisitClinicId(){
        return "visit_clinic_id";
    }
    public String getFVisitClinicNamet(){
        return "visit_clinic_namet";
    }
    public String getFVisitPaidId(){
        return "visit_paid_id";
    }
    public String getFVisitPaidNamet(){
        return "visit_paid_namet";
    }
    public String getFCaseDetailActive(){
        return "case_detail_active";
    }
    public String getFDateCreate(){
        return "date_create";
    }
    public String getFDateModify(){
        return "date_modify";
    }
    public String getFDateCancel(){
        return "date_cancel";
    }
    public String getFUserCreate(){
        return "user_create";
    }
    public String getFUserModify(){
        return "user_modify";
    }
    public String getFUserCancel(){
        return "user_cancel";
    }
    public String getFBranchId(){
        return "branch_id";
    }
    public String getFDepartmentId(){
        return "department_id";
    }
    public String getFDepartmentNamet(){
        return "department_namet";
    }
    public String getFPatientVn(){
        return "patient_vn";
    }
    public String getFVisitStatus(){
        return "visit_status";
    }

    public AdminTCaseDetail(String caseDetailId) {
        this.caseDetailId = caseDetailId;
    }

    public String getCaseDetailId() {
        return caseDetailId;
    }

    public void setCaseDetailId(String caseDetailId) {
        this.caseDetailId = caseDetailId;
    }

    public String getPatientHn() {
        return patientHn;
    }

    public void setPatientHn(String patientHn) {
        this.patientHn = patientHn;
    }

    public String getPatientFullnamet() {
        return patientFullnamet;
    }

    public void setPatientFullnamet(String patientFullnamet) {
        this.patientFullnamet = patientFullnamet;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitClinicId() {
        return visitClinicId;
    }

    public void setVisitClinicId(String visitClinicId) {
        this.visitClinicId = visitClinicId;
    }

    public String getVisitClinicNamet() {
        return visitClinicNamet;
    }

    public void setVisitClinicNamet(String visitClinicNamet) {
        this.visitClinicNamet = visitClinicNamet;
    }

    public String getVisitPaidId() {
        return visitPaidId;
    }

    public void setVisitPaidId(String visitPaidId) {
        this.visitPaidId = visitPaidId;
    }

    public String getVisitPaidNamet() {
        return visitPaidNamet;
    }

    public void setVisitPaidNamet(String visitPaidNamet) {
        this.visitPaidNamet = visitPaidNamet;
    }

    public String getCaseDetailActive() {
        return caseDetailActive;
    }

    public void setCaseDetailActive(String caseDetailActive) {
        this.caseDetailActive = caseDetailActive;
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

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public String getUserModify() {
        return userModify;
    }

    public void setUserModify(String userModify) {
        this.userModify = userModify;
    }

    public String getUserCancel() {
        return userCancel;
    }

    public void setUserCancel(String userCancel) {
        this.userCancel = userCancel;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getCaseId() {
        return caseId;
    }
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentNamet() {
        return departmentNamet;
    }
    public void setDepartmentNamet(String departmentNamet) {
        this.departmentNamet = departmentNamet;
    }
    public String getPatientVn() {
        return patientVn;
    }
    public void setPatientVn(String patientVn) {
        this.patientVn = patientVn;
    }
    public String getVisitStatus() {
        return visitStatus;
    }
    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caseDetailId != null ? caseDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTCaseDetail)) {
            return false;
        }
        AdminTCaseDetail other = (AdminTCaseDetail) object;
        if ((this.caseDetailId == null && other.caseDetailId != null) || (this.caseDetailId != null && !this.caseDetailId.equals(other.caseDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminTCaseDetail[caseDetailId=" + caseDetailId + "]";
    }

}
