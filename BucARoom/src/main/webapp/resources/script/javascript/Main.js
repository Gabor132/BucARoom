
$(document).ready(function(){
    var title = $("<h1 id=\"appName\">BucARoom</h1>");
    var menu = $("<nav id=\"menu\"></nav>");
    var ul = $("<ul></ul>");
    var home = $("<li><a href=\"/BucARoom\">HOME</a></li>");
    var users = $("<li><a href=\"user\">USERS</a></li>");
    var rooms = $("<li><a href=\"room\">ROOMS</a></li>");
    ul.append(home).append(users).append(rooms);
    menu.append(ul);
    
    $("header").append(title).append(menu);
});


function ajaxGET(url, prepareGETFunction, succesFunction, completeFunction, failFunction){
    prepareGETFunction();
    $.ajax({
        type:"GET",
        url: url,
        success: function(object){
            succesFunction(object);
        },
        complete: function(x){
            completeFunction(x);
        },fail: function(x){
            failFunction(x);
        }
    });
}

function ajaxPOST(url, object, objectMapperFunction, preparePOSTFunction, succesFunction, completeFunction, failFunction){
    preparePOSTFunction();
    mappedObject = objectMapperFunction(object);
    $.ajax({
        type: "POST",
        url: url,
        dataType: "json",
        success: function (resultObject) {
            succesFunction(resultObject);
        },
        complete: function(x){
            completeFunction(x);
        },
        fail: function(x){
            failFunction(x);
        },
        data: mappedObject
    });
}