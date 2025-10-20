package org.example;

import java.util.List;

public class Escenari {
    private String nom;
    private String horari;
    private List<String>artistas;

    public Escenari(){
    }

    public Escenari(String nom, String horari, List<String> artistas) {
        this.nom = nom;
        this.horari = horari;
        this.artistas = artistas;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getHorari() {
        return horari;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }
}
