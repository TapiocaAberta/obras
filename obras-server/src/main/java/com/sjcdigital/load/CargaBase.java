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
		obra.setExercicio(linha[1]);
		obra.setSemestre(linha[2]);
		obra.setFuncaoDeGoverno(linha[3]);
		obra.setOrgaoContratante(linha[4]);
		obra.setDestinacaoObra(linha[5]);
		obra.setEnderecoObra(linha[6]);
		obra.setpPA(linha[7]);
		obra.setlDO(linha[8]);
		obra.setAtendimentoPopulacao(linha[9]);
		obra.setValorInicialPrevisto(linha[10]);
		obra.setValorTotalContratado(linha[11]);
		obra.setNomeEmpresaContratada(linha[12]);
		obra.setDataInicioObra(linha[13]);
		obra.setValorTotalTermosAditivos(linha[14]);
		obra.setReajuste(linha[15]);
		obra.setNivelExecuçãoFisica(linha[16]);
		obra.setValorTotalPago(linha[17]);
		obra.setDataPrevistaConclusao(linha[18]);
		obra.setSituacaoObra(linha[19]);
		obra.setDataRecebimentoDefinitivo(linha[20]);
		obra.setNomeServidorResponsavel(linha[21]);
		
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
