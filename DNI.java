package dni;

import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introdueix DNI:");

        num = sc.nextInt();

        switch (num % 23) {

            case 0:

                System.out.println("La lletra del DNI número " + num + " és T");

                break;

            case 1:

                System.out.println("La lletra del DNI número " + num + " és R");

                break;

            case 2:

                System.out.println("La lletra del DNI número " + num + " és W");

                break;

            case 3:

                System.out.println("La lletra del DNI número " + num + " és A");

                break;

            case 4:

                System.out.println("La lletra del DNI número " + num + " és G");

                break;

            case 5:

                System.out.println("La lletra del DNI número " + num + " és M");

                break;

            case 6:

                System.out.println("La lletra del DNI número " + num + " és Y");

                break;

            case 7:

                System.out.println("La lletra del DNI número " + num + " és F");

                break;

            case 8:

                System.out.println("La lletra del DNI número " + num + " és P");

                break;

            case 9:

                System.out.println("La lletra del DNI número " + num + " és D");

                break;

            case 10:

                System.out.println("La lletra del DNI número " + num + " és X");

                break;

            case 11:

                System.out.println("La lletra del DNI número " + num + " és B");

                break;

            case 12:

                System.out.println("La lletra del DNI número " + num + " és N");

                break;

            case 13:

                System.out.println("La lletra del DNI número " + num + " és J");

                break;

            case 14:

                System.out.println("La lletra del DNI número " + num + " és Z");

                break;

            case 15:

                System.out.println("La lletra del DNI número " + num + " és S");

                break;

            case 16:

                System.out.println("La lletra del DNI número " + num + " és Q");

                break;

            case 17:

                System.out.println("La lletra del DNI número " + num + " és V");

                break;

            case 18:

                System.out.println("La lletra del DNI número " + num + " és H");

                break;

            case 19:

                System.out.println("La lletra del DNI número " + num + " és L");

                break;

            case 20:

                System.out.println("La lletra del DNI número " + num + " és C");

                break;

            case 21:

                System.out.println("La lletra del DNI número " + num + " és K");

                break;

            case 22:

                System.out.println("La lletra del DNI número " + num + " és E");

                break;

        }
    }
}
