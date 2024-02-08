package Conversor_Segons_A_HMS;

import java.util.Scanner;

public class Conversor_Segons_A_HMS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m, s, t;

        System.out.println("Introdueix els segons");

        t = sc.nextInt();

        h = t / 3600;
        m = (t - (3600 * h)) / 60;
        s = t - ((h * 3600) + (m * 60));

        System.out.println("El temps introduït és " + h + ":" + m + ":" + s);
    }
}

//Dissenya una aplicació que demani a un usuari una quantitat de segons. 
//L’aplicació ha de mostrar quantes hores, minuts i segons hi ha en el nombre 
//de segons introduïts per l’usuari.
