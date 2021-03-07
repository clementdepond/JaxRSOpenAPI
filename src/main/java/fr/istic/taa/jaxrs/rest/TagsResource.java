package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Tags;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/tags")
@Produces({"application/json", "application/xml"})
public class TagsResource {

    @GET
    @Path("/{tagsLibelle}")
    public Tags getTagsByLibelle(@PathParam("tagsLibelle") Long tagsLibelle)  {
        // return tags
        return new Tags();
    }

    @POST
    @Consumes("application/json")
    public Response addTags(
            @Parameter(description = "Pet object that needs to be added to the store", required = true) Tags tags) {
        // add tags
        return Response.ok().entity("SUCCESS").build();
    }
}