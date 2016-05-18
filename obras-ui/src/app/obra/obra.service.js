export class ObraService {
	/*@ngInject*/
	constructor($http, config) {
		this.$http = $http;
		this.config = config;
		this.uriObras = `${config.uri}obras`;
	}

	pegaPorID(idObra) {
		return this.$http.get(`${this.uriObras}/${idObra}`);
	}

	pegaCincoPiores(idCidade) {
		let uriCincoPiores = `${this.uriObras}/cidade/${idCidade}/cinco-menos`;
		return this.$http.get(uriCincoPiores);
	}

	pegaCincoMelhores(idCidade) {
		let uriCincoMelhores = `${this.uriObras}/cidade/${idCidade}/cinco-mais`;
		return this.$http.get(uriCincoMelhores);
	}

	votar(idObra, obraUtil = true) {
		let uriVotacao = `${this.uriObras}/${idObra}?util=${obraUtil}`;
		return this.$http.post(uriVotacao);
	}

	quantidade() {
		let uriQuantidade = `${this.uriObras}/quantidade`;
		return this.$http.get(uriQuantidade);
	}

	paginado(pg = 1) {
		let uriPaginado = `${this.uriObras}/?pagina=${pg}`;
		return this.$http.get(uriPaginado);
	}

	todasDaCidade(idCidade) {
		let uriTodasDaCidade = `${this.uriObras}/cidade/${idCidade}`;
		return this.$http.get(uriTodasDaCidade);
	}

}