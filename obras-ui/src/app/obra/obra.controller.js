export class ObraController {


  constructor ($log, $routeParams, obraService) {

    'ngInject';

    this.$routeParams = $routeParams;

    obraService.pegaPorID($routeParams.id)
      .success( result => this.obra = result)
      .error( error => { $log.error(error); } );
  }

}
