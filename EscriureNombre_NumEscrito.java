package escriure_nombre;

import java.util.Scanner;

public class Escriure_nombre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un nombre entre 1 i 99:");

        int num = sc.nextInt();

        System.out.println("Has introduït: " + convert(num));

        sc.close();
    }

    private static String convert(int num) {
        String[] unDigit = {"", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};
        String[] dosDigit = {"", "deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};

        String[] dezena = {"", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou"};
        String[] vintena = {"", "vint-i-un", "vint-i-dos", "vint-i-tres", "vint-i-quatre", "vint-i-cinc", "vint-i-sis", "vint-i-set", "vint-i-vuit", "vint-i-nou"};

        if (num == 0) {
            return "Zero";
        } else if (num < 10) {
            return unDigit[num];
        } else if (num < 20) {
            return dezena[num - 10];
        } else if (num < 30) {
            return vintena[num - 20];
        }else if (num < 100) {
            return dosDigit[num / 10] + " " + unDigit[num % 10];
        } else {
            return "S'ha d'introduïr un nombre entre 1 i 99";
        }
    }
}

//Pedir un número de 0 al9 y del 20 al 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
