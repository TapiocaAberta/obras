package com.sjcdigital.obras.model.documents;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String nome;
	private Collection<Obra> obras;

	public Collection<Obra> getObras() {
		return obras;
	}

	public void setObras(Collection<Obra> obras) {
		this.obras = obras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
