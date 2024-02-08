package num_secret;

import java.util.Scanner;

public class Num_Secret {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, NumSecret = (int) (Math.random() * 100 + 1);

        System.out.println("Introdueix un nombre entre 1 i 100");

        num = sc.nextInt();

        while (num != NumSecret) {

            if (num < NumSecret) {

                System.out.println("El nombre secret és major");

            } else {

                System.out.println("El nombre secret és menor");
            }

            System.out.println("Introdueix un altre nombre");

            num = sc.nextInt();
        }
    }
}

//Implementar el joc "Nombre Secret". El programa estableix un nombre 
//aleatori (no el mostra). Després anirà demanant a l'usuari que introdueixi 
//un nombre i anirà indicant si el nombre que han de trobar és major o menor.