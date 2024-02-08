package Assignar_Dies_Setmana;

import java.util.Scanner;

public class Assignar_Dies_Setmana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix un nombre entre l'1 i el 7");

        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Torna a introduïr un nombre entre l'1 i el 7");
                break;
        }
    }
}
//Demanar a l’usuari un número entre l’1 i el 7. Mostrar el dia de la setmana 
//corresponent. P.E: 1 -> dilluns, 6 -> dissabte
