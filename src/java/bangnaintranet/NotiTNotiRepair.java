/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

import java.io.File;
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
@Table(name = "noti_t_noti_repair", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "NotiTNotiRepair.findAll", query = "SELECT n FROM NotiTNotiRepair n"), @NamedQuery(name = "NotiTNotiRepair.findByNotiRepairId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.notiRepairId = :notiRepairId"), @NamedQuery(name = "NotiTNotiRepair.findByAttendDescription", query = "SELECT n FROM NotiTNotiRepair n WHERE n.attendDescription = :attendDescription"), @NamedQuery(name = "NotiTNotiRepair.findByAttendRemark", query = "SELECT n FROM NotiTNotiRepair n WHERE n.attendRemark = :attendRemark"), @NamedQuery(name = "NotiTNotiRepair.findByAttendDate", query = "SELECT n FROM NotiTNotiRepair n WHERE n.attendDate = :attendDate"), @NamedQuery(name = "NotiTNotiRepair.findByAttendTime", query = "SELECT n FROM NotiTNotiRepair n WHERE n.attendTime = :attendTime"), @NamedQuery(name = "NotiTNotiRepair.findByAttendUserId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.attendUserId = :attendUserId"), @NamedQuery(name = "NotiTNotiRepair.findByMaDescription", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maDescription = :maDescription"), @NamedQuery(name = "NotiTNotiRepair.findByMaRemark", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maRemark = :maRemark"), @NamedQuery(name = "NotiTNotiRepair.findByMaDate", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maDate = :maDate"), @NamedQuery(name = "NotiTNotiRepair.findByMaTime", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maTime = :maTime"), @NamedQuery(name = "NotiTNotiRepair.findByMaUserId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maUserId = :maUserId"), @NamedQuery(name = "NotiTNotiRepair.findByAttendDepartmentId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.attendDepartmentId = :attendDepartmentId"), @NamedQuery(name = "NotiTNotiRepair.findByMaintainId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maintainId = :maintainId"), @NamedQuery(name = "NotiTNotiRepair.findByActive", query = "SELECT n FROM NotiTNotiRepair n WHERE n.active = :active"), @NamedQuery(name = "NotiTNotiRepair.findByDateCreate", query = "SELECT n FROM NotiTNotiRepair n WHERE n.dateCreate = :dateCreate"), @NamedQuery(name = "NotiTNotiRepair.findByDateModify", query = "SELECT n FROM NotiTNotiRepair n WHERE n.dateModify = :dateModify"), @NamedQuery(name = "NotiTNotiRepair.findByDateCancel", query = "SELECT n FROM NotiTNotiRepair n WHERE n.dateCancel = :dateCancel"), @NamedQuery(name = "NotiTNotiRepair.findByUserIdCreate", query = "SELECT n FROM NotiTNotiRepair n WHERE n.userIdCreate = :userIdCreate"), @NamedQuery(name = "NotiTNotiRepair.findByUserIdModify", query = "SELECT n FROM NotiTNotiRepair n WHERE n.userIdModify = :userIdModify"), @NamedQuery(name = "NotiTNotiRepair.findByUserIdCancel", query = "SELECT n FROM NotiTNotiRepair n WHERE n.userIdCancel = :userIdCancel"), @NamedQuery(name = "NotiTNotiRepair.findByRemarkCancel", query = "SELECT n FROM NotiTNotiRepair n WHERE n.remarkCancel = :remarkCancel"), @NamedQuery(name = "NotiTNotiRepair.findByStatus", query = "SELECT n FROM NotiTNotiRepair n WHERE n.status = :status"), @NamedQuery(name = "NotiTNotiRepair.findByMaDepartmentId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.maDepartmentId = :maDepartmentId"), @NamedQuery(name = "NotiTNotiRepair.findBySerialNo", query = "SELECT n FROM NotiTNotiRepair n WHERE n.serialNo = :serialNo"), @NamedQuery(name = "NotiTNotiRepair.findByServiceTab", query = "SELECT n FROM NotiTNotiRepair n WHERE n.serviceTab = :serviceTab"), @NamedQuery(name = "NotiTNotiRepair.findByBrandId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.brandId = :brandId"), @NamedQuery(name = "NotiTNotiRepair.findByTypeDeviceId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.typeDeviceId = :typeDeviceId"), @NamedQuery(name = "NotiTNotiRepair.findBySymptoms", query = "SELECT n FROM NotiTNotiRepair n WHERE n.symptoms = :symptoms"), @NamedQuery(name = "NotiTNotiRepair.findByRepairStatus", query = "SELECT n FROM NotiTNotiRepair n WHERE n.repairStatus = :repairStatus"), @NamedQuery(name = "NotiTNotiRepair.findByModel", query = "SELECT n FROM NotiTNotiRepair n WHERE n.model = :model"), @NamedQuery(name = "NotiTNotiRepair.findByVendorId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.vendorId = :vendorId"), @NamedQuery(name = "NotiTNotiRepair.findByPriceRepair", query = "SELECT n FROM NotiTNotiRepair n WHERE n.priceRepair = :priceRepair"), @NamedQuery(name = "NotiTNotiRepair.findByVendorRemark", query = "SELECT n FROM NotiTNotiRepair n WHERE n.vendorRemark = :vendorRemark"), @NamedQuery(name = "NotiTNotiRepair.findByStatusWarranty", query = "SELECT n FROM NotiTNotiRepair n WHERE n.statusWarranty = :statusWarranty"), @NamedQuery(name = "NotiTNotiRepair.findByBranchId", query = "SELECT n FROM NotiTNotiRepair n WHERE n.branchId = :branchId")})
public class NotiTNotiRepair implements Serializable {
    Config1 config1 = new Config1();
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "noti_repair_id", nullable = false, length = 255)
    private String notiRepairId="",notiRepairPictureRepairFilenameShow="/Data/UpLoad/"+notiRepairId+".jpg";
    private String notiRepairPictureRepairFilename="D:\\bangnaintranet\\web\\picture\\"+notiRepairId+".jpg";
    private String notiRepairPictureQuotationFilenameShow="",notiRepairPictureQuotationFilename="";
    @Column(name = "attend_description", length = 255)
    private String attendDescription="";
    @Column(name = "attend_remark", length = 255)
    private String attendRemark="";
    @Column(name = "attend_date", length = 255)
    private String attendDate="";
    @Column(name = "attend_time", length = 255)
    private String attendTime="";
    @Column(name = "attend_user_id", length = 255)
    private String attendUserId="", attendUserNamet="";
    @Column(name = "ma_description", length = 255)
    private String maDescription="";
    @Column(name = "ma_remark", length = 255)
    private String maRemark="";
    @Column(name = "ma_date", length = 255)
    private String maDate="";
    @Column(name = "ma_time", length = 255)
    private String maTime="";
    @Column(name = "ma_user_id", length = 255)
    private String maUserId="", maUserNamet="";
    @Column(name = "attend_department_id", length = 255)
    private String attendDepartmentId="", attendDepartmentNamet="";
    @Column(name = "maintain_id", length = 255)
    private String maintainId="", maintainNamet="";
    @Column(name = "active", length = 255)
    private String active="";
    @Column(name = "date_create", length = 255)
    private String dateCreate;
    @Column(name = "date_modify", length = 255)
    private String dateModify;
    @Column(name = "date_cancel", length = 255)
    private String dateCancel;
    @Column(name = "user_id_create", length = 255)
    private String userIdCreate="";
    @Column(name = "user_id_modify", length = 255)
    private String userIdModify="";
    @Column(name = "user_id_cancel", length = 255)
    private String userIdCancel="";
    @Column(name = "remark_cancel", length = 255)
    private String remarkCancel="";
    @Column(name = "status", length = 255)
    private String status="";
    @Column(name = "ma_department_id", length = 255)
    private String maDepartmentId="", maDepartmentNamet="";
    @Column(name = "serial_no", length = 255)
    private String serialNo="";
    @Column(name = "service_tab", length = 255)
    private String serviceTab="";
    @Column(name = "brand_id", length = 255)
    private String brandId="", brandNamet="";
    @Column(name = "type_device_id", length = 255)
    private String typeDeviceId="", typeDeviceNamet="";
    @Column(name = "symptoms", length = 255)
    private String symptoms="";
    @Column(name = "repair_status", length = 255)
    private String repairStatus="";
    @Column(name = "model", length = 255)
    private String model="";
    @Column(name = "vendor_id", length = 255)
    private String vendorId="", vendorNamet="";
    @Column(name = "price_repair", precision = 17, scale = 17)
    private Double priceRepair=0.0;
    @Column(name = "vendor_remark", length = 255)
    private String vendorRemark="";
    @Column(name = "status_warranty", length = 255)
    private String statusWarranty="";
    @Column(name = "branch_id", length = 255)
    private String branchId="", branchNamet="";
    @Column(name = "romote_ip_user_create", length = 255)
    private String remoteIpUserCreate="";
    @Column(name = "show_screen", length = 255)
    private String showScreen="1";
    @Column(name = "status_repair", length = 255)
    private String statusRepair="";
    @Column(name = "problems_id", length = 255)
    private String problemsId="";
    @Column(name = "stringency", length = 255)
    private String stringency="";
    @Column(name = "attend_department_telephone", length = 255)
    private String attendDepartmentTelephone="";
    @Column(name = "status_it", length = 255)
    private String statusIt="";

    public NotiTNotiRepair() {
    }
    public String NotiTNotiRepair() {
        return "noti_t_noti_repair";
    }
    public String NotoRepairId(){
        return "noti_repair_id";
    }
    public String AttendDescription(){
        return "attend_description";
    }
    public String AttendRemark(){
        return "attend_remark";
    }
    public String AttendDate(){
        return "attend_date";
    }
    public String AttendTime(){
        return "Attend_time";
    }
    public String AttendUserId(){
        return "attend_user_id";
    }
    public String MaDescription(){
        return "ma_description";
    }
    public String MaRemark(){
        return "ma_remark";
    }
    public String MaDate(){
        return "ma_date";
    }
    public String MaTime(){
        return "ma_time";
    }
    public String MaUserId(){
        return "ma_user_id";
    }
    public String AttendDepartmentId(){
        return "attend_department_id";
    }
    public String MaDepartmentId(){
        return "ma_department_id";
    }
    public String MaintainId(){
        return "maintain_id";
    }
    public String Active(){
        return "active";
    }
    public String DateCreate(){
        return "date_create";
    }
    public String DateModify(){
        return "date_modify";
    }
    public String DateCancel(){
        return "date_cancel";
    }
    public String UserIdCreate(){
        return "user_id_create";
    }
    public String UserIdModify(){
        return "user_id_modify";
    }
    public String UserIdcancel(){
        return "user_id_cancel";
    }
    public String RemarkCancel(){
        return "remark_cancel";
    }
    public String Status(){
        return "status";
    }
    public String SerialNo(){
        return "serial_no";
    }
    public String ServiceTab(){
        return "service_tab";
    }
    public String BrandId(){
        return "brand_id";
    }
    public String TypeDeviceId(){
        return "type_device_id";
    }
    public String Symptoms(){
        return "symptoms";
    }
    public String RepairStatus(){
        return "repair_status";
    }
    public String Model(){
        return "model";
    }
    public String VendorId(){
        return "vendor_id";
    }
    public String PriceRepair(){
        return "price_repair";
    }
    public String VendorRemark(){
        return "vendor_remark";
    }
    public String StatusWarranty(){
        return "status_warranty";
    }
    public String BranchId(){
        return "branch_id";
    }
    public String RemoteIpUserCreate(){
        return "remote_ip_user_create";
    }
    public String ShowScreen(){
        return "show_screen";
    }
    public String StatusRepair(){
        return "status_repair";
    }public String ProblemsId(){
        return "problems_id";
    }
    public String Stringency(){
        return "stringency";
    }
    public String StatusIt(){
        return "status_it";
    }
    
    public NotiTNotiRepair(String notiRepairId) {
        this.notiRepairId = notiRepairId;
    }

    public String getNotiRepairId() {
        return notiRepairId;
    }

    public void setNotiRepairId(String notiRepairId) {
        this.notiRepairId = notiRepairId;
        notiRepairPictureRepairFilename="/var/www/intranet/picture/"+notiRepairId+"_repair.jpg";
        notiRepairPictureRepairFilenameShow="/var/www/intranet/picture/"+notiRepairId+"_repair.jpg";
        notiRepairPictureQuotationFilename="/var/www/intranet/picture/"+notiRepairId+"_quotation.jpg";
        notiRepairPictureQuotationFilenameShow="/var/www/intranet/picture/"+notiRepairId+"_quotation.jpg";
    }

    public String getAttendDescription() {
        return attendDescription;
    }
    public void setAttendDescription(String attendDescription) {
        this.attendDescription = attendDescription;
    }

    public String getAttendRemark() {
        return attendRemark;
    }

    public void setAttendRemark(String attendRemark) {
        this.attendRemark = attendRemark;
    }

    public String getAttendDate() {
        return attendDate;
    }
    public String getAttendDateddMMyy(String format) {
        String txt="";
        try {
            txt= config1.DateFormatDB2Show(attendDate, format);
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return txt;
    }

    public void setAttendDate(String attendDate) {
        this.attendDate = attendDate;
    }    
    public String getAttendTime() {
        return attendTime;
    }

    public void setAttendTime(String attendTime) {
        this.attendTime = attendTime;
    }

    public String getAttendUserId() {
        return attendUserId;
    }
    public void setAttendUserId(String attendUserId) {
        this.attendUserId = attendUserId;
    }
    public String getAttendUserNamet() {
        return attendUserNamet;
    }
    public void setAttendUserNamet(String attendUserNamet) {
        this.attendUserNamet = attendUserNamet;
    }

    public String getMaDescription() {
        return maDescription;
    }

    public void setMaDescription(String maDescription) {
        this.maDescription = maDescription;
    }

    public String getMaRemark() {
        return maRemark;
    }

    public void setMaRemark(String maRemark) {
        this.maRemark = maRemark;
    }

    public String getMaDate() {
        return maDate;
    }
    public String getMaDateddMMyy(String format) {
        String txt="";
        try {
            txt= config1.DateFormatDB2Show(maDate, format);
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return txt;
    }
    public void setMaDate(String maDate) {
        this.maDate = maDate;
    }

    public String getMaTime() {
        return maTime;
    }

    public void setMaTime(String maTime) {
        this.maTime = maTime;
    }

    public String getMaUserId() {
        return maUserId;
    }
    public void setMaUserId(String maUserId) {
        this.maUserId = maUserId;
    }
    public String getMaUserNamet() {
        return maUserNamet;
    }
    public void setMaUserNamet(String maUserNamet) {
        this.maUserNamet = maUserNamet;
    }

    public String getAttendDepartmentId() {
        return attendDepartmentId;
    }
    public void setAttendDepartmentId(String attendDepartmentId) {
        this.attendDepartmentId = attendDepartmentId;
    }
    public String getAttendDepartmentNamet() {
        return attendDepartmentNamet;
    }
    public void setAttendDepartmentNamet(String attendDepartmentNamet) {
        this.attendDepartmentNamet = attendDepartmentNamet;
    }

    public String getMaintainId() {
        return maintainId;
    }
    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId;
    }
    public String getMaintainNamet() {
        return maintainNamet;
    }
    public void setMaintainNamet(String maintainNamet) {
        this.maintainNamet = maintainNamet;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        if((active == null) || (active.equals(""))){
            active = "1";
        }
        this.active = active;
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

    public String getRemarkCancel() {
        return remarkCancel;
    }

    public void setRemarkCancel(String remarkCancel) {
        this.remarkCancel = remarkCancel;
    }

    public String getStatus() {        
        return status;
    }
    public String getStatusNamet() {
        String statusnamet="";
        if(status.equals("1")){
            statusnamet = "แจ้งซ่อม";
            }
        else if(status.equals("2")){
            statusnamet = "เริ่มซ่อม";
            }
        else if(status.equals("3")){
            statusnamet = "ยกเลิก";
            }
        else if(status.equals("4")){
            statusnamet = "ใกล้เสร็จ";
            }
        else if(status.equals("5")){
            statusnamet = "เรียบร้อย";
            }
        else {
            statusnamet = "Roll Outออกจากหน้าจอ";
            }
        return statusnamet;
    }
    public void setStatus(String status) {
        if(status.equals("")){
            status="1";
        }
        this.status = status;
    }

    public String getMaDepartmentId() {
        return maDepartmentId;
    }
    public void setMaDepartmentId(String maDepartmentId) {
        this.maDepartmentId = maDepartmentId;
    }
    public String getMaDepartmentNamet() {
        return maDepartmentNamet;
    }
    public void setMaDepartmentNamet(String maDepartmentNamet) {
        this.maDepartmentNamet = maDepartmentNamet;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getServiceTab() {
        return serviceTab;
    }

    public void setServiceTab(String serviceTab) {
        this.serviceTab = serviceTab;
    }

    public String getBrandId() {
        return brandId;
    }
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
    public String getBrandNamet() {
        return brandNamet;
    }
    public void setBrandNamet(String brandNamet) {
        this.brandNamet = brandNamet;
    }

    public String getTypeDeviceId() {
        return typeDeviceId;
    }
    public void setTypeDeviceId(String typeDeviceId) {
        this.typeDeviceId = typeDeviceId;
    }
    public String getTypeDeviceNamet() {
        return typeDeviceNamet;
    }
    public void setTypeDeviceNamet(String typeDeviceNamet) {
        this.typeDeviceNamet = typeDeviceNamet;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorNamet() {
        return vendorNamet;
    }
    public void setVendorNamet(String vendorNamet) {
        this.vendorNamet = vendorNamet;
    }

    public Double getPriceRepair() {
        return priceRepair;
    }

    public void setPriceRepair(Double priceRepair) {
        this.priceRepair = priceRepair;
    }

    public String getVendorRemark() {
        return vendorRemark;
    }

    public void setVendorRemark(String vendorRemark) {
        this.vendorRemark = vendorRemark;
    }

    public String getStatusWarranty() {
        return statusWarranty;
    }

    public void setStatusWarranty(String statusWarranty) {
        this.statusWarranty = statusWarranty;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
    public String getBranchNamet() {
        return branchNamet;
    }
    public void setBranchNamet(String branchNamet) {
        this.branchNamet = branchNamet;
    }
    public String getRemoteIpUserCreate() {
        return remoteIpUserCreate;
    }
    public void setRemoteIpUserCreate(String remoteipusercreate) {
        this.remoteIpUserCreate = remoteipusercreate;
    }
    public String getShowScreen() {
        return showScreen;
    }
    public void setShowScreen(String showscreen) {
        this.showScreen = showscreen;
    }
    public String getStatusRepair() {
        return statusRepair;
    }
    public void setStatusRepair(String statusrepair) {
        this.statusRepair = statusrepair;
    }
    public String getNotiRepairPictureRepairFileName() {
        //String filename = "../../Data/UpLoad/"+notiRepairId+".jpg";
        //return notiRepairPictureRepairFilename;
        return notiRepairPictureRepairFilenameShow;
    }
    public String getNotiRepairPictureQuotationFileName() {
        //String filename = "../../Data/UpLoad/"+notiRepairId+".jpg";
        //return notiRepairPictureRepairFilename;
        return notiRepairPictureQuotationFilenameShow;
    }
    public Boolean getNotiRepairPictureRepairExists() {
        boolean exists = (new File(notiRepairPictureRepairFilename)).exists();
        if (exists) {
            // File or directory exists
            //boolean success = (new File(notiRepairPictureRepairFilename)).delete();
        } else {
            // File or directory does not exist
        }
        return exists;
    }
    public Boolean getNotiRepairPictureQuotationExists() {
        boolean exists = (new File(notiRepairPictureQuotationFilename)).exists();
        if (exists) {
            // File or directory exists
            //boolean success = (new File(notiRepairPictureRepairFilename)).delete();
        } else {
            // File or directory does not exist
        }
        return exists;
    }
    public Boolean setNotiRepairPictureRepairDelete() {
        boolean exists = (new File(notiRepairPictureRepairFilename)).exists();
        boolean success = false;
        if (exists) {
            // File or directory exists
            success = (new File(notiRepairPictureRepairFilename)).delete();
        } else {
            success = true;
        }
        return success;
    }
    public Boolean setNotiRepairPictureQuotationDelete() {
        boolean exists = (new File(notiRepairPictureQuotationFilename)).exists();
        boolean success = false;
        if (exists) {
            // File or directory exists
            success = (new File(notiRepairPictureQuotationFilename)).delete();
        } else {
            success = true;
        }
        return success;
    }
    public String getProblemsId() {
        return problemsId;
    }
    public void setProblemsId(String problemsId) {
        this.problemsId = problemsId;
    }
    public String getStringency() {
        return stringency;
    }
    public String getStringencyNamet() {
        String stringencynamet="";
        if(stringency.equals("1")){
            stringencynamet="ปกติ ตามคิว";
        }
        else if(stringency.equals("2")){
            stringencynamet="ด่วน";
        }
        else if(stringency.equals("3")){
            stringencynamet="ด่วนมาก";
        }
        else if(stringency.equals("4")){
            stringencynamet="ด่วนที่สุด";
        }
        else if(stringency.equals("5")){
            stringencynamet="ทันที";
        }
        return stringencynamet;
    }
    public void setStringency(String stringency) {
        this.stringency = stringency;
    }
    public String getAttendDepartmentTelephone() {
        return attendDepartmentTelephone.trim();
    }
    public void setAttendDepartmentTelephone(String attendDepartmentTelephone) {
        this.attendDepartmentTelephone = attendDepartmentTelephone;
    }
    public String getStatusIt() {
        return statusIt;
    }
    public void setStatusIt(String statusIt) {
        this.statusIt = statusIt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notiRepairId != null ? notiRepairId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotiTNotiRepair)) {
            return false;
        }
        NotiTNotiRepair other = (NotiTNotiRepair) object;
        if ((this.notiRepairId == null && other.notiRepairId != null) || (this.notiRepairId != null && !this.notiRepairId.equals(other.notiRepairId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NotiTNotiRepair[notiRepairId=" + notiRepairId + "]";
    }

}
