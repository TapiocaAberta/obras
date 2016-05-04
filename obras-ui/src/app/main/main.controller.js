export class MainController {
  constructor (cidadeService, obraService, $log) {

    'ngInject';

    this.obraService = obraService;
    
    cidadeService.pegaTodasCidades()
      .success( result => this.cidades = result )
      .error( error => { $log.error(error); } );

  }

  buscaPorCidade() {
    this.obraService.pegaCincoPiores(this.cidade.id)
      .success( result => this.cincoPiores = result)
      .error( error => { $log.error(error); } );
  }

}
