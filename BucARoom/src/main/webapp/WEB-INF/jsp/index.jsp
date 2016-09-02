<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
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
        <form id="formUserAdd" action="addUser" method="POST">
            Username: <input type="text" name="username"/>
            Password: <input type="password" name="password"/>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
