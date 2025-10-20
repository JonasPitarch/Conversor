package org.example;

import java.util.List;

public class Festival {
    private String titol;
    private String descripcio;
    private String data_inici;
    private String data_fi;
    List<Artista>artistes;
    List<Escenari>escenaris;

    public Festival() {
    }

    public Festival(String titol, String descripcio, String data_inici, String data_fi, List<Artista> artistes, List<Escenari> escenaris) {
        this.titol = titol;
        this.descripcio = descripcio;
        this.data_inici = data_inici;
        this.data_fi = data_fi;
        this.artistes = artistes;
        this.escenaris = escenaris;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getData_inici() {
        return data_inici;
    }

    public void setData_inici(String data_inici) {
        this.data_inici = data_inici;
    }

    public String getData_fi() {
        return data_fi;
    }

    public void setData_fi(String data_fi) {
        this.data_fi = data_fi;
    }

    public List<Artista> getArtistes() {
        return artistes;
    }

    public void setArtistes(List<Artista> artistes) {
        this.artistes = artistes;
    }

    public List<Escenari> getEscenaris() {
        return escenaris;
    }

    public void setEscenaris(List<Escenari> escenaris) {
        this.escenaris = escenaris;
    }
}
