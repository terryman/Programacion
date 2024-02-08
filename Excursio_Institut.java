package Excursio_Institut;

import java.util.Scanner;

public class Excursio_Institut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float alum, cost, div;

        System.out.println("Introduce el número de alumnos");

        alum = sc.nextFloat();

        if (alum >= 100) {

            cost = 65;
            System.out.println("El coste total es " + alum * cost + " y cada alumno debe pagar " + cost);

        }
        
        else if (alum >= 55 && alum <= 99) {

            cost = 70;
            System.out.println("El coste total es " + alum * cost + " y cada alumno debe pagar " + cost);

        }
        
        else if (alum >= 30 && alum <= 49) {

            cost = 95;
            System.out.println("El coste total es " + alum * cost + " y cada alumno debe pagar " + cost);

        }
        
        else if (alum > 0 && alum <= 29) {

            cost = 4000;
            div = cost / alum;
            System.out.println("El coste total es " + cost + " y cada alumno debe pagar " + div);

        }
    }
}

//El director de una escuela está organizando un viaje de estudios y requiere 
//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía 
//de viajes por el servicio. La forma de cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.