export class MainController {
  constructor (cidadeService, obraService, $log) {

    'ngInject';

    this.obraService = obraService;

    cidadeService.pegaTodasCidades()
      .success( result => this.cidades = result )
      .error( error => { $log.error(error); } );

  }

  buscar() {

    if (this.pioresOuMelhores === "todas") {
      this.buscarTodas();

    } else if (this.pioresOuMelhores === "melhores") {
      this.buscarCincoMelhores();

    } else if (this.pioresOuMelhores === "piores") {
      this.buscarCincoPiores();

    }
  }

  buscarTodas() {
    console.log("Busca as todas obras");
  }

  buscarCincoPiores() {

    this.obraService.pegaCincoPiores(this.cidade.id)
      .success( result => this.obras = result)
      .error( error => { $log.error(error); } );

  }

  buscarCincoMelhores() {

    this.obraService.pegaCincoMelhores(this.cidade.id)
      .success( result => this.obras = result)
      .error( error => { $log.error(error); } );

  }

}
