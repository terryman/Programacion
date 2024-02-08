package nota_num;

import java.util.Scanner;

public class Nota_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double num;

        System.out.println("Introdueix una nota");

        num = sc.nextDouble();

        while (num >= 0 && num <= 10) {

            if (num >= 0 && num <= 4.9) {

                System.out.println("Insuficient");

            } else if (num >= 5 && num <= 5.9) {

                System.out.println("Suficient");

            } else if (num >= 6 && num <= 6.9) {

                System.out.println("Bé");

            } else if (num >= 7 && num <= 8.5) {

                System.out.println("Notable");

            } else if (num > 8.5 && num <= 10) {

                System.out.println("Excel.lent");

            }

            System.out.println("Introdueix un altre nombre");

            num = sc.nextDouble();

        }
    }
}
//Demanar una nota entre 0 i 10; i dir si es insuficient(0-4.9), suficient (5-5.9), bé (6-6.9), notable(7-8.5) o excelent (8.5-10). 
//Sortirem d'aquest programa quan posem una nota que no estigui entre el 0 i el 10; mentrestant anirà demanant notes.



