<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form method="post" action="changeInformation.jsp">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <h3>Edit Profile Information</h3>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="newfname" value="<%= session.getAttribute("fname")%>" /></td>
                        
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="newlname" value="<%= session.getAttribute("lname")%>" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="newemail" value="<%= session.getAttribute("email")%>" /></td>
                    </tr>
                
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="newpass" value="<%= session.getAttribute("pass")%>" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>