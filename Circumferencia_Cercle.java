package cercle;

import java.util.Scanner;

public class Cercle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r, l, a, pi;

        System.out.println("Introdueix el radi");

        r = sc.nextDouble();

        pi = 3.1416;

        l = 2 * pi * r;

        a = pi * Math.pow(r, 2);

        System.out.println("La longitud de la circumferència és " + l + " i l'àrea és " + a);
    }
}

//Ens ha de demanar un radi i ens ha de donar la longitud de la circunferència i l'àrea del cercle.