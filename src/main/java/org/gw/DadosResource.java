package org.gw;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.gw.client.ViaCepService;
import org.gw.model.DadoCep;

@Path("/dado")
public class DadosResource {

    @RestClient
    ViaCepService viaCepService;

    @GET
    @Path("/cep/{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public DadoCep cep(@PathParam("cep") String cep) {
        return viaCepService.getDadoCep(cep);
    }

}
