package org.park;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/tenis")
public class Controle {

	
	Modelo modelo = new Modelo();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{nome}/{marca}/{tamanho}/{valor}")
	public Response tenis2(@PathParam String nome, @PathParam String marca, @PathParam String tamanho, @PathParam String valor) {	
	    List<Tenis> tenisEncontrados = modelo.buscarIdentificacao(new Identificacao(nome, marca, tamanho, valor));
	    String json2 = new Gson().toJson(tenisEncontrados);
	    return Response.status(200).entity(json2).build();	
	}
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}