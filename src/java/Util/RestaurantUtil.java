/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DAO.RestaurantDAO;
import Entity.Item;
import java.util.*;

/**
 *
 * @author Tom
 */
public class RestaurantUtil {
    
    public static List<Item> getMenu(int restID) {
        List<Item> menu = new ArrayList();
        RestaurantDAO dao = new RestaurantDAO();
        menu =dao.getMenu(restID);
        
        
        
        return menu;
    }
    
}
