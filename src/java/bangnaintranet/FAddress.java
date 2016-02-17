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
@Table(name = "f_address", catalog = "hospital_osv3", schema = "public")
@NamedQueries({@NamedQuery(name = "FAddress.findAll", query = "SELECT f FROM FAddress f"), @NamedQuery(name = "FAddress.findByFAddressId", query = "SELECT f FROM FAddress f WHERE f.fAddressId = :fAddressId"), @NamedQuery(name = "FAddress.findByAddressDescription", query = "SELECT f FROM FAddress f WHERE f.addressDescription = :addressDescription"), @NamedQuery(name = "FAddress.findByAddressTambonType", query = "SELECT f FROM FAddress f WHERE f.addressTambonType = :addressTambonType"), @NamedQuery(name = "FAddress.findByAddressAmphurId", query = "SELECT f FROM FAddress f WHERE f.addressAmphurId = :addressAmphurId"), @NamedQuery(name = "FAddress.findByAddressChangwatId", query = "SELECT f FROM FAddress f WHERE f.addressChangwatId = :addressChangwatId"), @NamedQuery(name = "FAddress.findByAddressRegion", query = "SELECT f FROM FAddress f WHERE f.addressRegion = :addressRegion")})
public class FAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "f_address_id", nullable = false, length = 255)
    private String fAddressId="";
    @Column(name = "address_description", length = 255)
    private String addressDescription="";
    @Column(name = "address_tambon_type", length = 255)
    private String addressTambonType="";
    @Column(name = "address_amphur_id", length = 255)
    private String addressAmphurId="";
    @Column(name = "address_changwat_id", length = 255)
    private String addressChangwatId="";
    @Column(name = "address_region", length = 255)
    private String addressRegion="";
    @Column(name = "address_descriptione", length = 255)
    private String addressDescriptione="";

    public FAddress() {
    }
    public String getFAddress() {
        return "f_address";
    }
    public String getFFAddressId() {
        return "f_address_id";
    }
    public String getFAddressDescription() {
        return "address_description";
    }
    public String getFAddressTambonType() {
        return "address_tambon_type";
    }
    public String getFAddressAmphurId() {
        return "address_amphur_id";
    }
    public String getFAddressChangwatId() {
        return "address_changwat_id";
    }
    public String getFAddressRegion() {
        return "address_region";
    }
    public String getFAddressDescriptione() {
        return "address_descriptione";
    }

    public FAddress(String fAddressId) {
        this.fAddressId = fAddressId;
    }

    public String getFAddressId() {
        return fAddressId;
    }

    public void setFAddressId(String fAddressId) {
        this.fAddressId = fAddressId;
    }

    public String getAddressDescription() {
        return addressDescription;
    }
    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public String getAddressTambonType() {
        return addressTambonType;
    }

    public void setAddressTambonType(String addressTambonType) {
        this.addressTambonType = addressTambonType;
    }

    public String getAddressAmphurId() {
        return addressAmphurId;
    }

    public void setAddressAmphurId(String addressAmphurId) {
        this.addressAmphurId = addressAmphurId;
    }

    public String getAddressChangwatId() {
        return addressChangwatId;
    }
    public void setAddressChangwatId(String addressChangwatId) {
        this.addressChangwatId = addressChangwatId;
    }

    public String getAddressRegion() {
        return addressRegion;
    }
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressDescriptione() {
        return addressDescriptione;
    }
    public void setAddressDescriptione(String addressDescriptione) {
        this.addressDescriptione = addressDescriptione;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fAddressId != null ? fAddressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FAddress)) {
            return false;
        }
        FAddress other = (FAddress) object;
        if ((this.fAddressId == null && other.fAddressId != null) || (this.fAddressId != null && !this.fAddressId.equals(other.fAddressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.FAddress[fAddressId=" + fAddressId + "]";
    }

}
