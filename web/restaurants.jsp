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
        <title>Restaurants</title>

        <!--CSS---->
        <link rel="stylesheet" type="text/css" href="./indexUpdated_files/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="./indexUpdated_files/style.css">
        <link rel="stylesheet" type="text/css" href="./indexUpdated_files/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/css/animate.css">
        <link rel="stylesheet" type="text/css" href="./indexUpdated_files/responsive.css">

    </head>
    <body>
                <!-- Paste this code after body tag -->
        <div class="se-pre-con" style="display: none;"></div>
        <!-- Ends -->

        <header>
            <div class="container">
                <div class="row clearfix" id="home">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <div class="logo">
                            <h1> <a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#"><img src="./indexUpdated_files/TMPS000136.png" alt=""></a> </h1>
                        </div>
                    </div>

                </div>
            </div>
        </header>
        <section class="saction1">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <div class="menu">
                            <div class="mobile-nav-container"> </div>
                            <div class="mobile-nav-btn"><img class="nav-open" src="./indexUpdated_files/nav-open.png" alt="Nav Button Open"> <img class="nav-close" src="./indexUpdated_files/nav-close.png" alt="Nav Button Close"> </div>
                            <nav>
                                <ul>
                                    <li><a href="reg.jsp">Register</a></li>
                                    <li>
                                        <% if ((session.getAttribute("account") == null) || (session.getAttribute("account") == "")) { %>
                                        <%} else {
                                        %><a href="logout">Logout</a></li> <% }%>
                                    <li><a href="restaurants">Restaurants</a></li>

                                </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <h1>Restaurants</h1>
        <c:forEach items="${restList}" var="item">
            <h3>Name: ${item.getName()}</br></h3>
            <span>Phone: ${item.getPhone()}</br> </span>
        </c:forEach>
    </body>
</html>
