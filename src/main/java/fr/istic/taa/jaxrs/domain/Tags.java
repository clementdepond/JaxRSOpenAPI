package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.models.tags.Tag;

@XmlRootElement(name = "Tag")
public class Tags {
    private int id;
    private String libelle;
    private List<Fiche> listFiche;

    public Tags() {}
    public Tags(int id, String libelle) {
        this.libelle = libelle;
        this.id = id;
    }

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlElement(name = "liste fiche")
    public List<Fiche> getListFiche() {
        return listFiche;
    }

    public void setListFiche(List<Fiche> listFiche) {
        this.listFiche = listFiche;
    }
}