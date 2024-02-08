package estadistiques_v3;

import java.util.Scanner;

public class Estadistiques_v3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float mitja;
        int i, nota, acum = 0, susp = 0, aprov = 0;

        System.out.println("Introdueix el nombre d'alumnes del grup");

        i = sc.nextInt();

        for (int j = 0; j < i; j++) {

            System.out.println("Introdueix la nota de l'alumne");

            nota = sc.nextInt();
            
            if (nota >= 0 && nota <= 10) {
            
                if (nota >= 5) {

                aprov++;

                } else {

                susp++;
                }

                acum += nota;
                
            } else {
                
                System.out.println("Introdueix una nota vàlida:");

                nota = sc.nextInt();
                
                if (nota >= 5) {

                aprov++;

                } else {

                susp++;
                }

                acum += nota;
            }
        }
        
        mitja = (float) acum / i;

        System.out.println("El nombre d'alumnes suspesos és " + susp + ", el nombre d'alumnes aprovats és " + aprov + " i la nota mitja és " + mitja);
        
    }
}
