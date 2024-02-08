import java.util.Scanner;

class SumaProd_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.println("Introdueix un nombre");

        num1 = sc.nextInt();

        System.out.println("Introdueix un altre nombre");

        num2 = sc.nextInt();

        num3 = (num1 * num2);
        
        num4 = (num1 + num2);

        System.out.println("El producte és " + num3 + " i la suma és " + num4);
    }
}


//Ha de demanar dos nombres i ha de presentar el seu producte i la seva suma.