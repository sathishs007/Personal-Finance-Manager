(function () {
    'use strict';
    var DeliveryController = function ($scope,$location,$rootScope,$routeParams,ajaxFactory) {
  console.log("check:::: delivery details save");
  $scope.regSubmit=function(delform){
	  if(delform.$valid){
		  console.log("check:::: register valid");
		  var GetAll = new Object();	 
		 GetAll.pickupLocation = delform.pickupLocation;
		 GetAll.deliveryLocation = delform.deliveryLocation;		 
		 GetAll.weightyAndDimensions = delform.weightyAndDimensions;
		 GetAll.specialRequest = delform.specialRequest;
		 //buid
		 GetAll.bidStartQuotePrice = delform.bidStartQuotePrice;
		 //driversQuotedPrice
		 GetAll.biddingStatus = delform.biddingStatus;
		 GetAll.selectedDriverEmail = delform.selectedDriverEmail;
		 GetAll.negotiationTemrsAndCondition = delform.negotiationTemrsAndCondition;
		 GetAll.deliveryStatus = delform.deliveryStatus;
		 GetAll.paymentStatus = delform.paymentStatus;
		  
		 var newdata = JSON.stringify(GetAll);
		 
		  ajaxFactory.postAjaxCall("http://localhost:8080/saveDeliveryDetails",
				  newdata).then(function(message) {
      				if(message=="201"){      					
      					$location.path("/login");
      				}else{      					
      				}
					});
	  }
  };
    };
    DeliveryController.$inject = ['$scope','$location','$rootScope','$routeParams','ajaxFactory'];

    angular.module('app.MYApp').controller('DeliveryController', DeliveryController);
}());