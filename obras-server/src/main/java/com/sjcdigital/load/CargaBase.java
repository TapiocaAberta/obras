package com.sjcdigital.load;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import com.opencsv.CSVReader;
import com.sjcdigital.model.entities.impl.Cidade;
import com.sjcdigital.model.entities.impl.Obra;
import com.sjcdigital.model.repositories.impl.Cidades;

@Startup
@Singleton
public class CargaBase {
	
	private final String ARQUIVO_BASE_DADOS = "/csv/obras-publicas.csv";
	private Map<String, Cidade> cidadesEObras = new LinkedHashMap<>();
	
	@Inject
	private Logger logger;
	
	@Inject
	private Cidades cidades;
	
	@PostConstruct
	public void carregaDados() {
		
		//TODO: Melhorar isso depois
		if(cidades.todos().size() > 0) {
			return;
		}
		
		logger.info("Iniciando carga ...");
		
		try {
			
			List<?> linhas = pegaLinhasDoCSV();
			logger.info("Processando: " + linhas.size() + " obras no CSV");
			
			linhas.subList(1, linhas.size())
				  .forEach(this::montaCidade);
			
			cidadesEObras.values()
						 .forEach(cidades :: novo);
			
		} catch (IOException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "Erro ao processar CSV");
		}
		
	}
	
	protected void montaCidade(Object objeto) {
		String[] linha = (String[]) objeto;
		String cidadeNome = linha[0];
		
		if(cidadesEObras.containsKey(cidadeNome)) {
			Cidade cidade = cidadesEObras.get(cidadeNome);
			cidade.getObras().add(montaObra(linha, cidade));
			
		} else {
			Cidade cidade = new Cidade();
			
			List<Obra> obras = new LinkedList<>();
			obras.add(montaObra(linha, cidade));
			
			cidade.setNome(cidadeNome);
			cidade.setObras(obras);
			
			cidadesEObras.put(cidadeNome, cidade);
			
		}
		
	}
	
	protected Obra montaObra(String[] linha, Cidade cidade) {
		
		Obra obra = new Obra();
		
		obra.setCidade(cidade);
		obra.setExercicio(linha[1].trim());
		obra.setSemestre(linha[2].trim());
		obra.setFuncaoDeGoverno(linha[3].trim());
		obra.setOrgaoContratante(linha[4].trim());
		obra.setDestinacaoObra(linha[5].trim());
		obra.setEnderecoObra(linha[6].trim());
		obra.setpPA(linha[7].trim());
		obra.setlDO(linha[8].trim());
		obra.setAtendimentoPopulacao(linha[9].trim());
		obra.setValorInicialPrevisto(linha[10].trim());
		obra.setValorTotalContratado(linha[11].trim());
		obra.setNomeEmpresaContratada(linha[12].trim());
		obra.setDataInicioObra(linha[13].trim());
		obra.setValorTotalTermosAditivos(linha[14].trim());
		obra.setReajuste(linha[15].trim());
		obra.setNivelExecucaoFisica(linha[16].trim());
		obra.setValorTotalPago(linha[17].trim());
		obra.setDataPrevistaConclusao(linha[18].trim());
		obra.setSituacaoObra(linha[19].trim());
		obra.setDataRecebimentoDefinitivo(linha[20].trim());
		obra.setNomeServidorResponsavel(linha[21].trim());
		
		return obra;
	}
	
	@SuppressWarnings("resource")
	protected List<?> pegaLinhasDoCSV() throws FileNotFoundException, IOException {
		
		String path = this.getClass().getResource(ARQUIVO_BASE_DADOS).getPath();
		
		logger.info("Pegando CSV do Path: " + path);
		
		CSVReader csvReader = new CSVReader(new FileReader(path), ';');
		List<String[]> csvValues = csvReader.readAll();
		
		return csvValues;
	}

}
