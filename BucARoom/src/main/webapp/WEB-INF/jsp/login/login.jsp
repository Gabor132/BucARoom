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
        <script src="resources/script/angularjs/angular.js" type="text/javascript"></script>
        <script src="resources/script/javascript/Login.js" type="text/javascript"></script>
        <script src="resources/script/javascript/ErrorHandler.js" type="text/javascript"></script>
        <script src="resources/script/angularjs/apps/LoginApp.js" type="text/javascript"></script>
        <title>BucARoom</title>
    </head>
    <body>
        <main>
            <div id="loginDiv">
                <h2 id="pageTitle">Login</h2>
                <form id="loginForm" ng-app="loginApp" ng-controller="loginController" ng-submit="submit()">
                    <input id="username" ng-model="username" type="text" placeholder="Username"><br/>
                    <input id="password" ng-model="password" type="password" placeholder="Password"><br/>
                    <button id="loginButton">Login</button>
                </form>
            </div>
            <a href="register"><p>Register</p></a>
        </main>
    </body>
</html>
