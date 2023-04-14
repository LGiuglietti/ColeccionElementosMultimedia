package Modulos;

import java.time.LocalDate;
import java.util.Date;

public class ElementosMultimedia {
    private String nombre;
    private String genero;
    private int duracion;
    private String[] premios;
    private int prestado;
    private String clasificacion;
    private LocalDate fechaEmisionF;

    public void setPrestado(int prestado) {
        this.prestado = prestado;
    }

    public ElementosMultimedia(LocalDate fechaEmisionF, String nombre, String genero, int duracion, String[] premios, int prestado, String clasificacion)
    {
        this.clasificacion=clasificacion;
        this.nombre=nombre;
        this.duracion=duracion;
        this.premios=premios;
        this.genero=genero;
        this.fechaEmisionF=fechaEmisionF;
    }
    public ElementosMultimedia()
    {
        this.fechaEmisionF=LocalDate.of(0,0,0);
        this.clasificacion="";
        this.nombre="";
        this.duracion=0;
        this.prestado=0;
        this.premios= new String[10];
        this.genero="";
    }
    public String getNombre()
    {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String[] getPremios() {
        return premios;
    }

    public LocalDate getFechaEmisionF() {
        return fechaEmisionF;
    }

    public int getPrestado() {
        return prestado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

}
