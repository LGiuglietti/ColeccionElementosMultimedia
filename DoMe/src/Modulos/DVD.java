package Modulos;

import java.time.LocalDate;
import java.util.Date;

public class DVD extends ElementosMultimedia {
        private String director;
        private String productor;
        private String estudio;

    public DVD(String director, String productor, String estudio) {
        this.director = director;
        this.productor = productor;
        this.estudio = estudio;
    }

    public DVD(LocalDate fechaEmisionF, String nombre, String genero, int duracion, String[] premios, int prestado, String clasificacion, String director, String productor, String estudio) {
        super(fechaEmisionF, nombre, genero, duracion, premios, prestado, clasificacion);
        this.director = director;
        this.productor = productor;
        this.estudio = estudio;
    }

    public String getDirector()
    {
        return director;
    }
    public String getProductor()
    {
        return productor;
    }
    public String getEstudio()
    {
        return estudio;
    }
}