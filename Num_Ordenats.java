package Num_Ordenats;

import java.util.Scanner;

public class Num_Ordenats {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce un número");

        num1 = sc.nextInt();

        System.out.println("Introduce otro número");

        num2 = sc.nextInt();

        System.out.println("El número " + (num1 > num2 ? num1 : num2) + " es mayor que " + (num1 > num2 ? num2 : num1));

    }
}

//Enunciat:
//Demanar 2 números i mostrar-los ordenats. Utilitza l'operador ternari i no el
//condicional if-else.