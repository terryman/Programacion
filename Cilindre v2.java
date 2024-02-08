package cilindre;

import java.util.Scanner;

public class cilindre {

    public static void main(String[] args) {
    	
    	String opcio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix l'altura:");

        Float altura = sc.nextFloat();

        System.out.println("Introdueix el radi:");

        Float radi = sc.nextFloat();

        System.out.println("Si es vol calcular l'àrea introdueix 'a' i per calcular el volum introdueix 'v'");

        opcio = sc.next();

        Area_Volum(altura, radi, opcio);

    }

    static void Area_Volum(Float i, Float j, String n) {

       switch (n) {
       
       case "a":

            System.out.println("L'àrea del cilindre és " + (2 * Math.PI * j * (i + j)));
            break;

       case "v":

            System.out.println("El volum del cilindre és " + (Math.PI * Math.pow(j, 2) * i));
            break;
        }
    }
}
// Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, 
//según se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) 
//o 'v'(para el volumen). Además hemos de pasarle a la función el radio y la altura.