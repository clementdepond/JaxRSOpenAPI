package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.*;

import fr.istic.taa.jaxrs.domain.Fiche;

import javax.ws.rs.POST;

import java.util.ArrayList;
import java.util.List;

@Path("/fiche")
@Produces({"application/json", "application/xml"})
public class FicheResource {

    private List<Fiche> fiches = new ArrayList<Fiche>();

    @GET
    @Path("/get/{id}/{libelle}")
    public Fiche getUserById(@PathParam("id") int id, @PathParam("libelle") String libelle) {
        if (fiches.isEmpty()) {
            Fiche fiche1 = new Fiche(0,"Fiche1");
            Fiche fiche2 = new Fiche(1,"Fiche2");
            Fiche fiche3 = new Fiche(2,"Fiche3");
            fiches.add(fiche1);
            fiches.add(fiche2);
            fiches.add(fiche3);
        }
        Fiche fiche = fiches.get(id);
        return fiche;
    }

    @POST
    @Path("/post/{libelle}")
    @Consumes("application/json")
    public void createProductInJSON(@PathParam("libelle") String libelle) {
        Fiche tag = new Fiche(fiches.size(), libelle);
        fiches.add(tag);
        String result = "Tag ajouté : Libelle : " + libelle;
    }
}