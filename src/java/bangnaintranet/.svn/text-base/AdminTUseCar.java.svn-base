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
@Table(name = "admin_t_use_car", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "AdminTUseCar.findAll", query = "SELECT a FROM AdminTUseCar a"), @NamedQuery(name = "AdminTUseCar.findByUseCarId", query = "SELECT a FROM AdminTUseCar a WHERE a.useCarId = :useCarId"), @NamedQuery(name = "AdminTUseCar.findByCarId", query = "SELECT a FROM AdminTUseCar a WHERE a.carId = :carId"), @NamedQuery(name = "AdminTUseCar.findByUseCarDate", query = "SELECT a FROM AdminTUseCar a WHERE a.useCarDate = :useCarDate"), @NamedQuery(name = "AdminTUseCar.findByDepartmentId", query = "SELECT a FROM AdminTUseCar a WHERE a.departmentId = :departmentId"), @NamedQuery(name = "AdminTUseCar.findByBranchId", query = "SELECT a FROM AdminTUseCar a WHERE a.branchId = :branchId"), @NamedQuery(name = "AdminTUseCar.findByUseCategory", query = "SELECT a FROM AdminTUseCar a WHERE a.useCategory = :useCategory"), @NamedQuery(name = "AdminTUseCar.findByDescription", query = "SELECT a FROM AdminTUseCar a WHERE a.description = :description"), @NamedQuery(name = "AdminTUseCar.findByQty", query = "SELECT a FROM AdminTUseCar a WHERE a.qty = :qty"), @NamedQuery(name = "AdminTUseCar.findByRemark", query = "SELECT a FROM AdminTUseCar a WHERE a.remark = :remark"), @NamedQuery(name = "AdminTUseCar.findByUserIdUseCar", query = "SELECT a FROM AdminTUseCar a WHERE a.userIdUseCar = :userIdUseCar"), @NamedQuery(name = "AdminTUseCar.findByUserNametUseCar", query = "SELECT a FROM AdminTUseCar a WHERE a.userNametUseCar = :userNametUseCar"), @NamedQuery(name = "AdminTUseCar.findByUserIdApprove", query = "SELECT a FROM AdminTUseCar a WHERE a.userIdApprove = :userIdApprove"), @NamedQuery(name = "AdminTUseCar.findByUserNametApprove", query = "SELECT a FROM AdminTUseCar a WHERE a.userNametApprove = :userNametApprove"), @NamedQuery(name = "AdminTUseCar.findByApproveDate", query = "SELECT a FROM AdminTUseCar a WHERE a.approveDate = :approveDate"), @NamedQuery(name = "AdminTUseCar.findByApproveTime", query = "SELECT a FROM AdminTUseCar a WHERE a.approveTime = :approveTime"), @NamedQuery(name = "AdminTUseCar.findByCarIdDepartDate", query = "SELECT a FROM AdminTUseCar a WHERE a.carIdDepartDate = :carIdDepartDate"), @NamedQuery(name = "AdminTUseCar.findByCarIdDepartTime", query = "SELECT a FROM AdminTUseCar a WHERE a.carIdDepartTime = :carIdDepartTime"), @NamedQuery(name = "AdminTUseCar.findByCarIdArriveDate", query = "SELECT a FROM AdminTUseCar a WHERE a.carIdArriveDate = :carIdArriveDate"), @NamedQuery(name = "AdminTUseCar.findByCarIdArriveTime", query = "SELECT a FROM AdminTUseCar a WHERE a.carIdArriveTime = :carIdArriveTime"), @NamedQuery(name = "AdminTUseCar.findByUserIdDriver", query = "SELECT a FROM AdminTUseCar a WHERE a.userIdDriver = :userIdDriver"), @NamedQuery(name = "AdminTUseCar.findByUserNametDriver", query = "SELECT a FROM AdminTUseCar a WHERE a.userNametDriver = :userNametDriver"), @NamedQuery(name = "AdminTUseCar.findByDestination", query = "SELECT a FROM AdminTUseCar a WHERE a.destination = :destination"), @NamedQuery(name = "AdminTUseCar.findByUserIdCreate", query = "SELECT a FROM AdminTUseCar a WHERE a.userIdCreate = :userIdCreate"), @NamedQuery(name = "AdminTUseCar.findByUserIdModify", query = "SELECT a FROM AdminTUseCar a WHERE a.userIdModify = :userIdModify"), @NamedQuery(name = "AdminTUseCar.findByUserIdCancel", query = "SELECT a FROM AdminTUseCar a WHERE a.userIdCancel = :userIdCancel"), @NamedQuery(name = "AdminTUseCar.findByDateCreate", query = "SELECT a FROM AdminTUseCar a WHERE a.dateCreate = :dateCreate"), @NamedQuery(name = "AdminTUseCar.findByDateModify", query = "SELECT a FROM AdminTUseCar a WHERE a.dateModify = :dateModify"), @NamedQuery(name = "AdminTUseCar.findByDateCancel", query = "SELECT a FROM AdminTUseCar a WHERE a.dateCancel = :dateCancel")})
public class AdminTUseCar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "use_car_id", nullable = false, length = 255)
    private String useCarId="";
    @Column(name = "car_id", length = 255)
    private String carId="";
    @Column(name = "use_car_date", length = 255)
    private String useCarDate="";
    @Column(name = "department_id", length = 255)
    private String departmentId="",departmentNamet="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "use_category", length = 255)
    private String useCategory="";
    @Column(name = "description", length = 255)
    private String description="";
    @Column(name = "qty", length = 255)
    private String qty="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "user_id_use_car", length = 255)
    private String userIdUseCar="";
    @Column(name = "user_namet_use_car", length = 255)
    private String userNametUseCar="";
    @Column(name = "user_id_approve", length = 255)
    private String userIdApprove="";
    @Column(name = "user_namet_approve", length = 255)
    private String userNametApprove="";
    @Column(name = "approve_date", length = 255)
    private String approveDate="";
    @Column(name = "approve_time", length = 255)
    private String approveTime="";
    @Column(name = "car_id_depart_date", length = 255)
    private String carIdDepartDate="";
    @Column(name = "car_id_depart_time", length = 255)
    private String carIdDepartTime="";
    @Column(name = "car_id_arrive_date", length = 255)
    private String carIdArriveDate="";
    @Column(name = "car_id_arrive_time", length = 255)
    private String carIdArriveTime="";
    @Column(name = "user_id_driver", length = 255)
    private String userIdDriver="";
    @Column(name = "user_namet_driver", length = 255)
    private String userNametDriver="";
    @Column(name = "destination", length = 255)
    private String destination="";
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
    @Column(name = "use_car_active", length = 255)
    private String useCarActive="";
    @Column(name = "apply_date", length = 255)
    private String applyDate="";
    @Column(name = "use_car_time", length = 255)
    private String useCarTime="";

    public AdminTUseCar() {
    }
    public String getAdminTUseCar() {
        return "admin_t_use_car";
    }
    public String getFUseCarId() {
        return "use_car_id";
    }
    public String getFCarId() {
        return "car_id";
    }
    public String getFUseCarDate() {
        return "use_car_date";
    }
    public String getFDepartmentId() {
        return "department_id";
    }
    public String getFBranchId() {
        return "branch_id";
    }
    public String getFUseCategory() {
        return "use_category";
    }
    public String getFDescription() {
        return "description";
    }
    public String getFQty() {
        return "qty";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFUserIdUseCar() {
        return "user_id_use_car";
    }
    public String getFUserNametUseCar() {
        return "user_namet_use_car";
    }
    public String getFUserIdApprove() {
        return "user_id_approve";
    }
    public String getFUserNametApprove() {
        return "user_namet_approve";
    }
    public String getFApproveDate() {
        return "approve_date";
    }
    public String getFApproveTime() {
        return "approve_time";
    }
    public String getFCarIdDepartDate() {
        return "car_id_depart_date";
    }
    public String getFCarIdDepartTime() {
        return "car_id_depart_time";
    }
    public String getFCarIdArriveDate() {
        return "car_id_arrive_date";
    }
    public String getFCarIdArriveTime() {
        return "car_id_arrive_time";
    }
    public String getFUserIdDriver() {
        return "user_id_driver";
    }
    public String getFUserNametDriver() {
        return "user_namet_driver";
    }
    public String getFDestination() {
        return "destination";
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
    public String getFUseCarActive() {
        return "use_car_active";
    }
    public String getFApplyDate() {
        return "apply_date";
    }
    public String getFUseCarTime() {
        return "use_car_time";
    }

    public AdminTUseCar(String useCarId) {
        this.useCarId = useCarId;
    }


    public String getUseCarId() {
        return useCarId;
    }

    public void setUseCarId(String useCarId) {
        this.useCarId = useCarId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getUseCarDate() {
        return useCarDate;
    }

    public void setUseCarDate(String useCarDate) {
        this.useCarDate = useCarDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public String getDepartmentNamet() {
        return departmentNamet;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public void setDepartmentNamet(String departmentNamet) {
        this.departmentNamet = departmentNamet;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getUseCategory() {
        return useCategory;
    }
    public String getUseCategoryNamet() {
        if(useCategory.equals("1")){
            return "√∂∑—Ë«‰ª";
        }
        else{
            return "√∂©ÿ°‡©‘π";
        }
        
    }
    public void setUseCategory(String useCategory) {
        this.useCategory = useCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUserIdUseCar() {
        return userIdUseCar;
    }

    public void setUserIdUseCar(String userIdUseCar) {
        this.userIdUseCar = userIdUseCar;
    }

    public String getUserNametUseCar() {
        return userNametUseCar;
    }

    public void setUserNametUseCar(String userNametUseCar) {
        this.userNametUseCar = userNametUseCar;
    }

    public String getUserIdApprove() {
        return userIdApprove;
    }

    public void setUserIdApprove(String userIdApprove) {
        this.userIdApprove = userIdApprove;
    }

    public String getUserNametApprove() {
        return userNametApprove;
    }

    public void setUserNametApprove(String userNametApprove) {
        this.userNametApprove = userNametApprove;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public String getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime;
    }

    public String getCarIdDepartDate() {
        return carIdDepartDate;
    }

    public void setCarIdDepartDate(String carIdDepartDate) {
        this.carIdDepartDate = carIdDepartDate;
    }

    public String getCarIdDepartTime() {
        return carIdDepartTime;
    }

    public void setCarIdDepartTime(String carIdDepartTime) {
        this.carIdDepartTime = carIdDepartTime;
    }

    public String getCarIdArriveDate() {
        return carIdArriveDate;
    }

    public void setCarIdArriveDate(String carIdArriveDate) {
        this.carIdArriveDate = carIdArriveDate;
    }

    public String getCarIdArriveTime() {
        return carIdArriveTime;
    }

    public void setCarIdArriveTime(String carIdArriveTime) {
        this.carIdArriveTime = carIdArriveTime;
    }

    public String getUserIdDriver() {
        return userIdDriver;
    }

    public void setUserIdDriver(String userIdDriver) {
        this.userIdDriver = userIdDriver;
    }

    public String getUserNametDriver() {
        return userNametDriver;
    }

    public void setUserNametDriver(String userNametDriver) {
        this.userNametDriver = userNametDriver;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public String getUseCarActive() {
        return useCarActive;
    }
    public void setUseCarActive(String useCarActive) {
        this.useCarActive = useCarActive;
    }

    public String getApplyDate() {
        return applyDate;
    }
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getUseCarTime() {
        return useCarTime;
    }
    public void setUseCarTime(String useCarTime) {
        this.useCarTime = useCarTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (useCarId != null ? useCarId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminTUseCar)) {
            return false;
        }
        AdminTUseCar other = (AdminTUseCar) object;
        if ((this.useCarId == null && other.useCarId != null) || (this.useCarId != null && !this.useCarId.equals(other.useCarId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.AdminTUseCar[useCarId=" + useCarId + "]";
    }

}
