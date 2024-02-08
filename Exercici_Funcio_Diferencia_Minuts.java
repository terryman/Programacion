package exercici_funcio_diferencia_minuts;

import java.util.Scanner;

public class Exercici_Funcio_Diferencia_Minuts {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int hora1, minuts1, hora2, minuts2;
       
        System.out.println("Introdueix el primer nombre d'hores i minuts:");
        hora1 = sc.nextInt();
            if (hora1 > 23 || hora1 < 0) {
            System.out.println("Error.Introdueix el nombre correcte d'hores:");
            hora1 = sc.nextInt();
        }
        System.out.println("Introdueix el primer nombre de minuts:");
        minuts1 = sc.nextInt();
            if (minuts1 > 59 || minuts1 < 0) {
            System.out.println("Error.Introdueix el nombre correcte de minuts:");
            minuts1 = sc.nextInt();
        }
        System.out.println("Introdueix el segon nombre d'hores i minuts:");
        hora2 = sc.nextInt();
            if (hora2 > 23 || hora2 < 0) {
            System.out.println("Error.Introdueix el nombre correcte d'hores:");
            hora2 = sc.nextInt();
        }
        System.out.println("Introdueix el segon nombre de minuts:");
        minuts2 = sc.nextInt();
            if (minuts2 > 59 || minuts2 < 0) {
            System.out.println("Error.Introdueix el nombre correcte de minuts:");
            minuts2 = sc.nextInt();
        }    
        int minuts = DiferenciaMinuts(hora1, minuts1, hora2, minuts2);
        System.out.println("Els minuts de diferència resultants son " + minuts);
    }
    
    static int DiferenciaMinuts(int hora1, int minuts1, int hora2, int minuts2){
        
        int minuts = ((hora1 * 60) + minuts1) - ((hora2 * 60) + minuts2);      
        if (minuts < 0) {
            minuts = -minuts;
            return minuts;
        } else {
        return minuts;
        }
    }  
}

//Fes una funció a la que se li passin les hores i minuts de dos instants de 
//temps. La funció ha de retornar la quantitat de minuts que han passat entre 
//els dos instants. El prototip de la funció serà:
//static int DiferenciaMinuts(int hora1, int minuts1, int hora2, int minuts2)
