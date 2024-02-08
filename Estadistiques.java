package estadistiques;

import java.util.Scanner;

public class Estadistiques {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float mitja;
        int mayor = 0, i = 0, edat, acum = 0;

        System.out.println("Introdueix l'edat de l'alumne");

        edat = (int) sc.nextInt();
       
        while (edat > 0) {

            if (edat >= 18) {
                mayor++;
            }

            acum += edat;

            i++;

            System.out.println("Introdueix l'edat d'un altre alumne");

            edat = sc.nextInt();
        }

        mitja = acum / i;

        System.out.println("La suma de l'edat dels alumnes és " + acum + ", la mitja d'edat dels alumnes és " + mitja + ", el nombre d'alumnes és " + i + " i el nombre d'alumnes majors d'edat és " + mayor);

    }
}

//Implementar una app que calculi dades estadístiques dels alumnes del centre.
//El programa ha de permetre la introducció de dades fins que un d'ells sigui 
//negatiu.
//Quan acabi la introducció de dades, s'ha de mostrar: la suma de totes les 
//edats introduïdes, la mitja d'edat, el nombre d'alumnes i quants n'hi ha 
//majors d'edat.
