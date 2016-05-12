export class ObraController {


  constructor ($log, $stateParams, obraService) {

    'ngInject';

    this.obraService = obraService;
    this.buscaObraPorId($stateParams.id);

  }

  votar(obraUtil = true) {

  	this.obraService.votar(this.obra.id, obraUtil)
      .success( result => { 
      		this.votoComSucesso = "Voto Realizado com Sucesso!"
      		this.buscaObraPorId(this.obra.id);
      	})
      .error( error => { $log.error(error); } );

  }

  buscaObraPorId(idObra) {
  	this.obraService.pegaPorID(idObra)
        .success( result => this.obra = result)
        .error( error => { $log.error(error); } );
  }

  close() {
  	this.votoComSucesso = "";
  }

}
