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
        <link rel="stylesheet" type="text/css" href="resources/css/Main.css">
        <script src="resources/script/jquery/jquery-3.1.0.min.js" type="text/javascript"></script>
        <script src="resources/script/javascript/Main.js" type="text/javascript"></script>
        <script src="resources/script/javascript/User.js" type="text/javascript"></script>
    </head>
    <body>
        <header></header>
        <main>
            <h2 id="pageTitle">Users</h2>
            <form id="formUserAdd" method = 'POST'>
                <fieldset>
                    <legend>Add User</legend>
                    Username: <input id="user" type="text" name="username" required/>
                    Password: <input id="pass" type="password" name="password" required/>
                    First name: <input id="first" type="text" name="firstname" required/>
                    Last name: <input id="last" type="text" name="lastname" required/>
                    Email: <input id="email" type="text" name="email" required/><br/>
                    <input type="submit" onclick="addUser()">
                </fieldset>
                <fieldset>
                    <legend>Find user by Id</legend>
                    Id: <input id="id" type="text" name="id"/>
                    <button type="button" onclick="getUserById()">Find</button>
                </fieldset>
            </form>
            <div class="tableUsers">
                <table>
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>USERNAME</td>
                            <td>EMAIL</td>
                        </tr>
                    </thead>
                    <tbody id="tableBody"></tbody>
                </table>
            </div>
        </main>
    </body>
</html>
