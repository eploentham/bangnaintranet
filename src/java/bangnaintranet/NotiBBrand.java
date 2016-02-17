package bangnaintranet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



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
@Table(name = "noti_b_brand")
@NamedQueries({@NamedQuery(name = "NotiBBrand.findAll", query = "SELECT n FROM NotiBBrand n"), @NamedQuery(name = "NotiBBrand.findByBrandId", query = "SELECT n FROM NotiBBrand n WHERE n.brandId = :brandId"), @NamedQuery(name = "NotiBBrand.findByBrandNamet", query = "SELECT n FROM NotiBBrand n WHERE n.brandNamet = :brandNamet"), @NamedQuery(name = "NotiBBrand.findByActive", query = "SELECT n FROM NotiBBrand n WHERE n.active = :active")})
public class NotiBBrand implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "brand_id")
    private String brandId;
    @Column(name = "brand_namet")
    private String brandNamet;
    @Column(name = "active")
    private String active;

    public NotiBBrand() {
    }
    public String NotiBBrand(){
        return "noti_b_brand";
    }
    public String BrandId(){
        return "brand_id";
    }
    public String BrandNamet(){
        return "brand_namet";
    }
    public String BrandActive(){
        return "active";
    }

    public NotiBBrand(String brandId) {
        this.brandId = brandId;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brandId != null ? brandId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotiBBrand)) {
            return false;
        }
        NotiBBrand other = (NotiBBrand) object;
        if ((this.brandId == null && other.brandId != null) || (this.brandId != null && !this.brandId.equals(other.brandId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.NotiBBrand[brandId=" + brandId + "]";
    }

}
