/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet.table;

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
 * @author root
 */
@Entity
@Table(name = "b_item", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BItem.findAll", query = "SELECT b FROM BItem b")})
public class BItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b_item_id", nullable = false, length = 255)
    private String bItemId="";
    @Column(name = "item_namet", length = 255)
    private String itemNamet="";
    @Column(name = "item_active", length = 255)
    private String itemActive="";
    @Column(name = "item_price_cost", precision = 17, scale = 17)
    private Double itemPriceCost=0.0;
    @Column(name = "item_price_sale", precision = 17, scale = 17)
    private Double itemPriceSale=0.0;
    @Column(name = "item_id_old", length = 255)
    private String itemIdOld="";

    public BItem() {
    }
    public String getBItem(){
        return "b_item";
    }
    public String getFBItemId(){
        return "b_item_id";
    }
    public String getFItemNamet(){
        return "item_namet";
    }
    public String getFItemActive(){
        return "item_active";
    }
    public String getFItemPriceCost(){
        return "item_price_cost";
    }
    public String getFItemPriceSale(){
        return "item_price_sale";
    }
    public String getFItemIdOld(){
        return "item_id_old";
    }

    public BItem(String bItemId) {
        this.bItemId = bItemId;
    }

    public String getBItemId() {
        return bItemId;
    }

    public void setBItemId(String bItemId) {
        this.bItemId = bItemId;
    }

    public String getItemNamet() {
        return itemNamet;
    }

    public void setItemNamet(String itemNamet) {
        this.itemNamet = itemNamet;
    }

    public String getItemActive() {
        return itemActive;
    }

    public void setItemActive(String itemActive) {
        this.itemActive = itemActive;
    }

    public Double getItemPriceCost() {
        return itemPriceCost;
    }

    public void setItemPriceCost(Double itemPriceCost) {
        this.itemPriceCost = itemPriceCost;
    }

    public Double getItemPriceSale() {
        return itemPriceSale;
    }

    public void setItemPriceSale(Double itemPriceSale) {
        this.itemPriceSale = itemPriceSale;
    }

    public String getItemIdOld() {
        return itemIdOld;
    }

    public void setItemIdOld(String itemIdOld) {
        this.itemIdOld = itemIdOld;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bItemId != null ? bItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BItem)) {
            return false;
        }
        BItem other = (BItem) object;
        if ((this.bItemId == null && other.bItemId != null) || (this.bItemId != null && !this.bItemId.equals(other.bItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.table.BItem[bItemId=" + bItemId + "]";
    }

}
