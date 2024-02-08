package exercici_HMS_mes1;

import java.util.Scanner;

public class Exercici_HMS_mes1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m, s;
        int t;

        System.out.println("Introdueix l'hora");

        h = sc.nextInt();

        System.out.println("Introdueix els minuts");

        m = sc.nextInt();

        System.out.println("Introdueix els segons");

        s = sc.nextInt();

        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {

            t = (h * 3600) + (m * 60) + (s + 1);

            h = t / 3600;
            m = (t - (3600 * h)) / 60;
            s = t - ((h * 3600) + (m * 60));

            System.out.println("L'hora un segon més tard és " + h + ":" + m + ":" + s);
        } else {
            System.out.println("Les dades introduïdes son incorrectes");
        }
    }
}

//Demanar a l’usuari la hora, minut i segons. Determinar quina serà la hora 
//un segon més tard.
