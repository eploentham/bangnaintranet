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
@Table(name = "admin_b_car", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminBCar.findAll", query = "SELECT a FROM AdminBCar a"), @NamedQuery(name = "AdminBCar.findByCarId", query = "SELECT a FROM AdminBCar a WHERE a.carId = :carId"), @NamedQuery(name = "AdminBCar.findByCarNamet", query = "SELECT a FROM AdminBCar a WHERE a.carNamet = :carNamet"), @NamedQuery(name = "AdminBCar.findByCarActive", query = "SELECT a FROM AdminBCar a WHERE a.carActive = :carActive"), @NamedQuery(name = "AdminBCar.findByRemark", query = "SELECT a FROM AdminBCar a WHERE a.remark = :remark"), @NamedQuery(name = "AdminBCar.findByCarPlate", query = "SELECT a FROM AdminBCar a WHERE a.carPlate = :carPlate"), @NamedQuery(name = "AdminBCar.findByDateCreate", query = "SELECT a FROM AdminBCar a WHERE a.dateCreate = :dateCreate"), @NamedQuery(name = "AdminBCar.findByDateModify", query = "SELECT a FROM AdminBCar a WHERE a.dateModify = :dateModify"), @NamedQuery(name = "AdminBCar.findByDateCancel", query = "SELECT a FROM AdminBCar a WHERE a.dateCancel = :dateCancel"), @NamedQuery(name = "AdminBCar.findByUserCreate", query = "SELECT a FROM AdminBCar a WHERE a.userCreate = :userCreate"), @NamedQuery(name = "AdminBCar.findByUserModify", query = "SELECT a FROM AdminBCar a WHERE a.userModify = :userModify"), @NamedQuery(name = "AdminBCar.findByUserCancel", query = "SELECT a FROM AdminBCar a WHERE a.userCancel = :userCancel"), @NamedQuery(name = "AdminBCar.findByBranchId", query = "SELECT a FROM AdminBCar a WHERE a.branchId = :branchId")})
public class AdminBCar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "car_id", nullable = false, length = 255)
    private String carId="";
    @Column(name = "car_namet", length = 255)
    private String carNamet="";
    @Column(name = "car_active", length = 255)
    private String carActive="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "car_plate", length = 255)
    private String carPlate="";
    @Column(name = "date_create", length = 255)
    private String dateCreate="";
    @Column(name = "date_modify", length = 255)
    private String dateModify="";
    @Column(name = "date_cancel", length = 255)
    private String dateCancel="";
    @Column(name = "user_id_create", length = 255)
    private String userIdCreate="";
    @Column(name = "user_id_modify", length = 255)
    private String userIdModify="";
    @Column(name = "user_id_cancel", length = 255)
    private String userIdCancel="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "sort1", length = 255)
    private String sort1="";

    public AdminBCar() {
    }
    public String getAdminBCar() {
        return "admin_b_car";
    }
    public String getFCarId() {
        return "car_id";
    }
    public String getFCarNamet() {
        return "car_namet";
    }
    public String getFCarActive() {
        return "car_active";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFCarPlate() {
        return "car_plate";
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
    public String getFUserIdCreate() {
        return "user_id_create";
    }
    public String getFUserIdModify() {
        return "user_id_modify";
    }
    public String getFUserIdCancel() {
        return "user_id_cancel";
    }
    public String getFBranchId() {
        return "branch_id";
    }
    public String getFSort1() {
        return "sort1";
    }

    public AdminBCar(String carId) {
        this.carId = carId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarNamet() {
        return carNamet;
    }

    public void setCarNamet(String carNamet) {
        this.carNamet = carNamet;
    }

    public String getCarActive() {
        return carActive;
    }

    public void setCarActive(String carActive) {
        this.carActive = carActive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
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

    public String getUserIdCreate() {
        return userIdCreate;
    }

    public void setUserIdCreate(String userCreate) {
        this.userIdCreate = userCreate;
    }

    public String getUserIdModify() {
        return userIdModify;
    }

    public void setUserIdModify(String userModify) {
        this.userIdModify = userModify;
    }

    public String getUserIdCancel() {
        return userIdCancel;
    }
    public void setUserIdCancel(String userCancel) {
        this.userIdCancel = userCancel;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getSort1() {
        return sort1;
    }
    public void setSort1(String sort1) {
        this.sort1 = sort1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carId != null ? carId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminBCar)) {
            return false;
        }
        AdminBCar other = (AdminBCar) object;
        if ((this.carId == null && other.carId != null) || (this.carId != null && !this.carId.equals(other.carId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminBCar[carId=" + carId + "]";
    }

}
