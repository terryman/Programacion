package Area_Triangle_v2;

import java.util.Scanner;

public class Area_Triangle_v2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Introduce la base");

        num1 = sc.nextDouble();

        System.out.println("Introduce la altura");

        num2 = sc.nextDouble();

        if (num1 >= 0 && num2 >= 0) {

            num3 = (num1 * num2) / 2;

            System.out.println("El área del triángulo es " + num3);

        } else if (num1 < 0 || num2 < 0) {

            System.out.println("No es permeten nombres negatius");
        }
    }
}

//Fes una aplicació que calculi l’àrea del triangle. 
//Abans de fer cap càlcul ha de comprovar que l’usuari no fiqui valors negatius.
