var application = angular.module('myApp', []);

application.controller('TransactionController', function($scope) {
	$scope.transaction = [ {
		'account' : '40000',
		'debet' : '300',
		'credit' : '0'
	}, {
		'account' : '40001',
		'debet' : '0',
		'credit' : '100'
	}, {
		'account' : '40002',
		'debet' : '0',
		'credit' : '200'
	}];
});