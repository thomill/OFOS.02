<%-- 
    Document   : restaurants
    Created on : Apr 7, 2018, 6:00:47 PM
    Author     : Tom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Restaurants</h1>
            <c:forEach items="${restList}" var="item">
                ${item.getName()}</br> 
            </c:forEach>
    </body>
</html>
