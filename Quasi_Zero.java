package Quasi_Zero;

import java.util.Scanner;

public class Quasi_Zero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Introduce un número decimal");

        num = sc.nextDouble();

        if (num < 1 && num > -1 && num != 0) {
            System.out.println("El número es casi 0");
        } else {
            System.out.println("El número no es casi 0");
        }
    }
}

//Enunciat:
//Implementar un programa que demani per teclat un número decimal i indiqui si
//és un número quasi-zero (aquells positius o negatius que s'atraquen a zero per
//menys d'una unitat, tenint en compte que el 0 no se'l considera).


//altre forma de resoldre:
// if ((int) var !=0){
//  System.out.println("El número no es casi 0");}
// else if (var == 0){
//  System.out.println("El número no es casi 0");}
// else {
//  System.out.println("El número es casi 0");}