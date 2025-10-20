package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

public class Artista {
    private String nom;
    private String genere;
    List<String>cancions;

    public Artista() {
    }

    public Artista(String nom, String genere, List<String> cancions) {
        this.nom = nom;
        this.genere = genere;
        this.cancions = cancions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public List<String> getCancions() {
        return cancions;
    }

    public void setCancions(List<String> cancions) {
        this.cancions = cancions;
    }
}
