package com.sjcdigital.model.entities.impl;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sjcdigital.model.entities.DefaultEntity;
import com.sun.istack.NotNull;

@Entity
public class Cidade extends DefaultEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(nullable = false)
	private String nome;

	@JsonIgnore
	@OneToMany(mappedBy = "cidade", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Collection<Obra> obras;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Obra> getObras() {
		return obras;
	}

	public void setObras(Collection<Obra> obras) {
		this.obras = obras;
	}

}
