package Area_Triangle_v1;

import java.util.Scanner;

public class Area_Triangle_v1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Introduce la base");

        num1 = sc.nextDouble();

        System.out.println("Introduce la altura");

        num2 = sc.nextDouble();

        num3 = (num1 * num2) / 2;

        System.out.println("El área del triángulo es " + num3);
    }
}

//Crea un programa que demani la base i altura d’un triangle i mostri la seva 
//àrea: (b*a)/2