package valor_sencer_maxim;

import java.util.Scanner;

public class Valor_Sencer_Maxim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre:");

        int num1 = sc.nextInt();

        System.out.println("Introdueix un altre nombre:");

        int num2 = sc.nextInt();

        System.out.println("El nombre major és " + Mayor_Menor(num1, num2));

    }

    static int Mayor_Menor(int n, int m) {

        return n > m ? n : m;

    }
}

// Dissenyar una funció que rebi dos valors sencers i retorni el valor màxim 
//d'ambdós.
