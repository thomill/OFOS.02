/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tom
 */
@Entity
@Table(name = "CustomerOrder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerOrder.findAll", query = "SELECT c FROM CustomerOrder c")
    , @NamedQuery(name = "CustomerOrder.findByOrderId", query = "SELECT c FROM CustomerOrder c WHERE c.orderId = :orderId")
    , @NamedQuery(name = "CustomerOrder.findByOrderDate", query = "SELECT c FROM CustomerOrder c WHERE c.orderDate = :orderDate")
    , @NamedQuery(name = "CustomerOrder.findByTotalCharge", query = "SELECT c FROM CustomerOrder c WHERE c.totalCharge = :totalCharge")})
public class CustomerOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "orderId")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalCharge")
    private BigDecimal totalCharge;
    @JoinColumn(name = "custId", referencedColumnName = "custId")
    @ManyToOne(optional = false)
    private Customer custId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerOrder")
    private Collection<OrderItem> orderItemCollection;

    public CustomerOrder() {
    }

    public CustomerOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public CustomerOrder(Integer orderId, Date orderDate, BigDecimal totalCharge) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalCharge = totalCharge;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(BigDecimal totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Customer getCustId() {
        return custId;
    }

    public void setCustId(Customer custId) {
        this.custId = custId;
    }

    @XmlTransient
    public Collection<OrderItem> getOrderItemCollection() {
        return orderItemCollection;
    }

    public void setOrderItemCollection(Collection<OrderItem> orderItemCollection) {
        this.orderItemCollection = orderItemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerOrder)) {
            return false;
        }
        CustomerOrder other = (CustomerOrder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.CustomerOrder[ orderId=" + orderId + " ]";
    }
    
}
