/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@Table(name = "nurse_t_wound_care_detail", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "NurseTWoundCareDetail.findAll", query = "SELECT n FROM NurseTWoundCareDetail n"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundCareDetailId", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundCareDetailId = :woundCareDetailId"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundCareId", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundCareId = :woundCareId"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundCareDate", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundCareDate = :woundCareDate"), @NamedQuery(name = "NurseTWoundCareDetail.findByDoctorDx", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.doctorDx = :doctorDx"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundMethodCategory", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundMethodCategory = :woundMethodCategory"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundMethodCategoryDescription", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundMethodCategoryDescription = :woundMethodCategoryDescription"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundMethodCareCategorySpecial", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundMethodCareCategorySpecial = :woundMethodCareCategorySpecial"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundMethodCareCategorySpecialDescription", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundMethodCareCategorySpecialDescription = :woundMethodCareCategorySpecialDescription"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundCareTime", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundCareTime = :woundCareTime"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeFlag", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeFlag = :woundEstimateBeforeFlag"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeFlagDischargeDescription", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeFlagDischargeDescription = :woundEstimateBeforeFlagDischargeDescription"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeFlagDischargeQuantity", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeFlagDischargeQuantity = :woundEstimateBeforeFlagDischargeQuantity"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeFlagDischargeFeature", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeFlagDischargeFeature = :woundEstimateBeforeFlagDischargeFeature"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeCategory", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeCategory = :woundEstimateBeforeCategory"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeCategoryOtherDescription", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeCategoryOtherDescription = :woundEstimateBeforeCategoryOtherDescription"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateBeforeCategoryDimensionDescription", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateBeforeCategoryDimensionDescription = :woundEstimateBeforeCategoryDimensionDescription"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateAfterFlag", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateAfterFlag = :woundEstimateAfterFlag"), @NamedQuery(name = "NurseTWoundCareDetail.findByWoundEstimateAfterFlagSolve", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.woundEstimateAfterFlagSolve = :woundEstimateAfterFlagSolve"), @NamedQuery(name = "NurseTWoundCareDetail.findByUserIdCreate", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.userIdCreate = :userIdCreate"), @NamedQuery(name = "NurseTWoundCareDetail.findByUserIdModify", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.userIdModify = :userIdModify"), @NamedQuery(name = "NurseTWoundCareDetail.findByUserIdCancel", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.userIdCancel = :userIdCancel"), @NamedQuery(name = "NurseTWoundCareDetail.findByDateCreate", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.dateCreate = :dateCreate"), @NamedQuery(name = "NurseTWoundCareDetail.findByDateModify", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.dateModify = :dateModify"), @NamedQuery(name = "NurseTWoundCareDetail.findByDateCancel", query = "SELECT n FROM NurseTWoundCareDetail n WHERE n.dateCancel = :dateCancel")})
public class NurseTWoundCareDetail implements Serializable {
    Config1 config1 = new Config1();
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wound_care_detail_id", nullable = false, length = 255)
    private String woundCareDetailId="";
    @Column(name = "wound_care_id", length = 255)
    private String woundCareId="";
    @Column(name = "wound_care_date", length = 255)
    private String woundCareDate="";
    @Column(name = "doctor_dx", length = 255)
    private String doctorDx="";
    @Column(name = "wound_method_category", length = 255)
    private String woundMethodCategory="";
    @Column(name = "wound_method_category_description", length = 255)
    private String woundMethodCategoryDescription="";
    @Column(name = "wound_method_care_category_special", length = 255)
    private String woundMethodCareCategorySpecial="";
    @Column(name = "wound_method_care_category_special_description", length = 255)
    private String woundMethodCareCategorySpecialDescription="";
    @Column(name = "wound_care_time", length = 255)
    private String woundCareTime="";
    @Column(name = "wound_estimate_before_flag", length = 255)
    private String woundEstimateBeforeFlag="";
    @Column(name = "wound_estimate_before_flag_discharge_description", length = 255)
    private String woundEstimateBeforeFlagDischargeDescription="";
    @Column(name = "wound_estimate_before_flag_discharge_quantity", length = 255)
    private String woundEstimateBeforeFlagDischargeQuantity="";
    @Column(name = "wound_estimate_before_flag_discharge_feature", length = 255)
    private String woundEstimateBeforeFlagDischargeFeature="";
    @Column(name = "wound_estimate_before_category", length = 255)
    private String woundEstimateBeforeCategory="";
    @Column(name = "wound_estimate_before_category_other_description", length = 255)
    private String woundEstimateBeforeCategoryOtherDescription="";
    @Column(name = "wound_estimate_before_category_dimension_description", length = 255)
    private String woundEstimateBeforeCategoryDimensionDescription="";
    @Column(name = "wound_estimate_after_flag", length = 255)
    private String woundEstimateAfterFlag="";
    @Column(name = "wound_estimate_after_flag_solve", length = 255)
    private String woundEstimateAfterFlagSolve="";
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
    @Column(name = "user_remark", length = 255)
    private String userRemark="";

    public NurseTWoundCareDetail() {
    }
    public String NurseTWoundCareDetail() {
        return "nurse_t_wound_care_detail";
    }
    public String WoundCareDetailId() {
        return "wound_care_detail_id";
    }
    public String WoundCareId() {
        return "wound_care_id";
    }
    public String WoundCareDate() {
        return "wound_care_date";
    }
    public String DoctorDx() {
        return "doctor_dx";
    }
    public String WoundMethodCategory() {
        return "wound_method_category";
    }
    public String WoundMethodCategoryDescription() {
        return "wound_method_category_description";
    }
    public String WoundMethodCareCategorySpecial() {
        return "wound_method_care_category_special";
    }

    public String WoundMethodCareCategorySpecialDescription() {
        return "wound_method_care_category_special_description";
    }
    public String WoundCareTime() {
        return "wound_care_time";
    }
    public String WoundEstimateBeforeFlag() {
        return "wound_estimate_before_flag";
    }
    public String WoundEstimateBeforeFlagDischargeDescription() {
        return "wound_estimate_before_flag_discharge_description";
    }
    public String WoundEstimateBeforeFlagDischargeQuantity() {
        return "wound_estimate_before_flag_discharge_quantity";
    }
    public String WoundEstimateBeforeFlagDischargeFeature() {
        return "wound_estimate_before_flag_discharge_feature";
    }
    public String WoundEstimateBeforeCategory() {
        return "wound_estimate_before_category";
    }
    public String WoundEstimateBeforeCategoryOtherDescription() {
        return "wound_estimate_before_category_other_description";
    }
    public String WoundEstimateBeforeCategoryDimensionDescription() {
        return "wound_estimate_before_category_dimension_description";
    }
    public String WoundEstimateAfterFlag() {
        return "wound_estimate_after_flag";
    }
    public String WoundEstimateAfterFlagSolve() {
        return "wound_estimate_after_flag_solve";
    }
    public String UserIdCreate() {
        return "user_id_create";
    }
    public String UserIdModify() {
        return "user_id_modify";
    }
    public String UserIdCancel() {
        return "user_id_cancel";
    }
    public String DateCreate() {
        return "date_create";
    }
    public String DateModify() {
        return "date_modify";
    }
    public String DateCancel() {
        return "date_cancel";
    }    
    public String UserRemark() {
        return "user_remark";
    }

    public NurseTWoundCareDetail(String woundCareDetailId) {
        this.woundCareDetailId = woundCareDetailId;
    }

    public String getWoundCareDetailId() {
        return woundCareDetailId;
    }

    public void setWoundCareDetailId(String woundCareDetailId) {
        this.woundCareDetailId = woundCareDetailId;
    }

    public String getWoundCareId() {
        return woundCareId;
    }

    public void setWoundCareId(String woundCareId) {
        this.woundCareId = woundCareId;
    }

    public String getWoundCareDate() {
        return woundCareDate;
    }

    public void setWoundCareDate(String woundCareDate) {
        this.woundCareDate = woundCareDate;
    }
    public String getWoundCareDateddMMyy(String format) {
        String txt="";
        try {
            txt= config1.DateFormatDB2Show(woundCareDate, format);
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return txt;
    }

    public String getDoctorDx() {
        return doctorDx;
    }

    public void setDoctorDx(String doctorDx) {
        this.doctorDx = doctorDx;
    }

    public String getWoundMethodCategory() {
        return woundMethodCategory;
    }

    public void setWoundMethodCategory(String woundMethodCategory) {
        this.woundMethodCategory = woundMethodCategory;
    }

    public String getWoundMethodCategoryDescription() {
        return woundMethodCategoryDescription;
    }

    public void setWoundMethodCategoryDescription(String woundMethodCategoryDescription) {
        this.woundMethodCategoryDescription = woundMethodCategoryDescription;
    }

    public String getWoundMethodCareCategorySpecial() {
        return woundMethodCareCategorySpecial;
    }

    public void setWoundMethodCareCategorySpecial(String woundMethodCareCategorySpecial) {
        this.woundMethodCareCategorySpecial = woundMethodCareCategorySpecial;
    }

    public String getWoundMethodCareCategorySpecialDescription() {
        return woundMethodCareCategorySpecialDescription;
    }

    public void setWoundMethodCareCategorySpecialDescription(String woundMethodCareCategorySpecialDescription) {
        this.woundMethodCareCategorySpecialDescription = woundMethodCareCategorySpecialDescription;
    }

    public String getWoundCareTime() {
        return woundCareTime;
    }

    public void setWoundCareTime(String woundCareTime) {
        this.woundCareTime = woundCareTime;
    }

    public String getWoundEstimateBeforeFlag() {
        return woundEstimateBeforeFlag;
    }

    public void setWoundEstimateBeforeFlag(String woundEstimateBeforeFlag) {
        this.woundEstimateBeforeFlag = woundEstimateBeforeFlag;
    }

    public String getWoundEstimateBeforeFlagDischargeDescription() {
        return woundEstimateBeforeFlagDischargeDescription;
    }

    public void setWoundEstimateBeforeFlagDischargeDescription(String woundEstimateBeforeFlagDischargeDescription) {
        this.woundEstimateBeforeFlagDischargeDescription = woundEstimateBeforeFlagDischargeDescription;
    }

    public String getWoundEstimateBeforeFlagDischargeQuantity() {
        return woundEstimateBeforeFlagDischargeQuantity;
    }

    public void setWoundEstimateBeforeFlagDischargeQuantity(String woundEstimateBeforeFlagDischargeQuantity) {
        this.woundEstimateBeforeFlagDischargeQuantity = woundEstimateBeforeFlagDischargeQuantity;
    }

    public String getWoundEstimateBeforeFlagDischargeFeature() {
        return woundEstimateBeforeFlagDischargeFeature;
    }

    public void setWoundEstimateBeforeFlagDischargeFeature(String woundEstimateBeforeFlagDischargeFeature) {
        this.woundEstimateBeforeFlagDischargeFeature = woundEstimateBeforeFlagDischargeFeature;
    }

    public String getWoundEstimateBeforeCategory() {
        return woundEstimateBeforeCategory;
    }

    public void setWoundEstimateBeforeCategory(String woundEstimateBeforeCategory) {
        this.woundEstimateBeforeCategory = woundEstimateBeforeCategory;
    }

    public String getWoundEstimateBeforeCategoryOtherDescription() {
        return woundEstimateBeforeCategoryOtherDescription;
    }

    public void setWoundEstimateBeforeCategoryOtherDescription(String woundEstimateBeforeCategoryOtherDescription) {
        this.woundEstimateBeforeCategoryOtherDescription = woundEstimateBeforeCategoryOtherDescription;
    }

    public String getWoundEstimateBeforeCategoryDimensionDescription() {
        return woundEstimateBeforeCategoryDimensionDescription;
    }

    public void setWoundEstimateBeforeCategoryDimensionDescription(String woundEstimateBeforeCategoryDimensionDescription) {
        this.woundEstimateBeforeCategoryDimensionDescription = woundEstimateBeforeCategoryDimensionDescription;
    }

    public String getWoundEstimateAfterFlag() {
        return woundEstimateAfterFlag;
    }

    public void setWoundEstimateAfterFlag(String woundEstimateAfterFlag) {
        this.woundEstimateAfterFlag = woundEstimateAfterFlag;
    }

    public String getWoundEstimateAfterFlagSolve() {
        return woundEstimateAfterFlagSolve;
    }

    public void setWoundEstimateAfterFlagSolve(String woundEstimateAfterFlagSolve) {
        this.woundEstimateAfterFlagSolve = woundEstimateAfterFlagSolve;
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
    public String getUserRemark() {
        return userRemark;
    }
    public void setUserRemark(String userremark) {
        this.userRemark = userremark;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (woundCareDetailId != null ? woundCareDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NurseTWoundCareDetail)) {
            return false;
        }
        NurseTWoundCareDetail other = (NurseTWoundCareDetail) object;
        if ((this.woundCareDetailId == null && other.woundCareDetailId != null) || (this.woundCareDetailId != null && !this.woundCareDetailId.equals(other.woundCareDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NurseTWoundCareDetail[woundCareDetailId=" + woundCareDetailId + "]";
    }

}
