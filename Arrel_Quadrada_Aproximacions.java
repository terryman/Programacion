package arrel_quadrada_aproximacions;

import java.util.Scanner;

public class Arrel_Quadrada_Aproximacions {

    public static void main(String[] args) {

        int num, aprox;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {

            aprox = (i * i);

            if (aprox > num) {
                System.out.println("El resultat és " + (i - 1) + " amb un resta de " + (num - ((i - 1) * (i - 1))));
                break;
            }
        }
    }
}

//Sense utilitzar Math.sqrt(), calcula l'arrel quadrada d’un nombre mitjançant 
//aproximacions. En cas que no sigui exacta mostra el reste.
//Per exemple: per a calcular l’arrel quadrada de 23, provam: 1^2=1, 2^2=4, 3^2=9, 
//4^2=16, 5^2=25 (ens passem). El resultat és 4 amb un resta de 23-16=7.
