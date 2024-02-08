package calculo_iva;

import java.util.Scanner;


public class Calculo_IVA {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        float base,IVA,importe_IVA,total;
        
       //Si se declaran las variables como "int", luego en la operación de la 
       //línea 26 el resultado es "0" por no poder calcularlo. 
       
        System.out.println("Introduce la base imponible");
        base = sc.nextFloat ();
        
        System.out.println("Introduce el % de IVA");
         IVA = sc.nextFloat ();
        
        importe_IVA = (base * (IVA/100)); 
         
        total = (importe_IVA + base);
        
        System.out.println("El importe del IVA es: " + importe_IVA);
     
        System.out.println("El importe total es: " + total);
    }
    
}
