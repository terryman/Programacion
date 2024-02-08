package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, i;

        System.out.println("Introdueix un nombre");

        num = (int) sc.nextInt();

        for (i = num - 1 ; i > 1; i--) {

            num = num * i;

        }
        
        System.out.println("El seu factorial és " + num);

        if (num == 0) {
            
            System.out.println("El seu factorial és 1");

        }
    }
}
//Demanar un nombre i calcular el seu factorial.