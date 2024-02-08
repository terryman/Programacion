package serie_fibonacci;

import java.util.Scanner;

public class Serie_Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, resultat;

        System.out.println("Introdueix un nombre");

        n = sc.nextInt();

        resultat = fibonacci(n);

        System.out.println(resultat);
    }

    static int fibonacci(int n) {
        int resultat = 0;

        if (n == 1) {

            resultat = 1;

        } else if (n == 0) {

            resultat = 0;

        } else {

            resultat = fibonacci(n - 1) + fibonacci(n - 2);

        }
        return resultat;
    }
}

//Fes una funció recursiva per a calcular el terme "n" de la sèrie de Fibonacci. 
//El "n-terme" de la sèrie de Fibonacci es calcula obtenint la suma dels dos 
//termes antgeriors, és a dir: 
//fibonacci (n) = fibonacci (n-1) + fibonacci (n-2)
//fibonacci (0) = 0;
//fibonacci (1) = 1;

