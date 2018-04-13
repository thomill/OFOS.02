<!DOCTYPE html>

<html style="" class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface no-generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Order Food Online</title>
        <link href="css/css" rel="stylesheet" type="text/css">
        <link href="css/css(1)" rel="stylesheet" type="text/css">

        <!--MOBILE DEVICE-->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <!--CSS---->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="css/responsive.css">

        <!--JS-->

        <script type="text/javascript" src="css/jquery-1.11.3.min.js.download"></script>
        <script type="text/javascript" src="css/modernizr.js.download"></script>
        <script src="css/scripts.js.download"></script>
        <script src="css/waypoints.min.js.download"></script>
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
                            <h1> <a href="index.jsp"><img src="css/TMPS000136.png" alt=""></a> </h1>
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
                            <div class="mobile-nav-btn"><img class="nav-open" src="css/nav-open.png" alt="Nav Button Open"> <img class="nav-close" src="css/nav-close.png" alt="Nav Button Close"> </div>
                            <nav>
                                <ul>
                                    <%
                                        if ((session.getAttribute("account") == null) || (session.getAttribute("account") == "")) {
                                    %>
                                    <li>                                        
                                        <a href="mainlogin.jsp">Login</a>
                                    </li>
                                    <li><a href="reg.jsp">Register</a></li>
                                        <%} else {
                                        %>
                                    <li>
                                        <a>Welcome ${account.getEmail()}</a>
                                        <%
                                            }
                                        %></li>
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
        <section class="backgraound">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <div class="back">
                            <div class="line1 os-animation animated rotateInDownLeft" data-os-animation="rotateInDownLeft" data-os-animation-delay="1s" style="animation-delay: 1s;"> </div>
                            <div class="line2 os-animation animated rotateInDownLeft" data-os-animation="rotateInDownLeft" data-os-animation-delay="1s" style="animation-delay: 1s;"> </div>
                            <h2 class="os-animation animated zoomIn" data-os-animation="zoomIn" data-os-animation-delay="0.50s" style="animation-delay: 0.5s;">Network of over 5000 Restaurants</h2>
                            <h3 class="os-animation animated zoomIn" data-os-animation="zoomIn" data-os-animation-delay="1s" style="animation-delay: 1s;">To Order Online</h3>
                            <div class="line3 os-animation animated rotateInDownRight" data-os-animation="rotateInDownRight" data-os-animation-delay="1s" style="animation-delay: 1s;"> </div>
                            <div class="line4 os-animation animated rotateInDownRight" data-os-animation="rotateInDownRight" data-os-animation-delay="1s" style="animation-delay: 1s;"> </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="textbox os-animation animated zoomIn" data-os-animation="zoomIn" data-os-animation-delay="0.5s" style="animation-delay: 0.5s;">
                        <h3>Location Name</h3>
                        <input type="text" placeholder="Secunderabad">
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="textbox os-animation animated zoomIn" data-os-animation="zoomIn" data-os-animation-delay="0.5s" style="animation-delay: 0.5s;">
                        <h3>Restaurant Name</h3>
                        <input type="text" placeholder="Swagath Grand">
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="textbox1 os-animation animated zoomIn" data-os-animation="zoomIn" data-os-animation-delay="0.5s" style="animation-delay: 0.5s;">
                        <h3>Cuisine Name</h3>
                        <input type="text" placeholder="Chicken Biriyani">
                        <span class="search"><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#"><i class="fa fa-search"></i></a></span> </div>
                </div>
            </div>
        </section>

        <footer class="saction8">
            <div class="container" id="contact">
                <div class="row">
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="site">
                            <h3>Site Link</h3>
                        </div>
                        <div class="sitelink">
                            <ul>
                                <li> <span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">About Us</a></li>
                                <li><span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Contact Us</a></li>
                                <li><span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Privacy Policy</a></li>
                                <li><span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Terms of Use</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="site">
                            <h3>Site Link</h3>
                        </div>
                        <div class="sitelink">
                            <ul>
                                <li> <span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">About Us</a></li>
                                <li><span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Contact Us</a></li>
                                <li><span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Privacy Policy</a></li>
                                <li><span>?</span><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Terms of Use</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="follow">
                            <h3>Follow Us On...</h3>
                        </div>
                        <div class="social">
                            <ul>
                                <li> <i class="fa fa-facebook-square"></i><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Facebook</a></li>
                                <li><i class="fa fa-twitter-square"></i><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Twitter</a></li>
                                <li><i class="fa fa-linkedin-square"></i><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Linkedin</a></li>
                                <li><i class="fa fa-google-plus-square"></i><a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Google Plus</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="submit">
                            <h3>Subscribe Newsletter</h3>
                            <p>To get latest updates and food deals
                                every week</p>
                        </div>
                        <div class="submitbox">
                            <input type="text">
                            <div class="sub"> <a href="file:///C:/Users/Christian/Desktop/IT%20341/OFOS1-master/OFOS1-master/WebContent/index.html#">Submit</a> </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>

        <script type="text/javascript" src="css/sidemenu.js.download"></script>


    </body></html>