package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Fiche;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/fiche")
@Produces({"application/json", "application/xml"})
public class FicheResource {

    @GET
    @Path("/{ficheLibelle}")
    public Fiche getFicheByLibelle(@PathParam("ficheLibelle") Long ficheLibelle)  {
        // return fiche
        return new Fiche();
    }

    @POST
    @Consumes("application/json")
    public Response addFiche(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Fiche fiche) {
        // add fiche
        return Response.ok().entity("SUCCESS").build();
    }
}