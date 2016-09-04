
$(document).ready(function(){
    getAllUsers();
});

function getUserById(){
    var id = $("#id").val();
    $("#id").val("");
    if(id){
        $.ajax({
            type:"GET",
            url: id,
            success: function(user){
                if(user){
                    alert("Found "+user.username);
                }else{
                    alert("No user with that id!");
                }
            }
        });
    }
}

function userToTableRow(user){
    var tr = $("<tr class=\"user\"></tr>");
    var tdId = $("<td></td>").append(user.id);
    var tdUsername = $("<td></td>").append(user.username);
    var tdPassword = $("<td></td>").append(user.password);
    tr.append(tdId);
    tr.append(tdUsername);
    tr.append(tdPassword);
    return tr;
}

function getAllUsers(){
    
    var table = $("#tableBody");
    $(".user").remove();
    $.ajax({
        type:"GET",
        url: "users/all",
        success: function(listUsers){
            if(listUsers){
                for(var i = 0; i< listUsers.length;i++){
                    var elem = userToTableRow(listUsers[i]);
                    table.append(elem);
                }
            }else{
                alert("There is no user submited");
            }
        }
    });
    
}

function addUser(){
    var user = $("#user").val();
    var pass = $("#pass").val();
    var sendInfo = {
        username: user,
        password: pass
    };
    $.ajax({
        type: "POST",
        url: "users/addUser",
        dataType: "json",
        success: function (user) {
            location.reload(true);
        },
        complete: function(x){
            console.log(x.status);
            if(x.status >= 500){
                alert("SERVER FAILED!");
            }else if(x.status >= 400){
                alert("CLIENT FAILED!");
            }
        },
        data: sendInfo,
        traditional: true
    });
}