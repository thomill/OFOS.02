<%-- 
    Document   : wing stop
    Created on : Apr 13, 2018, 4:10:49 PM
    Author     : Tom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <h1>Welcome to Firehouse Subs!</h1>
        <h1>Menu</h1>
        <c:forEach items="${menu}" var="item">
            ${item.getItemName()}</br>
        </c:forEach>
    </body>
</html>
