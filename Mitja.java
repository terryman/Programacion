package mitja;

import java.util.Scanner;

public class Mitja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float mitja;
        int num, j = 9, acum = 0, i = 0;

        System.out.println("Introdueix un nombre sencer");

        num = (int) sc.nextInt();

        for (; j >= 1; j--){

            acum += num;

            i++;

            System.out.println("Introdueix un altre nombre sencer");

            num = sc.nextInt();

        }

        mitja = acum / i;

        System.out.println("La mitja és " + mitja);

    }
}

//Demanar 10 nombres sencers per teclat i mostrar la mitja.