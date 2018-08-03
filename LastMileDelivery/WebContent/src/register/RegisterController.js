(function () {
    'use strict';
    var RegisterController = function ($scope,$location,$rootScope,$routeParams,ajaxFactory) {
  console.log("check:::: register");
  //$scope.passwordMessage=false ;
  $scope.regSubmit=function(regform){
	  if(regform.$valid){
		  console.log("check:::: register valid");
		  if(regform.email==regform.email_confirm){
			  console.log("check:::: email ok") ;
			  $scope.emailMessage=false ;
		  }else{
			  $scope.emailMessage=true ;
		  }
		  if(regform.password==regform.password_confirm){
			  console.log("check:::: password ok") ;
			  $scope.passwordMessage=false ;
		  }else{
			  $scope.passwordMessage=true ;  
		  }
		  
		 var GetAll = new Object();
		 
		 GetAll.emailId = regform.emailId;
		 GetAll.password = regform.password;
		 
		 GetAll.firstName = regform.firstName;
		 GetAll.lastName = regform.lastName;
		 GetAll.gender = regform.gender;
		 GetAll.age = regform.age;
		 GetAll.nationality = regform.nationality;
		 GetAll.mobileno = regform.mobileno;
		 GetAll.address = regform.address;
		 GetAll.licDetails = new Object();
		 
		 GetAll.licDetails.drivingLicenceNumber = regform.drivingLicenceNumber;
		 GetAll.licDetails.ssn = regform.ssn;
		 GetAll.licDetails.vehicleMake = regform.vehicleMake;
		 GetAll.licDetails.vehicleModel = regform.vehicleModel;
		 GetAll.licDetails.drivingInsuranceDetails = regform.drivingInsuranceDetails;
		 GetAll.licDetails.truckCapacity = regform.truckCapacity;
		 GetAll.licDetails.truckDimensions = regform.truckDimensions;
		 
		 GetAll.bankDetails = new Object();
		 
		 GetAll.bankDetails.bankAccountNumber = regform.bankAccountNumber;
		 GetAll.bankDetails.ifscCode = regform.ifscCode;
		 
		 var newdata = JSON.stringify(GetAll);
		 
		  ajaxFactory.postAjaxCall("https://crowdsourced.cfapps.io/lastmiledelivery/saveUser",
				  newdata).then(function(message) {
      				if(message=="201"){      					
      					$location.path("/login");
      				}else{
      					$location.path("/login");
      				}
					});
	  }
  };
    };
    RegisterController.$inject = ['$scope','$location','$rootScope','$routeParams','ajaxFactory'];

    angular.module('app.MYApp').controller('RegisterController', RegisterController);
}());

