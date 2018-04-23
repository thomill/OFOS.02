/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Entity.CustomerOrder;
import Entity.Item;
import Entity.OrderItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tom
 */
public class CartUtil {
    
    private CustomerOrder cart = new CustomerOrder();
    
    public void addToCart(OrderItem item) {
        cart.addItem(item);
    }
    
    public void removeFromCart(OrderItem item) {
        cart.removeItem(item);
    }
    
    public void clearCart() {
        cart.clearOrder();
    }
    
}
