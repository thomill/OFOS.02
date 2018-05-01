<%-- 
    Document   : changeInformation
    Created on : Apr 30, 2018, 2:07:56 PM
    Author     : Tom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import ="java.sql.*" %>

<%
    
    String pwd = request.getParameter("newpass");
    String fname = request.getParameter("newfname");
    String lname = request.getParameter("newlname");
    String email = request.getParameter("newemail");
  
    session.setAttribute("fname", fname);
    session.setAttribute("lname", lname);
    session.setAttribute("pass", pwd);
    session.setAttribute("email", email);
    
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ofos",
            "admin", "1234");
    Statement st = con.createStatement();;
    //ResultSet rs;
    int i = st.executeUpdate("update ofos.account SET account.email ='" + email + "', account.password ='" + pwd +"' WHERE account.email ='" + session.getAttribute("AccountId") +"'");
    int j = st.executeUpdate("update ofos.customer SET customer.fName = '" + fname +"', customer.lName ='" + lname +"' WHERE customer.custId ='" + session.getAttribute("custId")+"'");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>

