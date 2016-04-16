package com.sjcdigital.obras.model.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.sjcdigital.obras.model.documents.Cidade;
import com.sjcdigital.obras.model.documents.Obra;
import com.sjcdigital.obras.model.repositories.Cidades;

@Component
public class PopulaObras {

	@Autowired
	private Cidades cidades;

	@PostConstruct
	public void popula() {

		Map<String, Cidade> cidadesObras = new HashMap<>();

		try {

			List<?> content = getCSVValues();

			content.forEach(c -> {

				String[] row = (String[]) c;

				Obra obra = buildObra(row);

				if (cidadesObras.containsKey(row[0])) {
					cidadesObras.get(row[0]).getObras().add(obra);

				} else {

					List<Obra> obras = new LinkedList<>();
					obras.add(obra);

					Cidade cidade = new Cidade();
					cidade.setNome(row[0]);

					cidade.setObras(obras);
					cidadesObras.put(row[0], cidade);
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		cidades.save(cidadesObras.values());

	}

	private Obra buildObra(String[] row) {
		
		Obra obra = new Obra();
		obra.setExercicio(row[1]);
		obra.setSemestre(row[2]);
		
		return obra;
	}

	@SuppressWarnings("resource")
	private List<?> getCSVValues() throws FileNotFoundException, IOException {
		CSVReader csvReader = new CSVReader(new FileReader(getCSVPath()), ';');
		List<String[]> csvValues = csvReader.readAll();
		return csvValues.subList(1, csvValues.size());
	}

	protected String getCSVPath() {
		return getClass().getClassLoader().getResource("csv/obras-publicas.csv").getPath();
	}

}
