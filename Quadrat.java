package quadrat;

import java.util.Scanner;

public class Quadrat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double num;

        System.out.println("Introdueix un nombre");

        num = sc.nextDouble();

        while (num != 0) {

            System.out.println("El resultat és " + Math.pow(num, 2));

            System.out.println("Introdueix un altre nombre");

            num = sc.nextDouble();
        }
    }
}

//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca el 0.
