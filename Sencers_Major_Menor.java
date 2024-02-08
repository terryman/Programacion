package sencers_major_menor;

import java.util.Scanner;

public class Sencers_Major_Menor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre:");

        int num1 = sc.nextInt();

        System.out.println("Introdueix un altre nombre:");

        int num2 = sc.nextInt();

        if (num1 > num2) {

            Major_Menor(num1, num2);

        } else {

            Major_Menor(num2, num1);

        }
    }

    static void Major_Menor(int n, int m) {

        for (int i = n; i >= m; i--) {

            System.out.println(i);

        }
    }
}

//Fer una aplicació que demani dos sencers i, a través d'una funció, mostri 
//tots els nombres que hi ha entre ells de major a menor.