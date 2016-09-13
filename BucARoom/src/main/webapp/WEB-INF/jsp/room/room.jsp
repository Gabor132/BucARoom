<%-- 
    Document   : room
    Created on : Sep 12, 2016, 1:53:46 PM
    Author     : DragosGabor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BucARoom - Users</title>
        <link rel="stylesheet" type="text/css" href="resources/css/Main.css">
        <link rel="stylesheet" type="text/css" href="resources/css/Room.css">
        <link rel="stylesheet" type="text/css" href="resources/css/ErrorBubble.css">
        <script src="resources/script/jquery/jquery-3.1.0.min.js" type="text/javascript"></script>
        <script src="resources/script/javascript/ErrorHandler.js" type="text/javascript"></script>
        <script src="resources/script/javascript/Main.js" type="text/javascript"></script>
        <script src="resources/script/javascript/Room.js" type="text/javascript"></script>
    </head>
    <body>
        <header></header>
        <main>
            <h2 id="pageTitle">Rooms</h2>
            <form class="formRoom" method="POST">
                <fieldset>
                    <legend>Add Room</legend>
                    Room Number: <input id="roomNumber" type="number" min="101" max="999" name="roomNumber" required/>
                    Room Floor: <input id="roomFloor" type="number" min="1" max="99" name="roomFloor" required/></br>
                    Can be reserved: 
                    <select id="canBeReserved" required>
                        <option>YES</option>
                        <option>NO</option>
                    </select>
                    <input type="submit" value="Add room">
                </fieldset></br>
            </form>
            <form class="formRoom" method="GET">
                <fieldset>
                    <legend>Find room by Id</legend>
                    Id: <input id="id" type="number" name="id" required/>
                    <button type="button" onclick="getRoomById()">Find</button>
                </fieldset>
            </form>
            <div class="tableRooms">
                <table>
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>ROOM NUMBER</td>
                            <td>ROOM FLOOR</td>
                            <td>CAN BE RESERVED</td>
                        </tr>
                    </thead>
                    <tbody id="tableBody"></tbody>
                </table>
            </div>
        </main>
    </body>
</html>
