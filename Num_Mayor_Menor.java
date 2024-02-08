package Num_Mayor_Menor;

import java.util.Scanner;

public class Num_Mayor_Menor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce un número");

        num1 = sc.nextInt();

        System.out.println("Introduce otro número");

        num2 = sc.nextInt();

        if (num1 != num2 && num1 > num2) {

            System.out.println("El número mayor es " + num1);

        }

        else if (num1 != num2 && num1 < num2) {

            System.out.println("El número mayor es " + num2);
        }
    }
}

//Enunciat:
//Demanar 2 números distints i mostrar quin és major.
