package Comprovar_Nombre_Parell;

import java.util.Scanner;


public class Comprovar_Nombre_Parell {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un número");

        num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.println("El número es par");

        } else {

            System.out.println("El número no es par");
        }
    }
}
