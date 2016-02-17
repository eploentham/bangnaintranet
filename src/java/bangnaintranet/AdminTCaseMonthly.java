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
@Table(name = "admin_t_case_monthly", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminTCaseMonthly.findAll", query = "SELECT a FROM AdminTCaseMonthly a")})
public class AdminTCaseMonthly implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "case_monthly_id", nullable = false, length = 255)
    private String caseMonthlyId="";
    @Column(name = "case_monthly_date", length = 255)
    private String caseMonthlyDate="";
    @Column(name = "case_monthly_year", length = 255)
    private String caseMonthlyYear="";
    @Column(name = "case_monthly_month", length = 255)
    private String caseMonthlyMonth="";
    @Column(name = "description", length = 255)
    private String description="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "case_monthly_active", length = 255)
    private String caseMonthlyActive="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "amt_sum_checkup", precision = 17, scale = 17)
    private Double amtSumCheckup=0.0;
    @Column(name = "amt_sum_pcu", precision = 17, scale = 17)
    private Double amtSumPcu=0.0;
    @Column(name = "amt_sum_opd", precision = 17, scale = 17)
    private Double amtSumOpd=0.0;
    @Column(name = "amt_sum_er", precision = 17, scale = 17)
    private Double amtSumEr=0.0;
    @Column(name = "amt_sum_dental", precision = 17, scale = 17)
    private Double amtSumDental=0.0;
    @Column(name = "amt_sum_cash", precision = 17, scale = 17)
    private Double amtSumCash=0.0;
    @Column(name = "amt_sum_funds", precision = 17, scale = 17)
    private Double amtSumFunds=0.0;
    @Column(name = "amt_sum_company", precision = 17, scale = 17)
    private Double amtSumCompany=0.0;
    @Column(name = "amt_sum_w_3_m", precision = 17, scale = 17)
    private Double amtSumW3M=0.0;
    @Column(name = "amt_sum_w_3_w", precision = 17, scale = 17)
    private Double amtSumW3W=0.0;
    @Column(name = "amt_sum_w_3_n", precision = 17, scale = 17)
    private Double amtSumW3N=0.0;
    @Column(name = "amt_sum_w_4_s", precision = 17, scale = 17)
    private Double amtSumW4S=0.0;
    @Column(name = "amt_sum_w_4_uc", precision = 17, scale = 17)
    private Double amtSumW4Uc=0.0;
    @Column(name = "amt_sum_w_5_a", precision = 17, scale = 17)
    private Double amtSumW5A=0.0;
    @Column(name = "amt_sum_w_6_uc", precision = 17, scale = 17)
    private Double amtSumW6Uc=0.0;
    @Column(name = "amt_sum_w_icu", precision = 17, scale = 17)
    private Double amtSumWIcu=0.0;
    @Column(name = "cnt_sum_checkup", precision = 17, scale = 17)
    private Double cntSumCheckup=0.0;
    @Column(name = "cnt_sum_pcu", precision = 17, scale = 17)
    private Double cntSumPcu=0.0;
    @Column(name = "cnt_sum_opd", precision = 17, scale = 17)
    private Double cntSumOpd=0.0;
    @Column(name = "cnt_sum_er", precision = 17, scale = 17)
    private Double cntSumEr=0.0;
    @Column(name = "cnt_sum_dental", precision = 17, scale = 17)
    private Double cntSumDental=0.0;
    @Column(name = "cnt_sum_cash", precision = 17, scale = 17)
    private Double cntSumCash=0.0;
    @Column(name = "cnt_sum_funds", precision = 17, scale = 17)
    private Double cntSumFunds=0.0;
    @Column(name = "cnt_sum_company", precision = 17, scale = 17)
    private Double cntSumCompany=0.0;
    @Column(name = "cnt_sum_w_3_m", precision = 17, scale = 17)
    private Double cntSumW3M=0.0;
    @Column(name = "cnt_sum_w_3_w", precision = 17, scale = 17)
    private Double cntSumW3W=0.0;
    @Column(name = "cnt_sum_w_3_n", precision = 17, scale = 17)
    private Double cntSumW3N=0.0;
    @Column(name = "cnt_sum_w_4_s", precision = 17, scale = 17)
    private Double cntSumW4S=0.0;
    @Column(name = "cnt_sum_w_4_uc", precision = 17, scale = 17)
    private Double cntSumW4Uc=0.0;
    @Column(name = "cnt_sum_w_5_a", precision = 17, scale = 17)
    private Double cntSumW5A=0.0;
    @Column(name = "cnt_sum_w_6_uc", precision = 17, scale = 17)
    private Double cntSumW6Uc=0.0;
    @Column(name = "cnt_sum_w_icu", precision = 17, scale = 17)
    private Double cntSumWIcu=0.0;
    @Column(name = "k_opd", precision = 17, scale = 17)
    private Double kOpd=0.0;
    @Column(name = "k_admin", precision = 17, scale = 17)
    private Double kAdmin=0.0;
    @Column(name = "k_ipd", precision = 17, scale = 17)
    private Double kIpd=0.0;
    @Column(name = "amt_opd_checkup", precision = 17, scale = 17)
    private Double amtOpdCheckup=0.0;
    @Column(name = "amt_opd_pcu", precision = 17, scale = 17)
    private Double amtOpdPcu=0.0;
    @Column(name = "amt_opd_opd", precision = 17, scale = 17)
    private Double amtOpdOpd=0.0;
    @Column(name = "amt_opd_er", precision = 17, scale = 17)
    private Double amtOpdEr=0.0;
    @Column(name = "amt_opd_dental", precision = 17, scale = 17)
    private Double amtOpdDental=0.0;
    @Column(name = "amt_opd_cash", precision = 17, scale = 17)
    private Double amtOpdCash=0.0;
    @Column(name = "amt_opd_funds", precision = 17, scale = 17)
    private Double amtOpdFunds=0.0;
    @Column(name = "amt_opd_company", precision = 17, scale = 17)
    private Double amtOpdCompany=0.0;
    @Column(name = "cnt_opd_checkup", precision = 17, scale = 17)
    private Double cntOpdCheckup=0.0;
    @Column(name = "cnt_opd_pcu", precision = 17, scale = 17)
    private Double cntOpdPcu=0.0;
    @Column(name = "cnt_opd_opd", precision = 17, scale = 17)
    private Double cntOpdOpd=0.0;
    @Column(name = "cnt_opd_er", precision = 17, scale = 17)
    private Double cntOpdEr=0.0;
    @Column(name = "cnt_opd_dental", precision = 17, scale = 17)
    private Double cntOpdDental=0.0;
    @Column(name = "cnt_opd_cash", precision = 17, scale = 17)
    private Double cntOpdCash=0.0;
    @Column(name = "cnt_opd_funds", precision = 17, scale = 17)
    private Double cntOpdFunds=0.0;
    @Column(name = "cnt_opd_company", precision = 17, scale = 17)
    private Double cntOpdCompany=0.0;
    @Column(name = "amt_ipd_checkup", precision = 17, scale = 17)
    private Double amtIpdCheckup=0.0;
    @Column(name = "amt_ipd_pcu", precision = 17, scale = 17)
    private Double amtIpdPcu=0.0;
    @Column(name = "amt_ipd_opd", precision = 17, scale = 17)
    private Double amtIpdOpd=0.0;
    @Column(name = "amt_ipd_er", precision = 17, scale = 17)
    private Double amtIpdEr=0.0;
    @Column(name = "amt_ipd_dental", precision = 17, scale = 17)
    private Double amtIpdDental=0.0;
    @Column(name = "amt_ipd_cash", precision = 17, scale = 17)
    private Double amtIpdCash=0.0;
    @Column(name = "amt_ipd_funds", precision = 17, scale = 17)
    private Double amtIpdFunds=0.0;
    @Column(name = "amt_ipd_company", precision = 17, scale = 17)
    private Double amtIpdCompany=0.0;
    @Column(name = "cnt_ipd_checkup", precision = 17, scale = 17)
    private Double cntIpdCheckup=0.0;
    @Column(name = "cnt_ipd_pcu", precision = 17, scale = 17)
    private Double cntIpdPcu=0.0;
    @Column(name = "cnt_ipd_opd", precision = 17, scale = 17)
    private Double cntIpdOpd=0.0;
    @Column(name = "cnt_ipd_er", precision = 17, scale = 17)
    private Double cntIpdEr=0.0;
    @Column(name = "cnt_ipd_dental", precision = 17, scale = 17)
    private Double cntIpdDental=0.0;
    @Column(name = "cnt_ipd_cash", precision = 17, scale = 17)
    private Double cntIpdCash=0.0;
    @Column(name = "cnt_ipd_funds", precision = 17, scale = 17)
    private Double cntIpdFunds=0.0;
    @Column(name = "cnt_ipd_company", precision = 17, scale = 17)
    private Double cntIpdCompany=0.0;
    @Column(name = "cnt_ipd_w_3_m", precision = 17, scale = 17)
    private Double cntIpdW3M=0.0;
    @Column(name = "cnt_ipd_w_3_w", precision = 17, scale = 17)
    private Double cntIpdW3W=0.0;
    @Column(name = "cnt_ipd_w_3_n", precision = 17, scale = 17)
    private Double cntIpdW3N=0.0;
    @Column(name = "cnt_ipd_w_4_s", precision = 17, scale = 17)
    private Double cntIpdW4S=0.0;
    @Column(name = "cnt_ipd_w_4_uc", precision = 17, scale = 17)
    private Double cntIpdW4Uc=0.0;
    @Column(name = "cnt_ipd_w_5_a", precision = 17, scale = 17)
    private Double cntIpdW5A=0.0;
    @Column(name = "cnt_ipd_w_6_uc", precision = 17, scale = 17)
    private Double cntIpdW6Uc=0.0;
    @Column(name = "cnt_ipd_w_icu", precision = 17, scale = 17)
    private Double cntIpdWIcu=0.0;
    @Column(name = "amt_ipd_w_3_m", precision = 17, scale = 17)
    private Double amtIpdW3M=0.0;
    @Column(name = "amt_ipd_w_3_w", precision = 17, scale = 17)
    private Double amtIpdW3W=0.0;
    @Column(name = "amt_ipd_w_3_n", precision = 17, scale = 17)
    private Double amtIpdW3N=0.0;
    @Column(name = "amt_ipd_w_4_s", precision = 17, scale = 17)
    private Double amtIpdW4S=0.0;
    @Column(name = "amt_ipd_w_4_uc", precision = 17, scale = 17)
    private Double amtIpdW4Uc=0.0;
    @Column(name = "amt_ipd_w_5_a", precision = 17, scale = 17)
    private Double amtIpdW5A=0.0;
    @Column(name = "amt_ipd_w_6_uc", precision = 17, scale = 17)
    private Double amtIpdW6Uc=0.0;
    @Column(name = "amt_ipd_w_icu", precision = 17, scale = 17)
    private Double amtIpdWIcu=0.0;

    public AdminTCaseMonthly() {
    }
    public String getAdminTCaseMonthly() {
        return "admin_t_case_monthly";
    }

    public String getFCaseMonthlyId() {
        return "case_monthly_id";
    }
    public String getFCaseMonthlyDate() {
        return "case_monthly_date";
    }
    public String getFDescription() {
        return "description";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFCaseMonthlActive() {
        return "case_monthly_active";
    }
    public String getFBranchId() {
        return "branch_id";
    }
    public String getFAmtSumCheckup() {
        return "amt_sum_checkup";
    }
    public String getFAmtSumPcu() {
        return "amt_sum_pcu";
    }
    public String getFAmtSumOPD() {
        return "amt_sum_opd";
    }
    public String getFAmtSumEr() {
        return "amt_sum_er";
    }
    public String getFAmtSumDental() {
        return "amt_sum_dental";
    }
    public String getFAmtSumCash() {
        return "amt_sum_cash";
    }
    public String getFAmtSumFunds() {
        return "amt_sum_funds";
    }
    public String getFAmtSumCompany() {
        return "amt_sum_company";
    }
    public String getFAmtSumW3M() {
        return "amt_sum_w_3_m";
    }
    public String getFAmtSumW3W() {
        return "amt_sum_w_3_w";
    }
    public String getFAmtSumW3N() {
        return "amt_sum_w_3_n";
    }
    public String getFAmtSumW4UC() {
        return "amt_sum_w_4_uc";
    }
    public String getFAmtSumW4S() {
        return "amt_sum_w_4_s";
    }
    public String getFAmtSumW5A() {
        return "amt_sum_w_5_a";
    }
    public String getFAmtSumW6UC() {
        return "amt_sum_w_6_uc";
    }
    public String getFAmtSumWIcu() {
        return "amt_sum_w_icu";
    }

    public String getFCntSumCheckup() {
        return "cnt_sum_checkup";
    }
    public String getFCntSumPcu() {
        return "cnt_sum_pcu";
    }
    public String getFCntSumOPD() {
        return "cnt_sum_opd";
    }
    public String getFCntSumEr() {
        return "cnt_sum_er";
    }
    public String getFCntSumDental() {
        return "cnt_sum_dental";
    }
    public String getFCntSumCash() {
        return "cnt_sum_cash";
    }
    public String getFCntSumFunds() {
        return "cnt_sum_funds";
    }
    public String getFCntSumCompany() {
        return "cnt_sum_company";
    }
    public String getFCntSumW3M() {
        return "cnt_sum_w_3_m";
    }
    public String getFCntSumW3W() {
        return "cnt_sum_w_3_w";
    }
    public String getFCntSumW3N() {
        return "cnt_sum_w_3_n";
    }
    public String getFCntSumW4UC() {
        return "cnt_sum_w_4_uc";
    }
    public String getFCntSumW4S() {
        return "cnt_sum_w_4_s";
    }
    public String getFCntSumW5A() {
        return "cnt_sum_w_5_a";
    }
    public String getFCntSumW6UC() {
        return "cnt_sum_w_6_uc";
    }
    public String getFCntSumWIcu() {
        return "cnt_sum_w_icu";
    }

    public String getFKOpd() {
        return "k_opd";
    }
    public String getFKIpd() {
        return "k_ipd";
    }
    public String getFKAdmin() {
        return "k_admin";
    }

    public String getFAmtOpdCheckup() {
        return "amt_opd_checkup";
    }
    public String getFAmtOpdPcu() {
        return "amt_opd_pcu";
    }
    public String getFAmtOpdOPD() {
        return "amt_opd_opd";
    }
    public String getFAmtOpdEr() {
        return "amt_opd_er";
    }
    public String getFAmtOpdDental() {
        return "amt_opd_dental";
    }
    public String getFAmtOpdCash() {
        return "amt_opd_cash";
    }
    public String getFAmtOpdFunds() {
        return "amt_opd_funds";
    }
    public String getFAmtOpdCompany() {
        return "amt_opd_company";
    }
    public String getFCntOpdCheckup() {
        return "cnt_opd_checkup";
    }
    public String getFCntOpdPcu() {
        return "cnt_opd_pcu";
    }
    public String getFCntOpdOPD() {
        return "cnt_opd_opd";
    }
    public String getFCntOpdEr() {
        return "cnt_opd_er";
    }
    public String getFCntOpdDental() {
        return "cnt_opd_dental";
    }
    public String getFCntOpdCash() {
        return "cnt_opd_cash";
    }
    public String getFCntOpdFunds() {
        return "cnt_opd_funds";
    }
    public String getFCntOpdCompany() {
        return "cnt_opd_company";
    }

    public String getFAmtIpdCheckup() {
        return "amt_ipd_checkup";
    }
    public String getFAmtIpdPcu() {
        return "amt_ipd_pcu";
    }
    public String getFAmtIpdOPD() {
        return "amt_ipd_opd";
    }
    public String getFAmtIpdEr() {
        return "amt_ipd_er";
    }
    public String getFAmtIpdDental() {
        return "amt_ipd_dental";
    }
    public String getFAmtIpdCash() {
        return "amt_ipd_cash";
    }
    public String getFAmtIpdFunds() {
        return "amt_ipd_funds";
    }
    public String getFAmtIpdCompany() {
        return "amt_ipd_company";
    }

    public String getFCntIpdCheckup() {
        return "cnt_ipd_checkup";
    }
    public String getFCntIpdPcu() {
        return "cnt_ipd_pcu";
    }
    public String getFCntIpdOPD() {
        return "cnt_ipd_opd";
    }
    public String getFCntIpdEr() {
        return "cnt_ipd_er";
    }
    public String getFCntIpdDental() {
        return "cnt_ipd_dental";
    }
    public String getFCntIpdCash() {
        return "cnt_ipd_cash";
    }
    public String getFCntIpdFunds() {
        return "cnt_ipd_funds";
    }
    public String getFCntIpdCompany() {
        return "cnt_ipd_company";
    }

    public String getFCntIpdW3M() {
        return "cnt_ipd_w_3_m";
    }
    public String getFCntIpdW3W() {
        return "cnt_ipd_w_3_w";
    }
    public String getFCntIpdW3N() {
        return "cnt_ipd_w_3_n";
    }
    public String getFCntIpdW4UC() {
        return "cnt_ipd_w_4_uc";
    }
    public String getFCntIpdW4S() {
        return "cnt_ipd_w_4_s";
    }
    public String getFCntIpdW5A() {
        return "cnt_ipd_w_5_a";
    }
    public String getFCntIpdW6UC() {
        return "cnt_ipd_w_6_uc";
    }
    public String getFCntIpdWIcu() {
        return "cnt_ipd_w_icu";
    }

    public String getFAmtIpdW3M() {
        return "amt_ipd_w_3_m";
    }
    public String getFAmtIpdW3W() {
        return "amt_ipd_w_3_w";
    }
    public String getFAmtIpdW3N() {
        return "amt_ipd_w_3_n";
    }
    public String getFAmtIpdW4UC() {
        return "amt_ipd_w_4_uc";
    }
    public String getFAmtIpdW4S() {
        return "amt_ipd_w_4_s";
    }
    public String getFAmtIpdW5A() {
        return "amt_ipd_w_5_a";
    }
    public String getFAmtIpdW6UC() {
        return "amt_ipd_w_6_uc";
    }
    public String getFAmtIpdWIcu() {
        return "amt_ipd_w_icu";
    }

    public AdminTCaseMonthly(String caseMonthlyId) {
        this.caseMonthlyId = caseMonthlyId;
    }

    public String getCaseMonthlyId() {
        return caseMonthlyId;
    }

    public void setCaseMonthlyId(String caseMonthlyId) {
        this.caseMonthlyId = caseMonthlyId;
    }

    public String getCaseMonthlyDate() {
        return caseMonthlyDate;
    }

    public void setCaseMonthlyDate(String caseMonthlyDate) {
        this.caseMonthlyDate = caseMonthlyDate;
    }

    public String getCaseMonthlyYear() {
        return caseMonthlyYear;
    }

    public void setCaseMonthlyYear(String caseMonthlyYear) {
        this.caseMonthlyYear = caseMonthlyYear;
    }

    public String getCaseMonthlyMonth() {
        return caseMonthlyMonth;
    }

    public void setCaseMonthlyMonth(String caseMonthlyMonth) {
        this.caseMonthlyMonth = caseMonthlyMonth;
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

    public String getCaseMonthlyActive() {
        return caseMonthlyActive;
    }

    public void setCaseMonthlyActive(String caseMonthlyActive) {
        this.caseMonthlyActive = caseMonthlyActive;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Double getAmtSumCheckup() {
        return amtSumCheckup;
    }

    public void setAmtSumCheckup(Double amtSumCheckup) {
        this.amtSumCheckup = amtSumCheckup;
    }

    public Double getAmtSumPcu() {
        return amtSumPcu;
    }

    public void setAmtSumPcu(Double amtSumPcu) {
        this.amtSumPcu = amtSumPcu;
    }

    public Double getAmtSumOpd() {
        return amtSumOpd;
    }

    public void setAmtSumOpd(Double amtSumOpd) {
        this.amtSumOpd = amtSumOpd;
    }

    public Double getAmtSumEr() {
        return amtSumEr;
    }

    public void setAmtSumEr(Double amtSumEr) {
        this.amtSumEr = amtSumEr;
    }

    public Double getAmtSumDental() {
        return amtSumDental;
    }

    public void setAmtSumDental(Double amtSumDental) {
        this.amtSumDental = amtSumDental;
    }

    public Double getAmtSumCash() {
        return amtSumCash;
    }

    public void setAmtSumCash(Double amtSumCash) {
        this.amtSumCash = amtSumCash;
    }

    public Double getAmtSumFunds() {
        return amtSumFunds;
    }

    public void setAmtSumFunds(Double amtSumFunds) {
        this.amtSumFunds = amtSumFunds;
    }

    public Double getAmtSumCompany() {
        return amtSumCompany;
    }

    public void setAmtSumCompany(Double amtSumCompany) {
        this.amtSumCompany = amtSumCompany;
    }

    public Double getAmtSumW3M() {
        return amtSumW3M;
    }

    public void setAmtSumW3M(Double amtSumW3M) {
        this.amtSumW3M = amtSumW3M;
    }

    public Double getAmtSumW3W() {
        return amtSumW3W;
    }

    public void setAmtSumW3W(Double amtSumW3W) {
        this.amtSumW3W = amtSumW3W;
    }

    public Double getAmtSumW3N() {
        return amtSumW3N;
    }

    public void setAmtSumW3N(Double amtSumW3N) {
        this.amtSumW3N = amtSumW3N;
    }

    public Double getAmtSumW4S() {
        return amtSumW4S;
    }

    public void setAmtSumW4S(Double amtSumW4S) {
        this.amtSumW4S = amtSumW4S;
    }

    public Double getAmtSumW4Uc() {
        return amtSumW4Uc;
    }

    public void setAmtSumW4Uc(Double amtSumW4Uc) {
        this.amtSumW4Uc = amtSumW4Uc;
    }

    public Double getAmtSumW5A() {
        return amtSumW5A;
    }

    public void setAmtSumW5A(Double amtSumW5A) {
        this.amtSumW5A = amtSumW5A;
    }

    public Double getAmtSumW6Uc() {
        return amtSumW6Uc;
    }

    public void setAmtSumW6Uc(Double amtSumW6Uc) {
        this.amtSumW6Uc = amtSumW6Uc;
    }

    public Double getAmtSumWIcu() {
        return amtSumWIcu;
    }

    public void setAmtSumWIcu(Double amtSumWIcu) {
        this.amtSumWIcu = amtSumWIcu;
    }

    public Double getCntSumCheckup() {
        return cntSumCheckup;
    }

    public void setCntSumCheckup(Double cntSumCheckup) {
        this.cntSumCheckup = cntSumCheckup;
    }

    public Double getCntSumPcu() {
        return cntSumPcu;
    }

    public void setCntSumPcu(Double cntSumPcu) {
        this.cntSumPcu = cntSumPcu;
    }

    public Double getCntSumOpd() {
        return cntSumOpd;
    }

    public void setCntSumOpd(Double cntSumOpd) {
        this.cntSumOpd = cntSumOpd;
    }

    public Double getCntSumEr() {
        return cntSumEr;
    }

    public void setCntSumEr(Double cntSumEr) {
        this.cntSumEr = cntSumEr;
    }

    public Double getCntSumDental() {
        return cntSumDental;
    }

    public void setCntSumDental(Double cntSumDental) {
        this.cntSumDental = cntSumDental;
    }

    public Double getCntSumCash() {
        return cntSumCash;
    }

    public void setCntSumCash(Double cntSumCash) {
        this.cntSumCash = cntSumCash;
    }

    public Double getCntSumFunds() {
        return cntSumFunds;
    }

    public void setCntSumFunds(Double cntSumFunds) {
        this.cntSumFunds = cntSumFunds;
    }

    public Double getCntSumCompany() {
        return cntSumCompany;
    }

    public void setCntSumCompany(Double cntSumCompany) {
        this.cntSumCompany = cntSumCompany;
    }

    public Double getCntSumW3M() {
        return cntSumW3M;
    }

    public void setCntSumW3M(Double cntSumW3M) {
        this.cntSumW3M = cntSumW3M;
    }

    public Double getCntSumW3W() {
        return cntSumW3W;
    }

    public void setCntSumW3W(Double cntSumW3W) {
        this.cntSumW3W = cntSumW3W;
    }

    public Double getCntSumW3N() {
        return cntSumW3N;
    }

    public void setCntSumW3N(Double cntSumW3N) {
        this.cntSumW3N = cntSumW3N;
    }

    public Double getCntSumW4S() {
        return cntSumW4S;
    }

    public void setCntSumW4S(Double cntSumW4S) {
        this.cntSumW4S = cntSumW4S;
    }

    public Double getCntSumW4Uc() {
        return cntSumW4Uc;
    }

    public void setCntSumW4Uc(Double cntSumW4Uc) {
        this.cntSumW4Uc = cntSumW4Uc;
    }

    public Double getCntSumW5A() {
        return cntSumW5A;
    }

    public void setCntSumW5A(Double cntSumW5A) {
        this.cntSumW5A = cntSumW5A;
    }

    public Double getCntSumW6Uc() {
        return cntSumW6Uc;
    }

    public void setCntSumW6Uc(Double cntSumW6Uc) {
        this.cntSumW6Uc = cntSumW6Uc;
    }

    public Double getCntSumWIcu() {
        return cntSumWIcu;
    }

    public void setCntSumWIcu(Double cntSumWIcu) {
        this.cntSumWIcu = cntSumWIcu;
    }

    public Double getKOpd() {
        return kOpd;
    }

    public void setKOpd(Double kOpd) {
        this.kOpd = kOpd;
    }

    public Double getKAdmin() {
        return kAdmin;
    }

    public void setKAdmin(Double kAdmin) {
        this.kAdmin = kAdmin;
    }

    public Double getKIpd() {
        return kIpd;
    }

    public void setKIpd(Double kIpd) {
        this.kIpd = kIpd;
    }

    public Double getAmtOpdCheckup() {
        return amtOpdCheckup;
    }

    public void setAmtOpdCheckup(Double amtOpdCheckup) {
        this.amtOpdCheckup = amtOpdCheckup;
    }

    public Double getAmtOpdPcu() {
        return amtOpdPcu;
    }

    public void setAmtOpdPcu(Double amtOpdPcu) {
        this.amtOpdPcu = amtOpdPcu;
    }

    public Double getAmtOpdOpd() {
        return amtOpdOpd;
    }

    public void setAmtOpdOpd(Double amtOpdOpd) {
        this.amtOpdOpd = amtOpdOpd;
    }

    public Double getAmtOpdEr() {
        return amtOpdEr;
    }

    public void setAmtOpdEr(Double amtOpdEr) {
        this.amtOpdEr = amtOpdEr;
    }

    public Double getAmtOpdDental() {
        return amtOpdDental;
    }

    public void setAmtOpdDental(Double amtOpdDental) {
        this.amtOpdDental = amtOpdDental;
    }

    public Double getAmtOpdCash() {
        return amtOpdCash;
    }

    public void setAmtOpdCash(Double amtOpdCash) {
        this.amtOpdCash = amtOpdCash;
    }

    public Double getAmtOpdFunds() {
        return amtOpdFunds;
    }

    public void setAmtOpdFunds(Double amtOpdFunds) {
        this.amtOpdFunds = amtOpdFunds;
    }

    public Double getAmtOpdCompany() {
        return amtOpdCompany;
    }

    public void setAmtOpdCompany(Double amtOpdCompany) {
        this.amtOpdCompany = amtOpdCompany;
    }

    public Double getCntOpdCheckup() {
        return cntOpdCheckup;
    }

    public void setCntOpdCheckup(Double cntOpdCheckup) {
        this.cntOpdCheckup = cntOpdCheckup;
    }

    public Double getCntOpdPcu() {
        return cntOpdPcu;
    }

    public void setCntOpdPcu(Double cntOpdPcu) {
        this.cntOpdPcu = cntOpdPcu;
    }

    public Double getCntOpdOpd() {
        return cntOpdOpd;
    }

    public void setCntOpdOpd(Double cntOpdOpd) {
        this.cntOpdOpd = cntOpdOpd;
    }

    public Double getCntOpdEr() {
        return cntOpdEr;
    }

    public void setCntOpdEr(Double cntOpdEr) {
        this.cntOpdEr = cntOpdEr;
    }

    public Double getCntOpdDental() {
        return cntOpdDental;
    }

    public void setCntOpdDental(Double cntOpdDental) {
        this.cntOpdDental = cntOpdDental;
    }

    public Double getCntOpdCash() {
        return cntOpdCash;
    }

    public void setCntOpdCash(Double cntOpdCash) {
        this.cntOpdCash = cntOpdCash;
    }

    public Double getCntOpdFunds() {
        return cntOpdFunds;
    }

    public void setCntOpdFunds(Double cntOpdFunds) {
        this.cntOpdFunds = cntOpdFunds;
    }

    public Double getCntOpdCompany() {
        return cntOpdCompany;
    }

    public void setCntOpdCompany(Double cntOpdCompany) {
        this.cntOpdCompany = cntOpdCompany;
    }

    public Double getAmtIpdCheckup() {
        return amtIpdCheckup;
    }

    public void setAmtIpdCheckup(Double amtIpdCheckup) {
        this.amtIpdCheckup = amtIpdCheckup;
    }

    public Double getAmtIpdPcu() {
        return amtIpdPcu;
    }

    public void setAmtIpdPcu(Double amtIpdPcu) {
        this.amtIpdPcu = amtIpdPcu;
    }

    public Double getAmtIpdOpd() {
        return amtIpdOpd;
    }

    public void setAmtIpdOpd(Double amtIpdOpd) {
        this.amtIpdOpd = amtIpdOpd;
    }

    public Double getAmtIpdEr() {
        return amtIpdEr;
    }

    public void setAmtIpdEr(Double amtIpdEr) {
        this.amtIpdEr = amtIpdEr;
    }

    public Double getAmtIpdDental() {
        return amtIpdDental;
    }

    public void setAmtIpdDental(Double amtIpdDental) {
        this.amtIpdDental = amtIpdDental;
    }

    public Double getAmtIpdCash() {
        return amtIpdCash;
    }

    public void setAmtIpdCash(Double amtIpdCash) {
        this.amtIpdCash = amtIpdCash;
    }

    public Double getAmtIpdFunds() {
        return amtIpdFunds;
    }

    public void setAmtIpdFunds(Double amtIpdFunds) {
        this.amtIpdFunds = amtIpdFunds;
    }

    public Double getAmtIpdCompany() {
        return amtIpdCompany;
    }

    public void setAmtIpdCompany(Double amtIpdCompany) {
        this.amtIpdCompany = amtIpdCompany;
    }

    public Double getCntIpdCheckup() {
        return cntIpdCheckup;
    }

    public void setCntIpdCheckup(Double cntIpdCheckup) {
        this.cntIpdCheckup = cntIpdCheckup;
    }

    public Double getCntIpdPcu() {
        return cntIpdPcu;
    }

    public void setCntIpdPcu(Double cntIpdPcu) {
        this.cntIpdPcu = cntIpdPcu;
    }

    public Double getCntIpdOpd() {
        return cntIpdOpd;
    }

    public void setCntIpdOpd(Double cntIpdOpd) {
        this.cntIpdOpd = cntIpdOpd;
    }

    public Double getCntIpdEr() {
        return cntIpdEr;
    }

    public void setCntIpdEr(Double cntIpdEr) {
        this.cntIpdEr = cntIpdEr;
    }

    public Double getCntIpdDental() {
        return cntIpdDental;
    }

    public void setCntIpdDental(Double cntIpdDental) {
        this.cntIpdDental = cntIpdDental;
    }

    public Double getCntIpdCash() {
        return cntIpdCash;
    }

    public void setCntIpdCash(Double cntIpdCash) {
        this.cntIpdCash = cntIpdCash;
    }

    public Double getCntIpdFunds() {
        return cntIpdFunds;
    }

    public void setCntIpdFunds(Double cntIpdFunds) {
        this.cntIpdFunds = cntIpdFunds;
    }

    public Double getCntIpdCompany() {
        return cntIpdCompany;
    }

    public void setCntIpdCompany(Double cntIpdCompany) {
        this.cntIpdCompany = cntIpdCompany;
    }

    public Double getCntIpdW3M() {
        return cntIpdW3M;
    }

    public void setCntIpdW3M(Double cntIpdW3M) {
        this.cntIpdW3M = cntIpdW3M;
    }

    public Double getCntIpdW3W() {
        return cntIpdW3W;
    }

    public void setCntIpdW3W(Double cntIpdW3W) {
        this.cntIpdW3W = cntIpdW3W;
    }

    public Double getCntIpdW3N() {
        return cntIpdW3N;
    }

    public void setCntIpdW3N(Double cntIpdW3N) {
        this.cntIpdW3N = cntIpdW3N;
    }

    public Double getCntIpdW4S() {
        return cntIpdW4S;
    }

    public void setCntIpdW4S(Double cntIpdW4S) {
        this.cntIpdW4S = cntIpdW4S;
    }

    public Double getCntIpdW4Uc() {
        return cntIpdW4Uc;
    }

    public void setCntIpdW4Uc(Double cntIpdW4Uc) {
        this.cntIpdW4Uc = cntIpdW4Uc;
    }

    public Double getCntIpdW5A() {
        return cntIpdW5A;
    }

    public void setCntIpdW5A(Double cntIpdW5A) {
        this.cntIpdW5A = cntIpdW5A;
    }

    public Double getCntIpdW6Uc() {
        return cntIpdW6Uc;
    }

    public void setCntIpdW6Uc(Double cntIpdW6Uc) {
        this.cntIpdW6Uc = cntIpdW6Uc;
    }

    public Double getCntIpdWIcu() {
        return cntIpdWIcu;
    }

    public void setCntIpdWIcu(Double cntIpdWIcu) {
        this.cntIpdWIcu = cntIpdWIcu;
    }

    public Double getAmtIpdW3M() {
        return amtIpdW3M;
    }

    public void setAmtIpdW3M(Double amtIpdW3M) {
        this.amtIpdW3M = amtIpdW3M;
    }

    public Double getAmtIpdW3W() {
        return amtIpdW3W;
    }

    public void setAmtIpdW3W(Double amtIpdW3W) {
        this.amtIpdW3W = amtIpdW3W;
    }

    public Double getAmtIpdW3N() {
        return amtIpdW3N;
    }

    public void setAmtIpdW3N(Double amtIpdW3N) {
        this.amtIpdW3N = amtIpdW3N;
    }

    public Double getAmtIpdW4S() {
        return amtIpdW4S;
    }

    public void setAmtIpdW4S(Double amtIpdW4S) {
        this.amtIpdW4S = amtIpdW4S;
    }

    public Double getAmtIpdW4Uc() {
        return amtIpdW4Uc;
    }

    public void setAmtIpdW4Uc(Double amtIpdW4Uc) {
        this.amtIpdW4Uc = amtIpdW4Uc;
    }

    public Double getAmtIpdW5A() {
        return amtIpdW5A;
    }

    public void setAmtIpdW5A(Double amtIpdW5A) {
        this.amtIpdW5A = amtIpdW5A;
    }

    public Double getAmtIpdW6Uc() {
        return amtIpdW6Uc;
    }

    public void setAmtIpdW6Uc(Double amtIpdW6Uc) {
        this.amtIpdW6Uc = amtIpdW6Uc;
    }

    public Double getAmtIpdWIcu() {
        return amtIpdWIcu;
    }

    public void setAmtIpdWIcu(Double amtIpdWIcu) {
        this.amtIpdWIcu = amtIpdWIcu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caseMonthlyId != null ? caseMonthlyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTCaseMonthly)) {
            return false;
        }
        AdminTCaseMonthly other = (AdminTCaseMonthly) object;
        if ((this.caseMonthlyId == null && other.caseMonthlyId != null) || (this.caseMonthlyId != null && !this.caseMonthlyId.equals(other.caseMonthlyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminTCaseMonthly[caseMonthlyId=" + caseMonthlyId + "]";
    }

}
