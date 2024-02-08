package Assignar_Qualificacions;

import java.util.Scanner;

public class Assignar_Qualificacions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix una nota");

        num = sc.nextInt();

        switch (num) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficient");
                break;
            case 5:
                System.out.println("Suficient");
                break;
            case 6:
                System.out.println("Bé");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Excel.lent");
                break;
        }
    }
}

//Demanar una nota sencera de 0 a 10 i mostrar-la de la següent manera: 
//insuficient (0 - 4), Suficient (5), Bé (6), Notable (7 - 8), Excel·lent (9 - 10).
