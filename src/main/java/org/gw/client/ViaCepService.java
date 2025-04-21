package org.gw.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.gw.model.DadoCep;

@Path("/ws")
@RegisterRestClient(configKey = "viacep")
public interface ViaCepService {

    @GET
    @Path("/{cep}/json")
    DadoCep getDadoCep(@PathParam("cep") String cep);

}
