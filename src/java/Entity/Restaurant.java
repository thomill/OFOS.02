/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tom
 */
@Entity
@Table(name = "Restaurant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restaurant.findAll", query = "SELECT r FROM Restaurant r")
    , @NamedQuery(name = "Restaurant.findByRestId", query = "SELECT r FROM Restaurant r WHERE r.restId = :restId")
    , @NamedQuery(name = "Restaurant.findByName", query = "SELECT r FROM Restaurant r WHERE r.name = :name")
    , @NamedQuery(name = "Restaurant.findByStreet", query = "SELECT r FROM Restaurant r WHERE r.street = :street")
    , @NamedQuery(name = "Restaurant.findByStateLoc", query = "SELECT r FROM Restaurant r WHERE r.stateLoc = :stateLoc")
    , @NamedQuery(name = "Restaurant.findByZip", query = "SELECT r FROM Restaurant r WHERE r.zip = :zip")
    , @NamedQuery(name = "Restaurant.findByPhone", query = "SELECT r FROM Restaurant r WHERE r.phone = :phone")
    , @NamedQuery(name = "Restaurant.findByMinimumOrder", query = "SELECT r FROM Restaurant r WHERE r.minimumOrder = :minimumOrder")})
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "restId")
    private Integer restId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "stateLoc")
    private String stateLoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zip")
    private int zip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phone")
    private int phone;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "minimumOrder")
    private BigDecimal minimumOrder;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restId")
    private Collection<Item> itemCollection;

    public Restaurant() {
    }

    public Restaurant(Integer restId) {
        this.restId = restId;
    }

    public Restaurant(Integer restId, String name, String street, String stateLoc, int zip, int phone, BigDecimal minimumOrder) {
        this.restId = restId;
        this.name = name;
        this.street = street;
        this.stateLoc = stateLoc;
        this.zip = zip;
        this.phone = phone;
        this.minimumOrder = minimumOrder;
    }

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStateLoc() {
        return stateLoc;
    }

    public void setStateLoc(String stateLoc) {
        this.stateLoc = stateLoc;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public BigDecimal getMinimumOrder() {
        return minimumOrder;
    }

    public void setMinimumOrder(BigDecimal minimumOrder) {
        this.minimumOrder = minimumOrder;
    }

    @XmlTransient
    public Collection<Item> getItemCollection() {
        return itemCollection;
    }

    public void setItemCollection(Collection<Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (restId != null ? restId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.restId == null && other.restId != null) || (this.restId != null && !this.restId.equals(other.restId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Restaurant[ restId=" + restId + " ]";
    }
    
}
