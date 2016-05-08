export class ObraController {


  constructor ($log, $stateParams, obraService) {

    'ngInject';

    obraService.pegaPorID($stateParams.id)
      .success( result => this.obra = result)
      .error( error => { $log.error(error); } );
  }

}
