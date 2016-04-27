package com.sjcdigital.controller;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.sjcdigital.controller.util.RestUtils;
import com.sjcdigital.model.repositories.impl.Cidades;

@Stateless
@Path("cidades/")
@Produces("application/json;charset=utf-8")
public class CidadesController {
	
	@Inject
	private Cidades cidades;
	
	@GET
	@Path("/")
	public Response todas() {
		return Response.ok(RestUtils.lanca404SeNulo(cidades.todos(), "Nunhuma Cidade Encontrada")).build();
	}

}
