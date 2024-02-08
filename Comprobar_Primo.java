package Primo;

import java.util.Scanner;

public class Primo {
	
	 public static void main(String[] args) {
	        int numero;
	        
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce un número:");

	        numero = sc.nextInt();
	        
	        if (esPrimo(numero)) {
	            System.out.println(numero + " es un número primo.");
	        } else {
	            System.out.println(numero + " no es un número primo.");
	        }
	    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
