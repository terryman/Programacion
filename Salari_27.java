import java.util.Scanner;

public class Salari_27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edat;
        float salari;

        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix el teu nom");

        String nom = input.nextLine();

        System.out.println("Introdueix la teva edat");

        edat = sc.nextInt();

        System.out.println("Introdueix el teu salari");

        salari = sc.nextFloat();

        if (edat >= 16 && edat <= 99) {

            if (edat >= 19 && edat <= 50) {
                salari = (salari * 5) / 100 + salari;

                System.out.println("El salari augmentat per " + nom + " i d'edat " + edat + " és " + salari);
            } else if (edat >= 51 && edat <= 60) {
                salari = (salari * 10) / 100 + salari;

                System.out.println("El salari augmentat per " + nom + " i d'edat " + edat + " és " + salari);
            } else if (edat >= 61) {
                salari = (salari * 15) / 100 + salari;

                System.out.println("El salari augmentat per " + nom + " i d'edat " + edat + " és " + salari);
            } else if (edat >= 16 && edat <= 18) {

                System.out.println("El salari per " + nom + " i d'edat " + edat + " és " + salari);
            }

        } else {

            System.out.println("No tens edat per treballar");
        }
    }
}

//Ha de demanar el nom, salari i edat. Ha de mostrar el nom, l'edat i el salari augmentat depenent:
//Si es menor de 16 no tiene edad para trabajar
//Entre 19 y 50 años el salario es un 5 por ciento más
//Entre 51 y 60 años el salario es un 10 por ciento más
//Si es mayor de 60 el salario es un 15 por ciento más

