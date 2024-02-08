import java.util.Scanner;

public class Compar_27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introdueix un nombre");

        num1 = sc.nextInt();

        System.out.println("Introdueix un altre nombre");

        num2 = sc.nextInt();

        if (num1 != num2 && num1 > num2) {

            System.out.println("El nombre major és " + num1 + " i el nombre menor és " + num2);

        }

        if (num1 != num2 && num1 < num2) {

            System.out.println("El nombre major és " + num2 + " i el nombre menor és " + num1);
        }

        if (num1 == num2) {

            System.out.println("Ambdós nombres son iguals");
        }
    }
}

//Ha de demanar dos nombres i ha de dir quin és el major, el menor o si són iguals.