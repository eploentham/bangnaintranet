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
@Table(name = "admin_t_foods_detail", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminTFoodsDetail.findAll", query = "SELECT a FROM AdminTFoodsDetail a")})
public class AdminTFoodsDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "admin_foods_detail_id", nullable = false, length = 255)
    private String adminFoodsDetailId="";
    @Column(name = "admin_foods_id", length = 255)
    private String adminFoodsId="";
    @Column(name = "foods_order_date", length = 255)
    private String foodsOrderDate="";
    @Column(name = "type_foods_id", length = 255)
    private String typeFoodsId="";
    @Column(name = "type_foods_namet", length = 255)
    private String typeFoodsNamet="";
    @Column(name = "paid_id", length = 255)
    private String paidId="";
    @Column(name = "paid_namet", length = 255)
    private String paidNamet="";
    @Column(name = "cnt_foods_id", precision = 17, scale = 17)
    private Double cntFoodsId=0.0;
    @Column(name = "amount_foods_id", precision = 17, scale = 17)
    private Double amountFoodsId=0.0;
    @Column(name = "foods_price", precision = 17, scale = 17)
    private Double foodsPrice=0.0;

    public AdminTFoodsDetail() {
    }
    public String getAdminTFoodsDetail(){
        return "admin_t_foods_detail";
    }
    public String getFAdminFoodsDetailId(){
        return "admin_foods_detail_id";
    }
    public String getFAdminFoodsId(){
        return "admin_foods_id";
    }
    public String getFFoodsOrderDate(){
        return "foods_order_date";
    }
    public String getFTypeFoodsId(){
        return "type_foods_id";
    }
    public String getFTypeFoodsNamet(){
        return "type_foods_namet";
    }
    public String getFPaidId(){
        return "paid_id";
    }
    public String getFPaidNamet(){
        return "paid_namet";
    }
    public String getFCntFoodsId(){
        return "cnt_foods_id";
    }
    public String getFAmountFoodsId(){
        return "amount_foods_id";
    }
    public String getFFoodsPrice(){
        return "foods_price";
    }

    public AdminTFoodsDetail(String adminFoodsDetailId) {
        this.adminFoodsDetailId = adminFoodsDetailId;
    }

    public String getAdminFoodsDetailId() {
        return adminFoodsDetailId;
    }

    public void setAdminFoodsDetailId(String adminFoodsDetailId) {
        this.adminFoodsDetailId = adminFoodsDetailId;
    }

    public String getAdminFoodsId() {
        return adminFoodsId;
    }

    public void setAdminFoodsId(String adminFoodsId) {
        this.adminFoodsId = adminFoodsId;
    }

    public String getFoodsOrderDate() {
        return foodsOrderDate;
    }

    public void setFoodsOrderDate(String foodsOrderDate) {
        this.foodsOrderDate = foodsOrderDate;
    }

    public String getTypeFoodsId() {
        return typeFoodsId;
    }

    public void setTypeFoodsId(String typeFoodsId) {
        this.typeFoodsId = typeFoodsId;
    }

    public String getTypeFoodsNamet() {
        return typeFoodsNamet;
    }

    public void setTypeFoodsNamet(String typeFoodsNamet) {
        this.typeFoodsNamet = typeFoodsNamet;
    }

    public String getPaidId() {
        return paidId;
    }

    public void setPaidId(String paidId) {
        this.paidId = paidId;
    }

    public String getPaidNamet() {
        return paidNamet;
    }

    public void setPaidNamet(String paidNamet) {
        this.paidNamet = paidNamet;
    }

    public Double getCntFoodsId() {
        return cntFoodsId;
    }
    public void setCntFoodsId(Double cntFoodsId) {
        this.cntFoodsId = cntFoodsId;
    }

    public Double getAmountFoodsId() {
        return amountFoodsId;
    }
    public void setAmountFoodsId(Double amountFoodsId) {
        this.amountFoodsId = amountFoodsId;
    }
    public Double getFoodsPrice() {
        return foodsPrice;
    }
    public void setFoodsPrice(Double foodsPrice) {
        this.foodsPrice = foodsPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminFoodsDetailId != null ? adminFoodsDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTFoodsDetail)) {
            return false;
        }
        AdminTFoodsDetail other = (AdminTFoodsDetail) object;
        if ((this.adminFoodsDetailId == null && other.adminFoodsDetailId != null) || (this.adminFoodsDetailId != null && !this.adminFoodsDetailId.equals(other.adminFoodsDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminTFoodsDetail[adminFoodsDetailId=" + adminFoodsDetailId + "]";
    }

}
