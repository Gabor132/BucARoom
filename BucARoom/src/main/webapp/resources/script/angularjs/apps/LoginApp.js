
/* global errorHandler */

var loginApp = angular.module('loginApp',[]);

loginApp.controller('loginController', function($rootScope, $http, $window){
    $rootScope.submit = function(){
        if($rootScope.username !== null && $rootScope.password !== null){
            var data = {
                username : $rootScope.username,
                password : $rootScope.password
            };
            $http.post('login/checkUser', data).then(function(response){
                if(response.data !== false){
                    $window.location.href = '/BucARoom/';
                }else{
                    errorHandler.alertError('User does not exist');
                }
            }, function(response){
                errorHandler.alertError(response.statut);
            });
        }
    };
});

