package Exercici_Boolean;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

public class Exercici_Boolean {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introdueix un nombre");

        num1 = sc.nextInt();

        System.out.println("Introdueix un altre nombre");

        num2 = sc.nextInt();

        boolean compar = num1 == num2 ? TRUE : FALSE;
        System.out.println(compar);

    }
}
//Es demanen dos números a l’usuari. S’ha de mostrar el booleà literal true si 
//són iguals i false en cas contrari.