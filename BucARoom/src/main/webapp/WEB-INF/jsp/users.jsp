<%-- 
    Document   : users
    Created on : Sep 3, 2016, 2:15:20 AM
    Author     : Dragos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BucARoom</title>
    </head>
    <body>
        <h1>Users</h1>
        <table>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>USERNAME</td>
                    <td>PASSWORD</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${id}</td>
                    <td>${username}</td>
                    <td>${password}</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
