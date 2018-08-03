(function () {
    'use strict';
var app = angular.module('app.MYApp', ['ngRoute','google-maps']);
var deliveryApp = angular.module('ngRoute');
deliveryApp.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
             when('/login',
             {
                 templateUrl: 'src/login/login.html',
                 controller: 'LoginController'
             }).when('/register',
                     {
                 templateUrl: 'src/register/register.html',
                 controller: 'RegisterController'
             }).
             when('/dashboard',
                     {
                         templateUrl: 'src/tmdashBoard/dashboard.html',
                         controller: 'DashBoardController'
                     }).when('/delivery',
                     {
                 templateUrl: 'src/delivery/delivery.html',
                 controller: 'DeliveryController'
             }).
             when('/driverdashboard',
                     {
                         templateUrl: 'src/driverdashboard/driverdashboard.html',
                         controller: 'DriverDashBoardController'
                     }).
            otherwise({
                redirectTo: '/login'
            });
    }]);
}());





