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
@Table(name = "nurse_t_foods_order_detail", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "NurseTFoodsOrderDetail.findAll", query = "SELECT n FROM NurseTFoodsOrderDetail n")})
public class NurseTFoodsOrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "foods_order_detail_id", nullable = false, length = 255)
    private String foodsOrderDetailId="";
    @Column(name = "room_id", length = 255)
    private String roomId="";
    @Column(name = "bed_id", length = 255)
    private String bedId="";
    @Column(name = "patient_hn_no", length = 255)
    private String patientHnNo="";
    @Column(name = "patient_fullnamet", length = 255)
    private String patientFullnamet="";
    @Column(name = "type_foods_id", length = 255)
    private String typeFoodsId="";
    @Column(name = "type_foods_namet", length = 255)
    private String typeFoodsNamet="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "foods_order_id", length = 255)
    private String foodsOrderId="";
    @Column(name = "foods_order_detail_active", length = 255)
    private String foodsOrderDetailActive="";
    @Column(name = "paid_id", length = 255)
    private String paidId="";
    @Column(name = "paid_namet", length = 255)
    private String paidNamet="";
    @Column(name = "page_number", length = 255)
    private String pageNumber="";
    @Column(name = "foods_price", precision = 17, scale = 17)
    private Double foodsPrice=0.0;
    @Column(name = "ward_namet", length = 255)
    private String wardNamet="";

    public NurseTFoodsOrderDetail() {
    }

    public NurseTFoodsOrderDetail(String foodsOrderDetailId) {
        this.foodsOrderDetailId = foodsOrderDetailId;
    }
    public String getNurseTFoodsOrderDetail() {
        return "nurse_t_foods_order_detail";
    }

    public String getFFoodsOrderDetailId() {
        return "foods_order_detail_id";
    }
    public String getFRoomId() {
        return "room_id";
    }
    public String getFBedId() {
        return "bed_id";
    }
    public String getFPatientHnNo() {
        return "patient_hn_no";
    }
    public String getFPatientFullNamet() {
        return "patient_fullnamet";
    }
    public String getFTypeFoodsId() {
        return "type_foods_id";
    }
    public String getFTypeFoodsNamet() {
        return "type_foods_namet";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFFoodsOrderId() {
        return "foods_order_id";
    }
    public String getFFoodsOrderDetailActive() {
        return "foods_order_detail_active";
    }
    public String getFPaidId() {
        return "paid_id";
    }
    public String getFPaidNamet() {
        return "paid_namet";
    }
    public String getFPageNumber() {
        return "page_number";
    }
    public String getFFoodsPrice() {
        return "foods_price";
    }

    public String getFoodsOrderDetailId() {
        return foodsOrderDetailId;
    }

    public void setFoodsOrderDetailId(String foodsOrderDetailId) {
        this.foodsOrderDetailId = foodsOrderDetailId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getPatientHnNo() {
        return patientHnNo;
    }

    public void setPatientHnNo(String patientHnNo) {
        this.patientHnNo = patientHnNo;
    }

    public String getPatientFullnamet() {
        return patientFullnamet;
    }

    public void setPatientFullnamet(String patientFullnamet) {
        this.patientFullnamet = patientFullnamet;
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

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFoodsOrderId() {
        return foodsOrderId;
    }
    public void setFoodsOrderId(String foodsorderid) {
        this.foodsOrderId = foodsorderid;
    }

    public String getFoodsOrderDetailActice() {
        return foodsOrderDetailActive;
    }
    public void setFoodsOrderDetailActive(String foodsorderdetailactive) {
        this.foodsOrderDetailActive = foodsorderdetailactive;
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

    public String getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Double getFoodsPrice() {
        return foodsPrice;
    }
    public void setFoodsPrice(Double foodsPrice) {
        this.foodsPrice = foodsPrice;
    }

    public String getWardNamet() {
        return wardNamet;
    }
    public void setWardNamet(String wardNamet) {
        this.wardNamet = wardNamet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodsOrderDetailId != null ? foodsOrderDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NurseTFoodsOrderDetail)) {
            return false;
        }
        NurseTFoodsOrderDetail other = (NurseTFoodsOrderDetail) object;
        if ((this.foodsOrderDetailId == null && other.foodsOrderDetailId != null) || (this.foodsOrderDetailId != null && !this.foodsOrderDetailId.equals(other.foodsOrderDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NurseTFoodsOrderDetail[foodsOrderDetailId=" + foodsOrderDetailId + "]";
    }

}
