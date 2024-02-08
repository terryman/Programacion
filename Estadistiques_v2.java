package estadistiques_v2;

import java.util.Scanner;

public class Estadistiques_v2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float mitja, nota;
        int i, acum = 0, susp = 0, aprov = 0;

        System.out.println("Introdueix el nombre d'alumnes del grup");

        i = (int) sc.nextInt();

        System.out.println("Introdueix la nota de l'alumne");

        nota = (int) sc.nextFloat();

        if (nota >= 0 && nota <= 10) {

            for (; i > 1; i--) {

                if (nota >= 5) {

                    aprov++;

                } else {

                    susp++;

                }
                
                acum += nota;

                System.out.println("Introdueix la nota d'un altre alumne");

                nota = sc.nextInt();
            }

            mitja = acum / (susp + aprov);

            System.out.println("El nombre d'alumnes suspesos és " + susp + ", el nombre d'alumnes aprovats és " + aprov + " i la nota mitja és " + mitja);

        }
    }
}
