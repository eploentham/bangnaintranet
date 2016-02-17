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
@Table(name = "b_asset", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BAsset.findAll", query = "SELECT b FROM BAsset b"), @NamedQuery(name = "BAsset.findByAssetId", query = "SELECT b FROM BAsset b WHERE b.assetId = :assetId"), @NamedQuery(name = "BAsset.findByAssetNamet", query = "SELECT b FROM BAsset b WHERE b.assetNamet = :assetNamet"), @NamedQuery(name = "BAsset.findByAssetActive", query = "SELECT b FROM BAsset b WHERE b.assetActive = :assetActive"), @NamedQuery(name = "BAsset.findByAssetStatus", query = "SELECT b FROM BAsset b WHERE b.assetStatus = :assetStatus"), @NamedQuery(name = "BAsset.findByBrandId", query = "SELECT b FROM BAsset b WHERE b.brandId = :brandId"), @NamedQuery(name = "BAsset.findByTypeDeviceId", query = "SELECT b FROM BAsset b WHERE b.typeDeviceId = :typeDeviceId"), @NamedQuery(name = "BAsset.findByDepartmentId", query = "SELECT b FROM BAsset b WHERE b.departmentId = :departmentId"), @NamedQuery(name = "BAsset.findByBranchId", query = "SELECT b FROM BAsset b WHERE b.branchId = :branchId"), @NamedQuery(name = "BAsset.findByVendorId", query = "SELECT b FROM BAsset b WHERE b.vendorId = :vendorId")})
public class BAsset implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "asset_id", nullable = false, length = 255)
    private String assetId="";
    @Column(name = "asset_namet", length = 255)
    private String assetNamet="";
    @Column(name = "asset_active", length = 255)
    private String assetActive="";
    @Column(name = "asset_status", length = 255)
    private String assetStatus="";
    @Column(name = "brand_id", length = 255)
    private String brandId="", brandNamet="";
    @Column(name = "type_device_id", length = 255)
    private String typeDeviceId="", typeDeviceNamet="";
    @Column(name = "department_id", length = 255)
    private String departmentId="", departmentNamet;
    @Column(name = "branch_id", length = 255)
    private String branchId="", branchNamet="";
    @Column(name = "vendor_id", length = 255)
    private String vendorId="", vendorNamet="";
    @Column(name = "date_buy", length = 255)
    private String dateBuy="";
    @Column(name = "warranty", length = 255)
    private String warranty="";
    @Column(name = "serial_no", length = 255)
    private String serialNo="";
    @Column(name = "service_tab", length = 255)
    private String serviceTab="";
    @Column(name = "price", length = 255)
    private Double price=0.0;
    @Column(name = "model", length = 255)
    private String model="";
    @Column(name = "remark", length = 255)
    private String remark="";
    @Column(name = "warranty_status", length = 255)
    private String warrantyStatus="";
    @Column(name = "description1", length = 255)
    private String description1="";
    @Column(name = "description2", length = 255)
    private String description2="";
    @Column(name = "description3", length = 255)
    private String description3="";
    @Column(name = "description4", length = 255)
    private String description4="";
    @Column(name = "description5", length = 255)
    private String description5="";

    public BAsset() {
    }
    public String getBAsset(){
        return "b_asset";
    }
    public String getFAssetId() {
        return "asset_id";
    }
    public String getFAssetNamet() {
        return "asset_namet";
    }
    public String getFAssetActive() {
        return "asset_active";
    }
    public String getFAssetStatus() {
        return "asset_status";
    }
    public String getFBrandId() {
        return "brand_id";
    }
    public String getFTypeDeviceId() {
        return "type_device_id";
    }
    public String getFDepartmentId() {
        return "department_id";
    }
    public String getFBranchId() {
        return "branch_id";
    }
    public String getFVendorId() {
        return "vendor_id";
    }
    public String getFDateBuy() {
        return "date_buy";
    }
    public String getFWarranty() {
        return "warranty";
    }
    public String getFSerialNo() {
        return "serial_no";
    }
    public String getFServiceTab() {
        return "service_tab";
    }
    public String getFPrice() {
        return "price";
    }
    public String getFModel() {
        return "model";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFWarantyStatus() {
        return "warranty_status";
    }
    public String getFDescription1() {
        return "description1";
    }
    public String getFDescription2() {
        return "description2";
    }
    public String getFDescription3() {
        return "description3";
    }
    public String getFDescription4() {
        return "description4";
    }
    public String getFDescription5() {
        return "description5";
    }

    public BAsset(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetNamet() {
        return assetNamet;
    }

    public void setAssetNamet(String assetNamet) {
        this.assetNamet = assetNamet;
    }

    public String getAssetActive() {
        return assetActive;
    }

    public void setAssetActive(String assetActive) {
        this.assetActive = assetActive;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public String getBrandId() {
        return brandId;
    }
    public String getBrandNameT() {
        return brandNamet;
    }
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
    public void setBrandNamet(String brandNamet) {
        this.brandNamet = brandNamet;
    }

    public String getTypeDeviceId() {
        return typeDeviceId;
    }
    public String getTypeDeviceNamet() {
        return typeDeviceNamet;
    }
    public void setTypeDeviceId(String typeDeviceId) {
        this.typeDeviceId = typeDeviceId;
    }
    public void setTypeDeviceNamet(String typeDeviceNamet) {
        this.typeDeviceNamet = typeDeviceNamet;
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
    public String getBranchNamet() {
        return branchNamet;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
    public void setBranchNamet(String branchNamet) {
        this.branchNamet = branchNamet;
    }

    public String getVendorId() {
        return vendorId;
    }
    public String getVendorNamet() {
        return vendorNamet;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public void setVendorNamet(String vendorNamet) {
        this.vendorNamet = vendorNamet;
    }

    public String getDateBuy() {
        return dateBuy;
    }
    public void setDateBuy(String date_buy) {
        this.dateBuy = date_buy;
    }
    public String getWarranty() {
        return warranty;
    }
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialno) {
        this.serialNo = serialno;
    }

    public String getServiceTab() {
        return serviceTab;
    }
    public void setServiceTab(String serviceTab) {
        this.serviceTab = serviceTab;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWarrantyStatus() {
        return warrantyStatus;
    }
    public void setWarrantyStatus(String warrantystatus) {
        this.warrantyStatus = warrantystatus;
    }

    public String geDescription1() {
        return description1;
    }
    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String geDescription2() {
        return description2;
    }
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String geDescription3() {
        return description3;
    }
    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String geDescription4() {
        return description4;
    }
    public void setDescription4(String description4) {
        this.description4= description4;
    }
    public String geDescription5() {
        return description5;
    }
    public void setDescription5(String description5) {
        this.description5 = description5;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assetId != null ? assetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BAsset)) {
            return false;
        }
        BAsset other = (BAsset) object;
        if ((this.assetId == null && other.assetId != null) || (this.assetId != null && !this.assetId.equals(other.assetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BAsset[assetId=" + assetId + "]";
    }

}
