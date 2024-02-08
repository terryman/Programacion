package Par_Impar_Pos_Neg;

import java.util.Scanner;

public class Par_Impar_Pos_Neg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix un nombre");

        num = sc.nextInt();

        if (num % 2 == 0 && num > 0) {

            System.out.println("El nombre és par i positiu");

        } else if (num % 2 == 0 && num < 0) {

            System.out.println("El nombre és par i negatiu");

        } else if (num % 2 != 0 && num > 0) {

            System.out.println("El nombre és senar i positiu");

        } else if (num % 2 != 0 && num < 0) {

            System.out.println("El nombre és senar i negatiu");

        }
    }
}
