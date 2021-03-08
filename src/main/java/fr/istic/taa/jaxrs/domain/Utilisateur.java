package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.models.tags.Tag;

@XmlRootElement(name = "Utilisateur")
public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private List<Fiche> ficheList;

    public Utilisateur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Utilisateur() {}

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlElement(name = "fiche liste")
    public List<Fiche> getFicheList() {
        return ficheList;
    }

    public void setFicheList(List<Fiche> ficheList) {
        this.ficheList = ficheList;
    }
}