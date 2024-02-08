package Conversor_Centimetres;

import java.util.Scanner;

public class Conversor_Centimetres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float mm, cm, m, x;

        System.out.println("Introdueix els mil.límetres");

        mm = sc.nextFloat();

        System.out.println("Introdueix els centímetres");

        cm = sc.nextFloat();

        System.out.println("Introdueix els metres");

        m = sc.nextFloat();

        x = (mm / 10) + cm + (m * 100);

        System.out.println("El resultat és " + x);

    }
}

//Sol·licita a l’usuari tres distàncies
//La primera mesura, en mil·límetres
//La segona mesura, en centímetres
//La tercera mesura, en metres
//El programa ha de mostrar la suma de les tres longituds introduïdes en 
//centímetres.
