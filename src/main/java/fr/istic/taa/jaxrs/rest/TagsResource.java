package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.*;

import fr.istic.taa.jaxrs.domain.Tags;

import javax.ws.rs.POST;

import java.util.ArrayList;
import java.util.List;

@Path("/tags")
@Produces({"application/json", "application/xml"})
public class TagsResource {

    private List<Tags> tags = new ArrayList<Tags>();

    @GET
    @Path("/get/{id}/{libelle}")
    public Tags getUserById(@PathParam("id") int id, @PathParam("libelle") String libelle) {
        if (tags.isEmpty()) {
            Tags tag1 = new Tags(0,"Tag1");
            Tags tag2 = new Tags(1,"Tag2");
            Tags tag3 = new Tags(2,"Tag3");
            tags.add(tag1);
            tags.add(tag2);
            tags.add(tag3);
        }
        Tags tag = tags.get(id);
        return tag;
    }

    @POST
    @Path("/post/{libelle}")
    @Consumes("application/json")
    public void createProductInJSON(@PathParam("libelle") String libelle) {
        Tags tag = new Tags(tags.size(), libelle);
        tags.add(tag);
        String result = "Tag ajouté : Libelle : " + libelle;
    }
}