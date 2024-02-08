package equacio_2n_grau;

import java.util.Scanner;

public class Equacio_2n_Grau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix els coeficients de l'equació (ax^2 + bx + c = 0)");
        
        System.out.println("");

        System.out.println("Introdueix a: ");

        double a = sc.nextDouble();

        System.out.println("Introdueix b: ");

        double b = sc.nextDouble();

        System.out.println("Introdueix c: ");

        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double arrel1 = (-b + Math.sqrt(discriminant)) / (2 * a);

            double arrel2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Les arrels són reals i diferents:");

            System.out.println("Arrel 1: " + arrel1);

            System.out.println("Arrel 2: " + arrel2);

        } else if (discriminant == 0) {

            double arrel = -b / (2 * a);

            System.out.println("L'arrel és real i igual:");

            System.out.println("Arrel: " + arrel);

        } else {

            double PartReal = -b / (2 * a);

            double PartImag = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Les arrels són complexes i conjugues:");

            System.out.println("Arrel 1: " + PartReal + " + " + PartImag + "i");

            System.out.println("Arrel 2: " + PartReal + " - " + PartImag + "i");
        }

        sc.close();
    }
}

//Ens ha de demanar 3 paràmetres i ens ha de resoldre una eqaució de segon grau.
