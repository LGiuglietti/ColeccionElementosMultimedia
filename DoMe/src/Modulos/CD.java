package Modulos;

import java.time.LocalDate;
import java.util.Date;

public class CD extends ElementosMultimedia {
    private String bandaOArtista;
    private int cantTemas;
    private int puntaje;

    public CD(String bandaOArtista, int cantTemas, int puntaje) {
        this.bandaOArtista = bandaOArtista;
        this.cantTemas = cantTemas;
        this.puntaje = puntaje;
    }

    public CD(LocalDate fechaEmisionF, String nombre, String genero, int duracion, String[] premios, int prestado, String clasificacion, String bandaOArtista, int cantTemas, int puntaje) {
        super(fechaEmisionF, nombre, genero, duracion, premios, prestado, clasificacion);
        this.bandaOArtista = bandaOArtista;
        this.cantTemas = cantTemas;
        this.puntaje = puntaje;
    }

    public String getBandaOArtista() {
        return bandaOArtista;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
