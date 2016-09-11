

/* global errorHandler */

$(document).ready(function(){
    getAllUsers();
});

function getUserById(){
    var id = $("#id").val();
    $("#id").val("");
    if(id === '') return;
    if(id){
        $.ajax({
            type:"GET",
            url: "user/"+id,
            success: function(user){
                if(user !== ""){
                    var table = $("#tableBody");
                    $(".user").remove();
                    var userRow = userToTableRow(user);
                    table.append(userRow);
                }else{
                    errorHandler.alertError("No user with that id!");
                }
            },
            complete: function(x){
                console.log(x.status);
            }
        });
    }
}

function userToTableRow(user){
    var tr = $("<tr class=\"user\"></tr>");
    var tdId = $("<td></td>").append(user.id);
    var tdUsername = $("<td></td>").append(user.username);
    var tdFirstName = $("<td></td>").append(user.firstName);
    var tdLastName = $("<td></td>").append(user.lastName);
    var tdEmail = $("<td></td>").append(user.email);
    tr.append(tdId);
    tr.append(tdUsername);
    tr.append(tdFirstName);
    tr.append(tdLastName);
    tr.append(tdEmail);
    return tr;
}

function getAllUsers(){
    var table = $("#tableBody");
    $(".user").remove();
    $.ajax({
        type:"GET",
        url: "user/all",
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

$(function(){
    $('.formUser').on('submit', function(e){
        addUser();
        e.preventDefault();
        getAllUsers();
    });
});

function addUser(){
    var user = $("#user").val();
    $("#user").val('');
    var pass = $("#pass").val();
    $("#pass").val('');
    var email = $("#email").val();
    $("#email").val('');
    var first = $("#first").val();
    $("#first").val('');
    var last = $("#last").val();
    $("#last").val('');
    if(user==='' || pass==='' || email==='' || first==='' || last==='') return;
    var sendInfo = {
        username: user,
        password: pass,
        email: email,
        firstName: first,
        lastName: last
    };
    $.ajax({
        type: "POST",
        url: "user/addUser",
        dataType: "json",
        success: function (user) {
            //location.reload(true);
            errorHandler.alertError('Added user '+user.username);
        },
        complete: function(x){
            console.log(x.status);
            if(x.status >= 500){
                alert("SERVER FAILED!");
            }else if(x.status >= 400){
                alert("CLIENT FAILED!");
            }
        },
        data: sendInfo
    });
    
}
