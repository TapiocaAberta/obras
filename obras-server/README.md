### O que é isso?

Programa para exibir o status das obras realizadas nos municípios de São Paulo. Utilizando dados do TCE (http://transparencia.tce.sp.gov.br/obras-publicas)

### Como funciona?

Temos o JPA para acesso ao banco. Temos também uma interface REST usando JAX-RS. Nada demais . . .
Para entender a aplicação, olhe o resumo dos métodos REST abaixo, com os devidos [Status HTTP](http://www.restapitutorial.com/httpstatuscodes.html):


Método 	  | URI											              | Retorno 
:-----:	  | :-------------------------------------| :------------------
GET		    | /api/obras?pagina={pg}              |  Paramatros: **id** (Integer), **pg** (Integer). Retorna status 200 e um JSON com uma lista Obras Paginadas. O retorno será uma lista com até 30 obras, o parametro passado **pg** referencia a que página se deseja obter a obra. Exemplo: `/api/obras?pagina=2` teremos as 30 obras da página 2. Caso não encontro nenhuma obra seu retorno será 404.
GET		    | /api/obras/{id}                    |  Paramatros: **id** (Integer). Retorna status 200 e um JSON com uma Obra com determinado id (Integer). 404 caso não encontre nada
POST		| /api/obras/{id}?util={util}         |  Paramatros: **id** (Integer), **util** (Boolean), Retorna status 200 e 404 caso não encontre nada
GET		    | /api/obras/cidade/{id}             |  Paramatros: **id** (Integer). Retorna status 200 e um JSON com uma lista de Obras de uma determinada cidade passada no parametro **id**. 404 caso não encontre nada
