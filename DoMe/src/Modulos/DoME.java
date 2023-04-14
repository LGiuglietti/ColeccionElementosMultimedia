package Modulos;

import java.time.LocalDate;
import java.util.Arrays;

public class DoME {
    private ElementosMultimedia[] dome;
    private int validos;

    public DoME() {
        this.dome = new ElementosMultimedia[100];
        this.validos = 0;
    }

    public void agregarElementoMultimediaCD(String nombre, String genero, String clasificacion, String[] premio,
                                            int duracion, LocalDate fechaEmision, String bandaOArtista, int cantTemas, int puntaje){

        ElementosMultimedia elementoAuxiliar= new CD(fechaEmision,nombre,genero,duracion,premio,0,clasificacion,bandaOArtista,cantTemas,puntaje);
        dome[validos]=elementoAuxiliar;
        validos++;
    }
    public void agregarElementoMultimediaDVD(String nombre, String genero, String clasificacion,
                                             String[] premio, int duracion, LocalDate fechaEmision, String director, String productor, String estudio){
        ElementosMultimedia elementoAuxiliar=new DVD(fechaEmision,nombre,genero,duracion,premio,0,clasificacion,director,productor,estudio);
        dome[validos]=elementoAuxiliar;
        validos++;
    }
    public boolean prestarElementoMultimedia(String nombre){
        boolean res=false; //devuelvo falso si no lo encontre
        int cont=0;
        while(cont<=validos){
            if(dome[cont].getNombre().equalsIgnoreCase(nombre)){
                res=true;
                dome[cont].setPrestado(1);//significa que preste el EM
                cont=validos;
            }
            cont++;
        }
        return res;
    }
    public boolean buscarElementoMultimedia(String nombre)
    {
        boolean res=false; //devuelvo falso si no lo encontre
        int cont=0;
        while(cont<=validos){
            if(dome[cont].getNombre().equalsIgnoreCase(nombre)){
                res=true;
                cont=validos;
            }
            cont++;
        }
        return res;
    }

    }
}
