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
        <title>BucARoom - Users</title>
        <link rel="stylesheet" type="text/css" href="resources/css/main.css">
        <script src="resources/script/jquery-3.1.0.min.js" type="text/javascript"></script>
        <script src="resources/script/main.js" type="text/javascript"></script>
        <script src="resources/script/users.js" type="text/javascript"></script>
    </head>
    <body>
        <header></header>
        <h3>Users</h3>
        <div class="tableUsers">
            <table>
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>USERNAME</td>
                        <td>PASSWORD</td>
                    </tr>
                </thead>
                <tbody id="tableBody"></tbody>
            </table>
            <button onclick="getAllUsers()">Refresh table</button>
        </div>
        <form id="formUserAdd">
            <fieldset>
                <legend>Add User</legend>
                Username: <input id="user" type="text" name="username"/>
                Password: <input id="pass" type="password" name="password"/><br/>
                <button type="button" onclick="addUser()">Submit</button>
            </fieldset>
            <fieldset>
                <legend>Find user by Id</legend>
                Id: <input id="id" type="text" name="id"/>
                <button type="button" onclick="getUserById()">Find</button>
            </fieldset>
        </form>
        <form id="formUserFind">
            
        </form>
    </body>
</html>
