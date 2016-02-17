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
@Table(name = "noti_b_vendor")
@NamedQueries({@NamedQuery(name = "NotiBVendor.findAll", query = "SELECT n FROM NotiBVendor n"), @NamedQuery(name = "NotiBVendor.findByVenderId", query = "SELECT n FROM NotiBVendor n WHERE n.venderId = :venderId"), @NamedQuery(name = "NotiBVendor.findByVendorNamet", query = "SELECT n FROM NotiBVendor n WHERE n.vendorNamet = :vendorNamet"), @NamedQuery(name = "NotiBVendor.findByActive", query = "SELECT n FROM NotiBVendor n WHERE n.active = :active")})
public class NotiBVendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vender_id")
    private String venderId;
    @Column(name = "vendor_namet")
    private String vendorNamet;
    @Column(name = "active")
    private String active;
    @Column(name = "tax_id")
    private String taxId;
    @Column(name = "sale_full_namet")
    private String saleFullNamet;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "sale_mobile")
    private String saleMobile;

    public NotiBVendor() {
    }
    public String getNotiBVendor(){
        return "noti_b_vendor";
    }
    public String getFVendorId(){
        return "vendor_id";
    }
    public String getFVendorNamet(){
        return "vendor_namet";
    }
    public String getFVendorActive(){
        return "active";
    }
    public String getFTaxId(){
        return "tax_id";
    }
    public String getFSaleFullNamet(){
        return "sale_full_namet";
    }
    public String getFTelephone(){
        return "telephone";
    }
    public String getFMobile(){
        return "mobile";
    }
    public String getFSaleMobile(){
        return "sale_mobile";
    }

    public NotiBVendor(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVendorNamet() {
        return vendorNamet;
    }
    public void setVendorNamet(String vendorNamet) {
        this.vendorNamet = vendorNamet;
    }

    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }

    public String getTaxId() {
        return taxId;
    }
    public void setTaxId(String taxid) {
        this.taxId = taxid;
    }
    
    public String getSaleFullNamet() {
        return saleFullNamet;
    }
    public void setSaleFullNamet(String salefullnamet) {
        this.saleFullNamet = salefullnamet;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getSaleMobile() {
        return saleMobile;
    }
    public void setSaleMobile(String salemobile) {
        this.saleMobile = salemobile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venderId != null ? venderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotiBVendor)) {
            return false;
        }
        NotiBVendor other = (NotiBVendor) object;
        if ((this.venderId == null && other.venderId != null) || (this.venderId != null && !this.venderId.equals(other.venderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NotiBVendor[venderId=" + venderId + "]";
    }

}
