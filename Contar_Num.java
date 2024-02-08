package contar_num;

import java.util.Scanner;

public class Contar_Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0, num, major;

        System.out.println("Introdueix un nombre");

        num = sc.nextInt();

        major = num;

        while (num > 0) {

            i++;

            if (num > major) {

                major = num;

            }
            System.out.println("Introdueix un altre nombre");

            num = sc.nextInt();
        }

        System.out.println("S'han introduït " + i + " nombres i el nombre major és " + major);
    }
}

//Pedir números hasta que se teclee un 0, y mostrar cuántos números se han 
//introducido y cuál ha sido el mayor.
