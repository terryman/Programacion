package Contador_Primos;

import java.util.Scanner;

public class Contador_Primos {

    public static void main(String[] args) {
        int numero ;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");

        numero = sc.nextInt();

        int cantidadDivisoresPrimos = ContadorDivisoresPrimos.contarDivisoresPrimos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDivisoresPrimos + " divisores primos.");
    }
}

class ContadorDivisoresPrimos {

    static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int contarDivisoresPrimos(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
}
