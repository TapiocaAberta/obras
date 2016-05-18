export class MainController {
  constructor (cidadeService, obraService, $log) {

    'ngInject';

    this.tipoBusca = "todasObras";
    this.obraService = obraService;

    cidadeService.pegaTodasCidades()
      .success(result => {
        this.cidades = result;
        this.cidade = result[0];
      })
      .error( error => { $log.error(error); } );

    obraService.quantidade()
      .success( result => this.quantidade = result )
      .error( error => { $log.error(error); } );

    this.buscaPorPagina();

  }

  buscar() {

    if (this.pioresOuMelhores === "todas") {
      this.buscaPorCidade();

    } else if (this.pioresOuMelhores === "melhores") {
      this.buscarCincoMelhores();

    } else if (this.pioresOuMelhores === "piores") {
      this.buscarCincoPiores();

    }
  }

  buscaPorPagina() {

    this.obraService.paginado(this.paginaCorrente)
      .success( result => this.obras = result)
      .error( error => { $log.error(error); } );

  }

  buscaPorCidade() {
    this.obraService.todasDaCidade(this.cidade.id)
      .success( result => this.obras = result)
      .error( error => { $log.error(error); } );
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
