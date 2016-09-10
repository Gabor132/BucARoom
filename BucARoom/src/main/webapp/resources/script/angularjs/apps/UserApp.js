
/* global errorHandler */

var userApp = angular.module('userApp',[]);
userApp.controller('userController', function($rootScope, $http){
    $http.get('user/all').then(function(response){
        $rootScope.listUsers = response.data;
    }, function(response){
        errorHandler.alertError(response.status);
    });
});

