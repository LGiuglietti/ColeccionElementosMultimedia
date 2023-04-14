import Modulos.DoME;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DoME miDome= new DoME();
        System.out.println("bienvenido a la DoMe virtual");
        System.out.println("ingrese opcion");
        System.out.println("ingrese 1 para agregar DVD a la coleccion, ingrese 2 para agregar CD a la coleccion");
        System.out.println("ingrese 3 para prestar un elemento, ingrese 4 para buscar un elemento en la coleccion");
        System.out.println("ingrese 5 para mostrar un elemento");

        //inicio de variables de uso en el switch
        int desicion;
        Scanner teclado=new Scanner(System.in);
        desicion=teclado.nextInt();
        String nombre, genero, clasificacion, premioGanado;
        int anio, mes, dia, duracion, respuestaPremios, contadorBucleCargadoPremios;
        String[] arregloDePremios=new String[5];
        LocalDate fechaEmision;
        //fin de variables de uso en el switch

        switch (desicion){
            case 1:
                //ingreso de datos de padre ElementosMultimedia
                System.out.println("ingrese nombre");
                nombre= teclado.nextLine();
                teclado.nextLine();

                System.out.println("ingrese genero");
                genero= teclado.nextLine();
                teclado.nextLine();

                System.out.println("ingrese clasificacion");
                 clasificacion= teclado.nextLine();
                teclado.nextLine();

                System.out.println("ingrese anio, mes(numero) y dia de emision del elemento");
                anio= teclado.nextInt();
                mes= teclado.nextInt();
                dia= teclado.nextInt();
                 fechaEmision =LocalDate.of(anio,mes,dia);

                System.out.println("ingrese duracion del elemento");
                duracion= teclado.nextInt();

                System.out.println("tiene premios el elemento? (1-si / 0-no");
                respuestaPremios= teclado.nextInt();
                    for (contadorBucleCargadoPremios=0; contadorBucleCargadoPremios <= 5 && respuestaPremios == 1; contadorBucleCargadoPremios++) {
                        System.out.println("ingrese premio ganado");
                        teclado.nextLine();
                         premioGanado= teclado.nextLine();
                        arregloDePremios[contadorBucleCargadoPremios]=premioGanado;
                        contadorBucleCargadoPremios++;
                        System.out.println("desea ingresar otro?(1-si / 0-no)");
                        respuestaPremios= teclado.nextInt();
                    }
                //fin de ingreso de datos padre ElementosMultimedia
                //ingreso de datos de hijo DVD
                System.out.println("ingrese director");
                teclado.nextLine();
                String director= teclado.nextLine();

                System.out.println("ingrese productor");
                teclado.nextLine();
                String productor= teclado.nextLine();

                System.out.println("ingrese estudio");
                teclado.nextLine();
                String estudio= teclado.nextLine();
                //fin de ingreso de datos de hijo DVD
                //funcion de ingresar todas las variables utilizando hijo DVD
                miDome.agregarElementoMultimediaDVD(nombre,genero,clasificacion,arregloDePremios,duracion,fechaEmision,director,productor,estudio);
            case 2:
                //ingreso de datos de padre ElementosMultimedia
                System.out.println("ingrese nombre");
                nombre= teclado.nextLine();
                teclado.nextLine();

                System.out.println("ingrese genero");
                genero= teclado.nextLine();
                teclado.nextLine();

                System.out.println("ingrese clasificacion");
                clasificacion= teclado.nextLine();
                teclado.nextLine();

                System.out.println("ingrese anio, mes(numero) y dia de emision del elemento");
                anio= teclado.nextInt();
                mes= teclado.nextInt();
                dia= teclado.nextInt();
                 fechaEmision =LocalDate.of(anio,mes,dia);

                System.out.println("ingrese duracion del elemento");
                duracion= teclado.nextInt();

                System.out.println("tiene premios el elemento? (1-si / 0-no");
                respuestaPremios= teclado.nextInt();
                for (contadorBucleCargadoPremios=0; contadorBucleCargadoPremios <= 5 && respuestaPremios == 1; contadorBucleCargadoPremios++) {
                    System.out.println("ingrese premio ganado");
                    teclado.nextLine();
                    premioGanado= teclado.nextLine();
                    arregloDePremios[contadorBucleCargadoPremios]=premioGanado;
                    contadorBucleCargadoPremios++;
                    System.out.println("desea ingresar otro?(1-si / 0-no)");
                    respuestaPremios= teclado.nextInt();
                }
                //fin de ingreso de datos padre ElementosMultimedia
                //ingreso de datos de hijo CD
                System.out.println("ingrese banda o artista");
                teclado.nextLine();
                String bandaOArtista= teclado.nextLine();

                System.out.println("ingrese cantidad de temas");
                int cantTemas= teclado.nextInt();

                System.out.println("ingrese puntaje");
                int puntaje= teclado.nextInt();
                //fin de ingreso de datos de hijo CD
                miDome.agregarElementoMultimediaCD(nombre,genero,clasificacion,arregloDePremios,duracion,fechaEmision,bandaOArtista,cantTemas,puntaje);
            case 3:
                System.out.println("ingrese elemento a prestar");
                teclado.nextLine();
                String elementoAPrestar= teclado.nextLine();
                miDome.prestarElementoMultimedia(elementoAPrestar);
            case 4:
                boolean elementoEncontrado;
                System.out.println("ingrese elemento a buscar");
                teclado.nextLine();
                String elementoABuscar= teclado.nextLine();
                elementoEncontrado=miDome.buscarElementoMultimedia(elementoABuscar);
                if(elementoEncontrado)
                {
                    System.out.println("el elemento se encuentra en la coleccion");
                }
                else {
                    System.out.println("elemento no encontrado");
                }
            case 5:
                System.out.println("ingrese elemento a buscar");
                teclado.nextLine();
                elementoABuscar= teclado.nextLine();
                miDome.mostrarElemento(elementoABuscar);

        }
    }

}