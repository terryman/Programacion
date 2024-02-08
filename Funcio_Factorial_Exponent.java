package funcio_factorial_exponent;

import java.util.Scanner;

public class Funcio_Factorial_Exponent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, exp;

        System.out.println("Introdueix un nombre");

        a = (int) sc.nextInt();
        
        System.out.println("Introdueix l'exponent");

        exp = (int) sc.nextInt();

        Factorial_Exponent(a, exp);
        
    }
        
        static void Factorial_Exponent(int n, int m) {

        int a = n;
        int exp = m;
        
        if (n == 0) {
                
                System.out.println("El factorial de '0' és 1, i '0' elevat a " + m + " és 0" );

            } else {
        
        for (int i = n - 1 ; i > 1; i--) {

            n = n * i;

        }
        
        System.out.println("El seu factorial és " + n + " i " + a + " elevat a " + exp + " és " + Math.pow(a, exp));

       } 
    }
}

//Diseña una función que calcule ‘a’ elevado a 'n' y ‘a!’(factorial).