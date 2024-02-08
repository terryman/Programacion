package granja;

import java.util.Scanner;

public class Granja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        float k, m, mitja, necessari, disponible;

        System.out.println("Introdueix el nombre de quilos de pinso al magatzem");

        k = sc.nextFloat();

        System.out.println("Introdueix el nombre d'animals");

        i = sc.nextInt();

        System.out.println("Introdueix el nombre de quilos de pinso per animal");

        m = sc.nextFloat();

        necessari = i * m;

        disponible = k - necessari;

        if (k == 0) {

            System.out.println("No hi ha pinso disponible");

        } else if (i == 0){

            System.out.println("No hi ha animals als quals alimentar");

        }else if (disponible >= 0) {

            System.out.println("Hi ha prou pinso disponible");

        } else if (disponible < 0) {

            mitja = k / i;

            System.out.println("No hi ha prou pinso disponible, s'hauràn de "
                    + "suministrar " + mitja + " quilos per animal");
                    
        } 
    }
}
