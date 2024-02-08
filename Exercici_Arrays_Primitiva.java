package exercici_arrays_primitiva;

import java.util.Scanner;

public class Exercici_Arrays_Primitiva {

    public static void main(String[] args) {

        int encerts = primitiva();

        System.out.println("Hi ha " + encerts + " nombres encertats");
    }

    static int primitiva() {
        Scanner sc = new Scanner(System.in);

        int encerts = 0;
        int aposta[] = new int[6];
        int resultat[] = new int[6];

        System.out.println("Introdueix els nombres de l'aposta:");

        for (int i = 0; i < aposta.length; i++) {
            aposta[i] = sc.nextInt();
        }

        System.out.println("Introdueix els nombres guanyadors del sorteig:");

        for (int j = 0; j < resultat.length; j++) {
            resultat[j] = sc.nextInt();
        }

        for (int i = 0; i < aposta.length; i++) {
            for (int j = 0; j < resultat.length; j++) {
                if (aposta[i] == resultat[j]) {
                    encerts++;
                }
            }
        }
        return encerts;
    }
}

//Fes una funció que rebi per paràmetre dues taules, la primera amb 6 nombres 
//compresos entre 0 i 99, representant una aposta de la Primitiva. La segona, 
//també de 6 nombres, amb els nombres guanyadors. La funció ha de retornar el número d’encerts.
