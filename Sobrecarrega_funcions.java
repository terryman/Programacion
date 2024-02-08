package sobrecarrega_funcions;

import java.util.Scanner;

public class Sobrecarrega_funcions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vols introduïr dos o tres valors?:");
        int x = sc.nextInt();

        switch (x) {

            case 2:

                System.out.println("Introdueix  els dos valors:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("El nombre major és " + Major_Menor(a, b));
                break;

            case 3:

                System.out.println("Introdueix els tres valors:");
                a = sc.nextInt();
                b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println("El nombre major és " + Major_Menor(a, b, c));
                break;
        }
    }

    static int Major_Menor(int a, int b) {

        int major1 = 0;
        major1 = a > b ? a : b;
        return major1;
    }

    static int Major_Menor(int a, int b, int c) {

        int major1 = 0;
        int major2 = 0;
        major1 = a > b ? a : b;
        major2 = major1 > c ? major1 : c;

        return major2;

    }
}
