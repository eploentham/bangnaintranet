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
@Table(name = "admin_t_case", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminTCase.findAll", query = "SELECT a FROM AdminTCase a"), @NamedQuery(name = "AdminTCase.findByCaseId", query = "SELECT a FROM AdminTCase a WHERE a.caseId = :caseId"), @NamedQuery(name = "AdminTCase.findByCaseDate", query = "SELECT a FROM AdminTCase a WHERE a.caseDate = :caseDate"), @NamedQuery(name = "AdminTCase.findByCntCheckup", query = "SELECT a FROM AdminTCase a WHERE a.cntCheckup = :cntCheckup"), @NamedQuery(name = "AdminTCase.findByCntPcu", query = "SELECT a FROM AdminTCase a WHERE a.cntPcu = :cntPcu"), @NamedQuery(name = "AdminTCase.findByCntOpd", query = "SELECT a FROM AdminTCase a WHERE a.cntOpd = :cntOpd"), @NamedQuery(name = "AdminTCase.findByCntEr", query = "SELECT a FROM AdminTCase a WHERE a.cntEr = :cntEr"), @NamedQuery(name = "AdminTCase.findByCntDental", query = "SELECT a FROM AdminTCase a WHERE a.cntDental = :cntDental"), @NamedQuery(name = "AdminTCase.findByCntCash", query = "SELECT a FROM AdminTCase a WHERE a.cntCash = :cntCash"), @NamedQuery(name = "AdminTCase.findByCntFunds", query = "SELECT a FROM AdminTCase a WHERE a.cntFunds = :cntFunds"), @NamedQuery(name = "AdminTCase.findByCntCompany", query = "SELECT a FROM AdminTCase a WHERE a.cntCompany = :cntCompany"), @NamedQuery(name = "AdminTCase.findByDescription", query = "SELECT a FROM AdminTCase a WHERE a.description = :description"), @NamedQuery(name = "AdminTCase.findByRemark", query = "SELECT a FROM AdminTCase a WHERE a.remark = :remark")})
public class AdminTCase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "case_id", nullable = false, length = 255)
    private String caseId="";
    @Column(name = "case_date", length = 255)
    private String caseDate="";
    @Column(name = "cnt_checkup", precision = 17, scale = 17)
    private Double cntCheckup=0.0;
    @Column(name = "cnt_pcu", precision = 17, scale = 17)
    private Double cntPcu=0.0;
    @Column(name = "cnt_opd", precision = 17, scale = 17)
    private Double cntOpd=0.0;
    @Column(name = "cnt_er", precision = 17, scale = 17)
    private Double cntEr=0.0;
    @Column(name = "cnt_dental", precision = 17, scale = 17)
    private Double cntDental=0.0;
    @Column(name = "cnt_cash", precision = 17, scale = 17)
    private Double cntCash=0.0;
    @Column(name = "cnt_funds", precision = 17, scale = 17)
    private Double cntFunds=0.0;
    @Column(name = "cnt_company", precision = 17, scale = 17)
    private Double cntCompany=0.0;
    @Column(name = "description", length = 255)
    private String description="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "case_active", length = 255)
    private String caseActive="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "cnt_w_3_m", precision = 17, scale = 17)
    private Double cntW3M=0.0;
    @Column(name = "cnt_w_3_w", precision = 17, scale = 17)
    private Double cntW3W=0.0;
    @Column(name = "cnt_w_3_n", precision = 17, scale = 17)
    private Double cntW3N=0.0;
    @Column(name = "cnt_w_4_s", precision = 17, scale = 17)
    private Double cntW4S=0.0;
    @Column(name = "cnt_w_4_uc", precision = 17, scale = 17)
    private Double cntW4UC=0.0;
    @Column(name = "cnt_w_6_uc", precision = 17, scale = 17)
    private Double cntW6UC=0.0;
    @Column(name = "cnt_w_icu", precision = 17, scale = 17)
    private Double cntWICU=0.0;

    public AdminTCase() {
    }
    public String getAdminTCase(){
        return "admin_t_case";
    }
    public String getFCaseId(){
        return "case_id";
    }
    public String getFCaseDate(){
        return "case_date";
    }
    public String getFCntCheckUp(){
        return "cnt_checkup";
    }
    public String getFCntPcu(){
        return "cnt_pcu";
    }
    public String getFCntOpd(){
        return "cnt_opd";
    }
    public String getFCntEr(){
        return "cnt_er";
    }
    public String getFCntDental(){
        return "cnt_dental";
    }
    public String getFCntCash(){
        return "cnt_cash";
    }
    public String getFCntFund(){
        return "cnt_funds";
    }
    public String getFCntCompany(){
        return "cnt_company";
    }
    public String getFDescription(){
        return "description";
    }
    public String getFRemark(){
        return "remark";
    }
    public String getFCaseActive(){
        return "case_active";
    }
    public String getFBranchId(){
        return "branch_id";
    }
    public String getFCntW3M(){
        return "cnt_w_3_m";
    }
    public String getFCntW3W(){
        return "cnt_w_3_w";
    }
    public String getFCntW3N(){
        return "cnt_w_3_n";
    }
    public String getFCntW4S(){
        return "cnt_w_4_s";
    }
    public String getFCntW4UC(){
        return "cnt_w_4_uc";
    }
    public String getFCntW6UC(){
        return "cnt_w_6_uc";
    }
    public String getFCntWICU(){
        return "cnt_w_icu";
    }

    public AdminTCase(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseDate() {
        return caseDate;
    }

    public void setCaseDate(String caseDate) {
        this.caseDate = caseDate;
    }

    public Double getCntCheckup() {
        return cntCheckup;
    }

    public void setCntCheckup(Double cntCheckup) {
        this.cntCheckup = cntCheckup;
    }

    public Double getCntPcu() {
        return cntPcu;
    }

    public void setCntPcu(Double cntPcu) {
        this.cntPcu = cntPcu;
    }

    public Double getCntOpd() {
        return cntOpd;
    }

    public void setCntOpd(Double cntOpd) {
        this.cntOpd = cntOpd;
    }

    public Double getCntEr() {
        return cntEr;
    }

    public void setCntEr(Double cntEr) {
        this.cntEr = cntEr;
    }

    public Double getCntDental() {
        return cntDental;
    }

    public void setCntDental(Double cntDental) {
        this.cntDental = cntDental;
    }

    public Double getCntCash() {
        return cntCash;
    }

    public void setCntCash(Double cntCash) {
        this.cntCash = cntCash;
    }
    
    public Double getCntFunds() {
        return cntFunds;
    }
    public void setCntFunds(Double cntFunds) {
        this.cntFunds = cntFunds;
    }

    public Double getCntCompany() {
        return cntCompany;
    }

    public void setCntCompany(Double cntCompany) {
        this.cntCompany = cntCompany;
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

    public String getCaseActive() {
        return caseActive;
    }
    public void setCaseActive(String caseActive) {
        this.caseActive = caseActive;
    }
    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Double getCntW3M() {
        return cntW3M;
    }
    public void setCntW3M(Double cntW3M) {
        this.cntW3M = cntW3M;
    }

    public Double getCntW3W() {
        return cntW3W;
    }
    public void setCntW3W(Double cntW3W) {
        this.cntW3W = cntW3W;
    }

    public Double getCntW3N() {
        return cntW3N;
    }
    public void setCntW3N(Double cntW3N) {
        this.cntW3N = cntW3N;
    }

    public Double getCntW4S() {
        return cntW4S;
    }
    public void setCntW4S(Double cntW4S) {
        this.cntW4S = cntW4S;
    }

    public Double getCntW4UC() {
        return cntW4UC;
    }
    public void setCntW4UC(Double cntW4UC) {
        this.cntW4UC = cntW4UC;
    }

    public Double getCntW6UC() {
        return cntW6UC;
    }
    public void setCntW6UC(Double cntW6UC) {
        this.cntW6UC = cntW6UC;
    }

    public Double getCntWICU() {
        return cntWICU;
    }
    public void setCntWICU(Double cntWICU) {
        this.cntWICU = cntWICU;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caseId != null ? caseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTCase)) {
            return false;
        }
        AdminTCase other = (AdminTCase) object;
        if ((this.caseId == null && other.caseId != null) || (this.caseId != null && !this.caseId.equals(other.caseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminTCase[caseId=" + caseId + "]";
    }

}
