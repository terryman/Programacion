package valor_absolut;

import java.util.Scanner;

public class Valor_Absolut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introdueix un nombre");

        num = sc.nextInt();

        num = num > 0 ? num : num * -1;

        System.out.println("El seu valor absolut és " + num);
    }
}

//Utilitza l’operador ternari per a calcular el valor absolut d’un nombre que 
//demani a l’usuari per teclat.