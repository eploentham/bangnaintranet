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
@Table(name = "admin_t_foods", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminTFoods.findAll", query = "SELECT a FROM AdminTFoods a")})
public class AdminTFoods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "admin_foods_id", nullable = false, length = 255)
    private String adminFoodsId="";
    @Column(name = "description", length = 255)
    private String description="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "admin_foods_active", length = 255)
    private String adminFoodsActive="";
    @Column(name = "date_start", length = 255)
    private String dateStart="";
    @Column(name = "date_end", length = 255)
    private String dateEnd="";
    @Column(name = "admin_foods_date", length = 255)
    private String adminFoodsDate="";
    @Column(name = "amount_receive", precision = 17, scale = 17)
    private Double amountReceive=0.0;
    @Column(name = "nettotal_receive", precision = 17, scale = 17)
    private Double nettotalReceive=0.0;
    @Column(name = "amount_approve", precision = 17, scale = 17)
    private Double amountApprove=0.0;
    @Column(name = "nettotal_approve", precision = 17, scale = 17)
    private Double nettotalApprove=0.0;
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "admin_foods_year", length = 255)
    private String adminFoodsYear="";
    @Column(name = "admin_foods_month", length = 255)
    private String adminFoodsMonth="";
    @Column(name = "admin_foods_period", length = 255)
    private String adminFoodsPeriod="";
    @Column(name = "cnt_receive", precision = 17, scale = 17)
    private Double cntReceive=0.0;
    @Column(name = "cnt_approve", precision = 17, scale = 17)
    private Double cntApprove=0.0;
    @Column(name = "cnt_send", precision = 17, scale = 17)
    private Double cntSend=0.0;

    public AdminTFoods() {
    }
    public String getAdminTFoods(){
        return "admin_t_foods";
    }
    public String getFAdminFoodsId(){
        return "admin_foods_id";
    }
    public String getFDescription(){
        return "description";
    }
    public String getFRemark(){
        return "remark";
    }
    public String getFAdminFoodsActive(){
        return "admin_foods_active";
    }
    public String getFDateStart(){
        return "date_start";
    }
    public String getFDateEnd(){
        return "date_end";
    }
    public String getFAdminFoodsDate(){
        return "admin_foods_date";
    }
    public String getFAmountReceive(){
        return "amount_receive";
    }
    public String getFNettotalReceive(){
        return "nettotal_receive";
    }
    public String getFAmountApprove(){
        return "amount_approve";
    }
    public String getFNettotalApprove(){
        return "nettotal_approve";
    }
    public String getFBranchId(){
        return "branch_id";
    }
    public String getFAdminFoodsYear(){
        return "admin_foods_year";
    }
    public String getFAdminFoodsMonth(){
        return "admin_foods_month";
    }
    public String getFAdminFoodsPeriod(){
        return "admin_foods_period";
    }
    public String getFCntReceive(){
        return "cnt_receive";
    }
    public String getFCntApprove(){
        return "cnt_approve";
    }
    public String getFCntSend(){
        return "cnt_send";
    }

    public AdminTFoods(String adminFoodsId) {
        this.adminFoodsId = adminFoodsId;
    }

    public String getAdminFoodsId() {
        return adminFoodsId;
    }

    public void setAdminFoodsId(String adminFoodsId) {
        this.adminFoodsId = adminFoodsId;
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

    public String getAdminFoodsActive() {
        return adminFoodsActive;
    }

    public void setAdminFoodsActive(String adminFoodsActive) {
        this.adminFoodsActive = adminFoodsActive;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getAdminFoodsDate() {
        return adminFoodsDate;
    }
    public void setAdminFoodsDate(String adminFoodsDate) {
        this.adminFoodsDate = adminFoodsDate;
    }

    public Double getAmountReceive() {
        return amountReceive;
    }
    public void setAmountReceive(Double amountReceive) {
        this.amountReceive = amountReceive;
    }

    public Double getNettotalReceive() {
        return nettotalReceive;
    }
    public void setNettotalReceive(Double nettotalReceive) {
        this.nettotalReceive = nettotalReceive;
    }

    public Double getAmountApprove() {
        return amountApprove;
    }
    public void setAmountApprove(Double amountApprove) {
        this.amountApprove = amountApprove;
    }

    public Double getNettotalApprove() {
        return nettotalApprove;
    }
    public void setNettotalApprove(Double nettotalApprove) {
        this.nettotalApprove = nettotalApprove;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getAdminFoodsYear() {
        return adminFoodsYear;
    }
    public void setAdminFoodsYear(String adminFoodsYear) {
        this.adminFoodsYear = adminFoodsYear;
    }
    public String getAdminFoodsMonth() {
        return adminFoodsMonth;
    }
    public void setAdminFoodsMonth(String adminFoodsMonth) {
        this.adminFoodsMonth = adminFoodsMonth;
    }
    public String getAdminFoodsPeriod() {
        return adminFoodsPeriod;
    }
    public void setAdminFoodsPeriod(String adminFoodsPeriod) {
        this.adminFoodsPeriod = adminFoodsPeriod;
    }

    public Double getCntReceive() {
        return cntReceive;
    }
    public void setcntReceive(Double cntReceive) {
        this.cntReceive = cntReceive;
    }
    public Double getCntSend() {
        return cntSend;
    }
    public void setcntSend(Double cntSend) {
        this.cntSend = cntSend;
    }
    public Double getCntApprove() {
        return cntApprove;
    }
    public void setcntApprove(Double cntApprove) {
        this.cntApprove = cntApprove;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminFoodsId != null ? adminFoodsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTFoods)) {
            return false;
        }
        AdminTFoods other = (AdminTFoods) object;
        if ((this.adminFoodsId == null && other.adminFoodsId != null) || (this.adminFoodsId != null && !this.adminFoodsId.equals(other.adminFoodsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminTFoods[adminFoodsId=" + adminFoodsId + "]";
    }

}
