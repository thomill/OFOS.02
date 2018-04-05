/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tom
 */
@Entity
@Table(name = "OrderItem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderItem.findAll", query = "SELECT o FROM OrderItem o")
    , @NamedQuery(name = "OrderItem.findByOrderId", query = "SELECT o FROM OrderItem o WHERE o.orderItemPK.orderId = :orderId")
    , @NamedQuery(name = "OrderItem.findByItemId", query = "SELECT o FROM OrderItem o WHERE o.orderItemPK.itemId = :itemId")
    , @NamedQuery(name = "OrderItem.findByQuantity", query = "SELECT o FROM OrderItem o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "OrderItem.findByCustomization", query = "SELECT o FROM OrderItem o WHERE o.customization = :customization")})
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemPK orderItemPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Size(max = 10)
    @Column(name = "customization")
    private String customization;
    @JoinColumn(name = "orderId", referencedColumnName = "orderId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustomerOrder customerOrder;
    @JoinColumn(name = "itemId", referencedColumnName = "itemId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Item item;

    public OrderItem() {
    }

    public OrderItem(OrderItemPK orderItemPK) {
        this.orderItemPK = orderItemPK;
    }

    public OrderItem(OrderItemPK orderItemPK, int quantity) {
        this.orderItemPK = orderItemPK;
        this.quantity = quantity;
    }

    public OrderItem(int orderId, int itemId) {
        this.orderItemPK = new OrderItemPK(orderId, itemId);
    }

    public OrderItemPK getOrderItemPK() {
        return orderItemPK;
    }

    public void setOrderItemPK(OrderItemPK orderItemPK) {
        this.orderItemPK = orderItemPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemPK != null ? orderItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItem)) {
            return false;
        }
        OrderItem other = (OrderItem) object;
        if ((this.orderItemPK == null && other.orderItemPK != null) || (this.orderItemPK != null && !this.orderItemPK.equals(other.orderItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.OrderItem[ orderItemPK=" + orderItemPK + " ]";
    }
    
}
