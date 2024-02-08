package exercici_array_mitja;

import java.util.Scanner;

public class Exercici_Array_Mitja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nota[] = new float[4];

        float mitja, num, acum = 0;
        int j = 4, i = 0;

        System.out.println("Introdueix la nota de l'alumne");

        num = (float) sc.nextFloat();

        for (; j >= 1; j--) {

            acum += num;

            System.out.println("Introdueix un altre nota");

            num = sc.nextFloat();

        }

        mitja = acum / i;

        System.out.println("La mitja és " + mitja);

    }

}

//Diseña un programa para crear un array de 4 números de tipo double para 
//almacenar las notas de los alumnos y devolver la nota media.
