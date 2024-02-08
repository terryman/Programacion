package exercici_array_ordenat;

import java.util.Scanner;

public class Exercici_Array_Ordenat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Introdueix un nombre:");

            array[i] = sc.nextInt();

        }

        for (int valor : array) {

            System.out.println(valor);
        }
    }
}

//Fes un programa que demani la introducció de 5 nombres sencers. 
//Després s’han de mostrar els 5 valors, un per línia, seguint l’ordre en 
//que s’han introduït.
