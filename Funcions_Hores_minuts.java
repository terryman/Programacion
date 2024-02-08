package funcions_hores_minuts;

import java.util.Scanner;

public class Funcions_Hores_minuts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix les hores:");

        int hores = sc.nextInt();

        System.out.println("Introdueix els minuts:");

        int minuts = sc.nextInt();

        System.out.println("Introdueix els segons:");

        int segons = sc.nextInt();

        while (!IsValidHores(hores, minuts, segons)) {

            System.out.println("Introdueix unes dades vàlides");

            System.out.println("Introdueix les hores:");

            hores = sc.nextInt();

            System.out.println("Introdueix els minuts:");

            minuts = sc.nextInt();

            System.out.println("Introdueix els segons:");

            segons = sc.nextInt();

        }
        
        System.out.println("El resultat és " + IsValidHores(hores, minuts, segons));

    }

    static boolean IsValidHores(int hores, int minuts, int segons) {

        if (hores >= 0 && hores <= 23 && minuts >= 0 && minuts <= 59 && segons >= 0 && segons <= 59) {

            return true;
        }

        return false;
    }
}

//Fer una aplicació que demani el nombre d'hores, minuts i segons. 
//Una funció ha de comprovar si els valors introduïts són correctes. És a dir, 
//que les hores i els minuts no tinguin més de 60 minuts o segons, ni les hores 
//poden tenir més de 23 hores.
