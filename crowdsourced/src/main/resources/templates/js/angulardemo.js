var app = angular.module("demoApp", []);
    app.controller("demoCtrl", function($scope) {
        $scope.book = "The Alchemist";
        $scope.author = "Paulo Coelho";
    });