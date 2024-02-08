package taula_multiplicar;

import java.util.Scanner;

public class Taula_Multiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introdueix un nombre");

        num1 = sc.nextInt();

        System.out.println("Introdueix un altre nombre");

        num2 = sc.nextInt();

            for (int i = 0; i <= 10; i++) {
                if (i <= num2) {
                    System.out.println(num1 + " * " + i + " = " + (num1 * i));
                }
            }
        }
    }

//Demanarà dos nombres i ens farà la taula de multiplicar del primer nombre 
//que anirà del 0 fins al segon número