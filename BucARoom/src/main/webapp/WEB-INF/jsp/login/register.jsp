<%-- 
    Document   : register
    Created on : Sep 10, 2016, 4:17:52 AM
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
        <script src="resources/script/angularjs/angular.js" type="text/javascript"></script>
        <script src="resources/script/javascript/Login.js" type="text/javascript"></script>
        <script src="resources/script/javascript/ErrorHandler.js" type="text/javascript"></script>
        <script src="resources/script/angularjs/apps/LoginApp.js" type="text/javascript"></script>
        <title>BucARoom</title>
    </head>
    <body>
        <main>
            <div id="registerDiv">
                <form id="registerForm">
                    <input id="firstName" type="text" placeholder="First Name">
                    <input id="lastName" type="text" placeholder="Last Name"><br/>
                    <input id="usernameR" type="text" placeholder="Username">
                    <input id="passwordR" type="password" placeholder="Password"><br/>
                    <input id="passwordRetypeR" type="password" placeholder="Retype Password">
                    <input id="email" type="email" placeholder="something@something.something"></br>
                    <button id="registerButton">Register</button>
                </form>
            </div>
            <a href="login"><p>Login</p></a>
        </main>
    </body>
</html>
