package com.sjcdigital.controller.util;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.sjcdigital.model.entities.DefaultEntity;

public class RestUtils {

	public static <T> T lanca404SeNulo(T object, String message) {
		if (object == null) {
			throw new WebApplicationException(Response.status(NOT_FOUND).entity(message).build());
		}
		return object;
	}

	public static <T> T lanca404SeNulo(T object, long id) {
		return lanca404SeNulo(object, "Objeto Não encontrado");
	}

	public static <T extends DefaultEntity> Response recursoCriado(Class<?> resource, T entity) {
		return Response.created( UriBuilder.fromResource(resource)
								.path(String.valueOf(entity.getId())).build())
								.entity(entity)
								.build();
	}
	
	public static Response recursoCriado(Class<?> resource, Long id) {
		return Response.created( UriBuilder.fromResource(resource)
				.path(String.valueOf(id)).build())
				.build();
	}
	
	
}
