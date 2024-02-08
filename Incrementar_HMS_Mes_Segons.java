package Incrementar_HMS_Mes_Segons;

import java.util.Scanner;

public class Incrementar_HMS_Mes_Segons {

 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hores, hores2, minuts, minuts2, segons, segons2, temps, temps2;

        System.out.print("Introdueix les hores: ");

        hores = sc.nextInt();

        System.out.print("Introdueix els minuts: ");

        minuts = sc.nextInt();

        System.out.print("Introdueix els segons: ");

        segons = sc.nextInt();

        System.out.print("Segons a  incrementar: ");

        temps = sc.nextInt();
        
        if (hores >= 0 && hores <= 23 && minuts >= 0 && minuts <= 59 && segons >= 0 && segons <= 59) {

            temps2 = (hores * 3600) + (minuts * 60) + segons + temps;

            hores2 = temps2 / 3600;
            minuts2 = (temps2 - (3600 * hores2)) / 60;
            segons2 = temps2 - ((hores2 * 3600) + (minuts2 * 60));
            
            if (hores2 >= 24) {
                
                System.out.println("");
                System.out.println("Resultat: " + (hores2 - 24) + " hores, " + minuts2 + " minuts i " + segons2 + " segons.");
                
            }else {        
           
            System.out.println("");
            System.out.println("Resultat: " + hores2 + " hores, " + minuts2 + " minuts i " + segons2 + " segons.");
            }
            
        } else {
            System.out.println("Les dades introduïdes son incorrectes");
        }
    }
}

//Escriu un programa que incrementi l’hora d’un rellotge. Es demana per teclat 
//l’hora, els minuts i els segons així com el nombre de segons a incrementar 
//a l'hora introduïda. L’aplicació mostrarà la nova hora.
//Sortida per pantalla:
//Introdueix les hores: 10
//Introdueix els minuts: 59
//Introdueix els segons: 54
//Segons a incrementar: 10

//Resultat: 11 hores, 0 minuts i 4 segons
