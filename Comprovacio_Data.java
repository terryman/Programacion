package Comprovacio_Data;

import java.util.Scanner;

public class Comprovacio_Data {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, any;

        System.out.println("Introdueix el dia");

        dia = sc.nextInt();

        System.out.println("Introdueix el mes");

        mes = sc.nextInt();

        System.out.println("Introdueix l'any");

        any = sc.nextInt();

        if (dia > 28 && dia <= 31 && mes == 2) {

            System.out.println("Data no vàlida");

        } else if (dia == 31 && mes == 4 || dia == 31 && mes == 6 || dia == 31 && mes == 9 || dia == 31 && mes == 11) {

            System.out.println("Data no vàlida");

        } else if (any <= 0) {

            System.out.println("Data no vàlida");

        } else {

            System.out.println("la data " + dia + "/" + mes + "/" + any + " és vàlida");
        }
    }
}
//Demanar dia, mes i any d’una data. Comprovar si la data és correcta i vàlida.
//S’ha de tenir en compte que l’any 0 no existeix, i que existeixen mesos amb 
//28, 30 i 31 dies. No es consideren els anys bixestos.
