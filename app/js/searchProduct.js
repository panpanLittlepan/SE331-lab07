productMainController.controller('listProductController',['$scope','$http','$rootScope','productService','$route','totalCalService','queryProductService',
function ($scope, $http, $rootScope, productService, $route, totalCalService, queryProductService){
	$scope.searchProduct = function(name){
	queryProductService.query({name:name},function(data){
	$scope.products = data;
	});
	}
}])