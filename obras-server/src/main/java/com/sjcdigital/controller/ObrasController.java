package com.sjcdigital.controller;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.sjcdigital.controller.util.RestUtils;
import com.sjcdigital.model.repositories.impl.Obras;

@Stateless
@Path("obras/")
@Produces("application/json;charset=utf-8")
public class ObrasController {

	@Inject
	private Obras obras;

	@GET
	@Path("/")
	public Response todas(@QueryParam("pagina") int pg) {
		return Response.ok(RestUtils.lanca404SeNulo(obras.todosPaginado(30, pg), "Nenhuma obra encontrada")).build();
	}

	@GET
	@Path("/{id}")
	public Response comId(@PathParam("id") Long id) {
		return Response.ok(RestUtils.lanca404SeNulo(obras.comId(id), id)).build();
	}
	
	@GET
	@Path("/cidade/{id}")
	public Response porCidade(@PathParam("id") Long id) {
		return Response.ok(RestUtils.lanca404SeNulo(obras.obrasDaCidade(id), "Nenhuma obra encontrada")).build();
	}

}
