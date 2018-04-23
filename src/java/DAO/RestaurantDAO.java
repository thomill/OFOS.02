/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Item;
import Entity.Restaurant;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

/**
 *
 * @author Tom
 */
public class RestaurantDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    List<Restaurant> restaurantList = new ArrayList();

    public List<Restaurant> getRestaurantList() {

        //connect to DB
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RestaurantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OFOS",
                    "root", "root");

            // query DB
            Statement st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Restaurant");

            // add query results to list
            while (rs.next()) {
                Restaurant restaurant = new Restaurant();
                restaurant.setRestId((Integer) rs.getInt("restID"));
                restaurant.setName(rs.getString("name"));
                restaurant.setStreet(rs.getString("street"));
                restaurant.setCity(rs.getString("city"));
                restaurant.setStateLoc(rs.getString("stateLoc"));
                restaurant.setZip(rs.getInt("zip"));
                restaurant.setPhone(rs.getString("phone"));
                restaurantList.add(restaurant);
            }
            return restaurantList;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return restaurantList;
    }

    public List<Item> getMenu(int restID) {
        List<Item> menu = new ArrayList();

        //connect to DB
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RestaurantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OFOS",
                    "root", "root");

            // query DB
            Statement st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Item "
                             +   "WHERE restID = " + restID);

            // add query results to list
            while (rs.next()) {
                Item menuItem = new Item();
                menuItem.setItemId(rs.getInt("itemID"));
                menuItem.setItemName(rs.getString("itemName"));
                menuItem.setPrice(rs.getBigDecimal("price"));
                
                menu.add(menuItem);
            }
            return menu;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return menu;
    }

}
