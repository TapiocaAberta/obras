package com.sjcdigital.model.repositories.impl;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import com.sjcdigital.model.entities.impl.Obra;
import com.sjcdigital.model.repositories.DefaultRepository;

@Stateless
public class Obras extends DefaultRepository<Obra> {

	public Collection<Obra> obrasDaCidade(Long id) {

		TypedQuery<Obra> query = em.createQuery("SELECT o FROM Obra o WHERE o.cidade.id = :id", Obra.class);
		query.setParameter("id", id);

		return query.getResultList();
	}
	
	public Collection<Obra> cincoMelhoresOuPiores(Long id, Boolean util) {

		String obraUtil = util ? "obraUtil" : "obraInutil";
		
		TypedQuery<Obra> query = em.createQuery("SELECT o FROM Obra o WHERE o.cidade.id = :id ORDER BY " + obraUtil + " DESC LIMIT 5", Obra.class);
		query.setParameter("id", id);

		return query.getResultList();
	}

}
