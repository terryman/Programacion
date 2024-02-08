package exercici_array_ordre_invers;

import java.util.Scanner;

public class Exercici_Array_Ordre_Invers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre:");

        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Introdueix un valor:");

            array[i] = sc.nextInt();

        }

        for (int i = n-1; i >= 0; i--) {

            System.out.println(array[i]);

        }
    }
}

//Fes un programa que demani quants nombres s’han d’introduïr. Després ha de 
//demanar la introducció de tots els nombres. Finalment ha de mostrar per 
//pantalla tots els nombres, un per línia, en l’ordre invers d’introducció.
