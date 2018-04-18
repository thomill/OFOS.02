/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
                    "root", "1234");

            // query DB
            Statement st = con.createStatement();
            rs = st.executeQuery("select name from Restaurant");

            // add query results to list
            while (rs.next()) {
                Restaurant restaurant = new Restaurant();
                restaurant.setName(rs.getString("name"));
                restaurantList.add(restaurant);
            }
            return restaurantList;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return restaurantList;
    }

}
