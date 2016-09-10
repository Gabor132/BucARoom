<%-- 
    Document   : login
    Created on : Sep 4, 2016, 1:07:06 AM
    Author     : Dragos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/Login.css" type="text/css" rel="stylesheet">
        <link href="resources/css/ErrorBubble.css" type="text/css" rel="stylesheet">
        <script src="resources/script/jquery/jquery-3.1.0.min.js" type="text/javascript"></script>
        <script src="resources/script/javascript/Login.js" type="text/javascript"></script>
        <script src="resources/script/javascript/ErrorHandler.js" type="text/javascript"></script>
        <title>BucARoom</title>
    </head>
    <body>
        <main>
            <div id="loginDiv">
                <h2 id="pageTitle">Login</h2>
                <form id="loginForm">
                    <input id="username" type="text" placeholder="Username"><br/>
                    <input id="password" type="password" placeholder="Password"><br/>
                </form>
                <button onclick='checkUser()'>Login</button></br>
                <p><a onclick='register()'>Don't have an account?</a></p>
            </div>
            <div id="registerDiv">
                <h2 id="pageTitle2">Register</h2>
                <form id="registerForm">
                    <input id="firstName" type="text" placeholder="First Name">
                    <input id="lastName" type="text" placeholder="Last Name"><br/>
                    <input id="usernameR" type="text" placeholder="Username">
                    <input id="passwordR" type="password" placeholder="Password"><br/>
                    <input id="passwordRetypeR" type="password" placeholder="Retype Password">
                    <input id="email" type="email" placeholder="something@something.something"></br>
                </form>
                <button onclick='registerUser()'>Register</button><br/>
                <p><a onclick="login()">Already have an account?</a></p>
            </div>
        </main>
    </body>
</html>
