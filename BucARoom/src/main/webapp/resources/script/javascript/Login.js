
/* global errorHandler */

$(document).ready(function(){
    login();
});

function login(){
    $("#registerDiv").css("display","none");
    $("#loginDiv").css("display","block");
}

function register(){
    $("#registerDiv").css("display","block");
    $("#loginDiv").css("display","none");
}

function checkUser(){
    var user = $("#username").val();
    var pass = $("#password").val();
    var sendInfo = {
        username: user,
        password: pass
    };
    $.ajax({
        type: "POST",
        url: "login/checkUser",
        dataType: "json",
        success: function (response) {
            if(response === true){
                errorHandler.alertError('User found!');
            }else if(response === false){
                errorHandler.alertError('User not found!');
            }else{
                errorHandler.alertError(response);
            }
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

function registerUser(){
    var user = $("#usernameR").val();
    var pass = $("#passwordR").val();
    var fName = $("#firstName").val();
    var lName = $("#lastName").val();
    var passRetype = $("#passwordRetypeR").val();
    var email = $("#email").val();
    
    if(pass !== passRetype){
        errorHandler.alertError('Passwords are not identical');
    }
    
    var sendInfo = {
        firstName : fName,
        lastName : lName,
        username : user,
        password : pass,
        email : email
    };
    $.ajax({
        type: "POST",
        url: "login/checkUser",
        dataType: "json",
        success: function (response) {
            if(response === true){
                errorHandler.alertError('User found!');
            }else if(response === false){
                errorHandler.alertError('User not found!');
            }else{
                errorHandler.alertError(response);
            }
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