package aprendre_comptar;

import java.util.Scanner;

public class Aprendre_Comptar {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix un nombre");

        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
      
        System.out.print(i + ", ");
        
        }
    }
}
        
 
//Dissenyar una aplicació per aprendre a comptar. Es demana a l’usuari un 
//nombre “n” i mostrarà tots els nombres entre 1 i “n”.
