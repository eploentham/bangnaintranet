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
@Table(name = "b_text", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BText.findAll", query = "SELECT b FROM BText b"), @NamedQuery(name = "BText.findByTextId", query = "SELECT b FROM BText b WHERE b.textId = :textId"), @NamedQuery(name = "BText.findByKeyWord", query = "SELECT b FROM BText b WHERE b.keyWord = :keyWord"), @NamedQuery(name = "BText.findByDescription", query = "SELECT b FROM BText b WHERE b.description = :description"), @NamedQuery(name = "BText.findById", query = "SELECT b FROM BText b WHERE b.id = :id")})
public class BText implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "text_id", nullable = false)
    private Integer textId=0;
    @Column(name = "key_word", length = 255)
    private String keyWord="";
    @Column(name = "description", length = 255)
    private String description="";
    @Column(name = "id", length = 255)
    private String id;

    public BText() {
    }

    public BText(Integer textId) {
        this.textId = textId;
    }

    public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (textId != null ? textId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BText)) {
            return false;
        }
        BText other = (BText) object;
        if ((this.textId == null && other.textId != null) || (this.textId != null && !this.textId.equals(other.textId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BText[textId=" + textId + "]";
    }

}
