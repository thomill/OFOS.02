<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body {font-family: Arial, Helvetica, sans-serif;}
            form {border: 3px solid #f1f1f1;}

            input[type=text], input[type=password] {
                width: 30%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 30%;
            }

            button:hover {
                opacity: 0.8;
            }

            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
                height:"2"; 
                width: "";
            }

            img.avatar {
                width: 10%;
                border-radius: 10%;
            }

            .container {
                padding: 16px;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }

            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }
        </style>
    </head>
    <body>

        <h2>Login Form</h2>

    <center><form method="post" action="login">
            <div class="imgcontainer">
                <img src="images/images.jpg" alt="Avatar" class="avatar">
            </div>
            <div class="container">
                <label for="uname"><b>Email</b></label><br/>
                <input type="text" placeholder="Enter Username" name="username" required><br/>

                <label for="psw"><b>Password</b></label><br/>
                <input type="password" placeholder="Enter Password" name="pass" required><br/>

                <button type="submit">Login</button>

            </div>    

            <div class="container" style="background-color:#f1f1f1">

                <span class="psw">Yet Not <a href="reg.jsp">Registered?</a></span>
                Forget Password <a href="forget.jsp">Retrieve here</a>
            </div>
        </form></center>

</body>
</html>






