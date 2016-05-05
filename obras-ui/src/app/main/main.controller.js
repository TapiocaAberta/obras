export class MainController {
  constructor (cidadeService, obraService, $log) {

    'ngInject';

    this.obraService = obraService;

    cidadeService.pegaTodasCidades()
      .success( result => this.cidades = result )
      .error( error => { $log.error(error); } );

  }

  buscaPorCidade() {

    console.log(this.pioresOuMelhores);

    this.obraService.pegaCincoPiores(this.cidade.id)
      .success( result => this.cincoPiores = result)
      .error( error => { $log.error(error); } );

    this.obraService.pegaCincoMelhores(this.cidade.id)
      .success( result => this.cincoMelhores = result)
      .error( error => { $log.error(error); } );
  }

}
