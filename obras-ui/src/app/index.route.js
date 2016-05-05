export function routerConfig ($stateProvider, $urlRouterProvider) {
  'ngInject';
  $stateProvider

    .state('home', {
      url: '/',
      templateUrl: 'app/main/main.html',
      controller: 'MainController',
      controllerAs: 'main'
    })

    .state('obra-detalhada', {
    	url: '/obra/{id}',
    	templateUrl: 'app/obra/obra.html',
    	controller: 'ObraController',
    	controllerAs: 'detalhada' 
    });

  $urlRouterProvider.otherwise('/');
}