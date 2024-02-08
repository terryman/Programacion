package exercici_Scanner;

import java.util.Scanner;


public class Exercici_Scanner {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        int numero;
        numero = sc.nextInt ();
        numero += 5;
        System.out.println("El resultado es: " + numero);
     
 }
}
