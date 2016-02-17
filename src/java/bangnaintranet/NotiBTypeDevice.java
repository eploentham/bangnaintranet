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
@Table(name = "noti_b_type_device")
@NamedQueries({@NamedQuery(name = "NotiBTypeDevice.findAll", query = "SELECT n FROM NotiBTypeDevice n"), @NamedQuery(name = "NotiBTypeDevice.findByTypeDeviceId", query = "SELECT n FROM NotiBTypeDevice n WHERE n.typeDeviceId = :typeDeviceId"), @NamedQuery(name = "NotiBTypeDevice.findByTypeDeviceNamet", query = "SELECT n FROM NotiBTypeDevice n WHERE n.typeDeviceNamet = :typeDeviceNamet"), @NamedQuery(name = "NotiBTypeDevice.findByActive", query = "SELECT n FROM NotiBTypeDevice n WHERE n.active = :active")})
public class NotiBTypeDevice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "type_device_id")
    private String typeDeviceId;
    @Column(name = "type_device_namet")
    private String typeDeviceNamet;
    @Column(name = "active")
    private String active;
    @Column(name = "asset_status")
    private String assetStatus;

    public NotiBTypeDevice() {
    }
    public String NotiBTypeDevice(){
        return "noti_b_type_device";
    }
    public String getFTypeDeviceId(){
        return "type_device_id";
    }
    public String getFTypeDeviceNamet(){
        return "type_device_namet";
    }
    public String getFTypeDeviceActive(){
        return "active";
    }
    public String getFAssetStatus(){
        return "asset_status";
    }

    public NotiBTypeDevice(String typeDeviceId) {
        this.typeDeviceId = typeDeviceId;
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

    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }

    public String getAssetStatus() {
        return assetStatus;
    }
    public void setAssetStatus(String assetstatus) {
        this.assetStatus = assetstatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeDeviceId != null ? typeDeviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotiBTypeDevice)) {
            return false;
        }
        NotiBTypeDevice other = (NotiBTypeDevice) object;
        if ((this.typeDeviceId == null && other.typeDeviceId != null) || (this.typeDeviceId != null && !this.typeDeviceId.equals(other.typeDeviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NotiBTypeDevice[typeDeviceId=" + typeDeviceId + "]";
    }

}
