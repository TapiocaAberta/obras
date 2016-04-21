package com.sjcdigital.model.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.sjcdigital.model.entities.impl.Obra;
import com.sjcdigital.model.repositories.impl.Obras;

@Stateless
public class ObraService {

	@Inject
	private Obras obras;

	public void vota(Obra obra, Boolean util) {
		
		if (util) {
			obra.setObraUtil(obra.getObraUtil() + 1);
		} else {
			obra.setObraInutil(obra.getObraInutil() + 1);
		}

		obras.atualizar(obra);

	}

}
