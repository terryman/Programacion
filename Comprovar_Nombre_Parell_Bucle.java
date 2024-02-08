package comprobar_numero_par_bucle;

import java.util.Scanner;

public class Comprobar_numero_par_bucle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix un nombre");

        num = sc.nextInt();

        while (num != 0) {

            if (num % 2 == 0 && num > 0) {

                System.out.println("El número és par i positiu");

            } else if (num % 2 == 0 && num < 0) {

                System.out.println("El número és par i negatiu");

            } else if (num % 2 != 0 && num > 0) {

                System.out.println("El número és senar i positiu");

            } else if (num % 2 != 0 && num < 0) {

                System.out.println("El número és senar i negatiu");

            }

        System.out.println("Introdueix un altre nombre");

        num = sc.nextInt();
        
        }
    }
}

//En el ejercicio 'numpar' de los ejercicios anteriores, repetir el bucle 
//hasta que entremos un 0.
