package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.*;

import fr.istic.taa.jaxrs.domain.Utilisateur;
import javax.ws.rs.POST;

import java.util.ArrayList;
import java.util.List;

@Path("/utilisateur")
@Produces({"application/json", "application/xml"})
public class UtilisateurResource {

    private List<Utilisateur> users = new ArrayList<Utilisateur>();

    @GET
    @Path("/get/{id}/{nom}/{prenom}")
    public Utilisateur getUserById(@PathParam("id") int id, @PathParam("nom") String nom, @PathParam("prenom") String prenom)  {
        if (users.isEmpty()) {
            Utilisateur user1 = new Utilisateur(0, "Clément", "Depond");
            Utilisateur user2 = new Utilisateur(1, "Adèle", "Lecler");
            Utilisateur user3 = new Utilisateur(2, "Olivier", "Barais");
            users.add(user1);
            users.add(user2);
            users.add(user3);
        }
        Utilisateur user = users.get(id);
        return user;
    }

    @POST
    @Path("/post/{nom}/{prenom}")
    @Consumes("application/json")
    public Utilisateur createProductInJSON(@PathParam("nom") String nom, @PathParam("prenom") String prenom) {

        Utilisateur user = new Utilisateur(users.size(),nom,prenom);
        users.add(user);
        String result = "Utilisateur ajouté : Nom : " + nom + " Prénom : " + prenom;
        return user;

    }
}