package funcio_eco;

import java.util.Scanner;


public class Funcio_Eco {

    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre:");

        int num = sc.nextInt();
        
        eco (num);
    
    }

    static void eco(int n) {
         
       for (int i = 0; i < n; i++) {
           
        System.out.println("Eco...");
        
       }
    }
}

//Dissenyar una aplicació amb la funció eco (). L'aplicació demana un número "n"
//i repeteix en text "Eco..." tantes vegades com "n"