package capicua_v2;

import java.util.Scanner;

public class Capicua_v2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, um, c, d, u;

        System.out.println("Introdueix un nombre entre 0 i 9999");

        num = sc.nextInt();

        if (num >= 0 && num <= 10) {

            System.out.println("El nombre no és capicúa");

        } else if (num > 10 && num <= 99) {

            d = num / 10;
            u = num - (d * 10);

            if (d == u) {

                System.out.println("El resultat és capicúa");

            } else {

                System.out.println("El resultat no és capicúa");

            }
        } else if (num >= 100 && num <= 999) {

            c = num / 100;
            d = (num - (c * 100)) / 10;
            u = num - ((d * 10) + (c * 100));

            if (c == u) {

                System.out.println("El resultat és capicúa");

            } else {

                System.out.println("El resultat no és capicúa");

            }
        } else if (num >= 1000 && num <= 9999) {

            um = num / 1000;
            c = (num - (um * 1000)) / 100;
            d = (num - ((um * 1000) + (c * 100))) / 10;
            u = num - ((um * 1000) + (c * 100) + (d * 10));

            if (um == u && c == d) {

                System.out.println("El resultat és capicúa");

            } else {

                System.out.println("El resultat no és capicúa");
            }
        }
    }

}
