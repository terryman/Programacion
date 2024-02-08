package cilindre;

import java.util.Scanner;

public class Cilindre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix l'altura:");

        Float altura = sc.nextFloat();

        System.out.println("Introdueix el radi:");

        Float radi = sc.nextFloat();

        System.out.println("Si es vol calcular l'àrea introdueix '1' i per calcular el volum introdueix '2'");

        int num = sc.nextInt();

        Area_Volum(altura, radi, num);

    }

    static void Area_Volum(Float a, Float b, int n) {

        Double pi = 3.1416;

        if (n == 1) {

            System.out.println("L'àrea del cilindre és " + (2 * pi * b * (a + b)));

        } else if (n == 2) {

            System.out.println("El volum del cilindre és " + (pi * Math.pow(b, 2) * a));

        }
    }
}

// Fes una funció que mostri per pantalla "l'àrea o el volum" d'un cilindre. 
//Per distingir una cas de l'altre s'inclou com a paràmetre un número: 
//si val 1 calcula l'area, si val 2 calcula el volum. A més, a la funció s'ha 
//de passar el radi i l'altura


//En lloc de fer un "if-else" es pot fer un "switch-case 1 àrea o 2 cilindre"