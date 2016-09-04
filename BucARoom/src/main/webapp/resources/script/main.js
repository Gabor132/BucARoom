$(document).ready(function(){
    var title = $("<h1 id=\"appName\">BucARoom</h1>");
    var menu = $("<nav id=\"menu\"></nav>");
    var ul = $("<ul></ul>");
    var home = $("<li><a href=\"/BucARoom\">HOME</a></li>");
    var users = $("<li><a href=\"users\">USERS</a></li>");
    ul.append(home).append(users);
    menu.append(ul);
    
    $("header").append(title).append(menu);
});