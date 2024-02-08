package multiples_menors_100;

public class Multiples_Menors_100 {

    public static void main(String[] args) {

        int num, num2 = 1;

        num = 7;

        for (int i = 1; i <= 15; i++) {

            num2 = num * i;

            if (num2 < 100 && num2 % 7 == 0) {

                System.out.println((num2));
            }
        }
    }
}


//Escriure tots els múltiples de 7 menors que 100.

//   for (int i = 7; i <= 100; i+=7) {
//      System.out.println((i));