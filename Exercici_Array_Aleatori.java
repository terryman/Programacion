package exercici_array_aleatori;

public class Exercici_Array_Aleatori {

    public static void main(String[] args) {

        int suma = 0;
        int aleatori[] = new int[10];
        
        for (int i = 0; i < aleatori.length; i++) {
            
            aleatori[i] = (int) (Math.random() * 100 + 1);

            suma += aleatori[i];
        }
            System.out.println ( suma);
        }
      }
    

//Fes un programa que declari un array de longitud 10. I relleni totes les 
//posicions amb un valor aleatori entre 1 i 100. Després, recorre tot l’array 
//i suma tots els valors. Mostra el resultat per pantalla.
