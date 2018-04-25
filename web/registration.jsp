<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@ page import ="java.sql.*" %>
<%
    String fname = request.getParameter("fname");    
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String uname = request.getParameter("uname");
    String pass = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OFOS",
            "root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into account(email, username, password) values ('" + fname + "','" + lname + "','" + email + "','" + uname + "','" + pass + "')");
    if (i > 0) {
         String to = email;

        // Sender's email ID needs to be mentioned
        String from = "tjhill@ilstu.edu";
        
        // Assuming you are sending email from this host
        String host = "outlook.office365.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.port", "587");
        // Get the default Session object.
        Session sess = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("tjhill@ilstu.edu", "your ilstu password");
            }
        });

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(sess);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Congratulations!");

            // Send the actual HTML message, as big as you like
            message.setContent("<h1> Hi '"+fname+"'You have been successfully registered to Online food ordering system!!!!</h1>",
                    "text/html");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
