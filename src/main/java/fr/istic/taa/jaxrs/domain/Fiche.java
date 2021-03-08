package fr.istic.taa.jaxrs.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.models.tags.Tag;

@XmlRootElement(name = "Fiche")
public class Fiche {
    private int id;
    private String libelle;
    private String date_butoire;
    private Utilisateur user_affection;
    private int temps;
    private List<Tag> tagsList;
    private String lieu;
    private String url;
    private String note_explicative;

    public Fiche(int id, String libelle) {
        this.libelle = libelle;
        this.id = id;
    }

    public Fiche() {}

    @XmlElement(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlElement(name = "date butoire")
    public String getDate_butoire() {
        return date_butoire;
    }

    public void setDate_butoire(String date_butoire) {
        this.date_butoire = date_butoire;
    }

    @XmlElement(name = "utilisateur")
    public Utilisateur getUser_affection() {
        return user_affection;
    }

    public void setUser_affection(Utilisateur user_affection) {
        this.user_affection = user_affection;
    }

    @XmlElement(name = "temps")
    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @XmlElement(name = "tags")
    public List<Tag> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<Tag> tagsList) {
        this.tagsList = tagsList;
    }

    @XmlElement(name = "lieu")
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @XmlElement(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlElement(name = "note explicative")
    public String getNote_explicative() {
        return note_explicative;
    }

    public void setNote_explicative(String note_explicative) {
        this.note_explicative = note_explicative;
    }
}