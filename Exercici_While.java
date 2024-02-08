package Exercici_While;

import java.util.Scanner;

public class Exercici_While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix un nombre");

        num = sc.nextInt();

        while (num != 0) {

            if (num % 2 == 0 && num > 0) {

                System.out.println("El nombre és parell, positiu i el seu quadrat és " + Math.pow(num, 2));

            } else if (num % 2 != 0 && num > 0) {

                System.out.println("El nombre és senar, positiu i el seu quadrat és " + Math.pow(num, 2));

            } else if (num % 2 == 0 && num < 0) {

                System.out.println("El nombre és parell, negatiu i el seu quadrat és " + Math.pow(num, 2));

            } else if (num % 2 != 0 && num < 0) {

                System.out.println("El nombre és senar, negatiu i el seu quadrat és " + Math.pow(num, 2));

            }

            System.out.println("Introdueix un altre nombre");

            num = sc.nextInt();

        }
    }
}

//Dissenyar unna aplicació que mostri, per cada nombre introduït, si és parell, 
//positiu i el seu quadrat. El procés s'ha de repetir fins que l'usuari 
//introdueixi el nombre "0".
