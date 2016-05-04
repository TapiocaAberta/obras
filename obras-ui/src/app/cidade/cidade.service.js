export class CidadeService {
	/*@ngInject*/
	constructor($http, config) {
		this.$http = $http;
		this.config = config;
		this.uriCidade = `${config.uri}cidades`;
	}

	pegaTodasCidades(){
		return this.$http.get(this.uriCidade);
	}


}