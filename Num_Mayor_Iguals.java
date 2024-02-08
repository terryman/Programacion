package Num_Mayor_Iguals;

import java.util.Scanner;

public class Num_Mayor_Iguals {

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

        if (num1 != num2 && num1 < num2) {

            System.out.println("El número mayor es " + num2);
        }

        if (num1 == num2) {

            System.out.println("Ambos números son iguales");
        }
    }
}

//Enunciat:
//Demanar 2 números distints i mostrar quin és major i afagir opció de 2 números
//iguals.