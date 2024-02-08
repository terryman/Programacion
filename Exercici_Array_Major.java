package exercici_array_major;

import java.util.Scanner;

public class Exercici_Array_Major {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre:");

        int n = sc.nextInt();

        int array[] = new int[n];

        int major = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Introdueix un valor:");

            array[i] = sc.nextInt();
        }
        for (int valor : array) {

            if (valor > major) {

                major = valor;
            }
        }
        System.out.println("");
        System.out.println("El valor màxim introduït és " + major);
    }
}

//Fes un programa que demani quants nombres s’han d’introduïr. Després ha de 
//demanar la introducció de tots els nombres. 
//Finalment ha de mostrar el valor màxim introduït.
