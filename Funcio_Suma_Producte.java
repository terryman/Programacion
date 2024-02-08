package Funcio_Suma_Producte;

import java.util.Scanner;

public class Funcio_Suma_Producte {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix un nombre:");
		int n = sc.nextInt();

		int array[] = new int[n];
		int suma = 0, producte = 1;

		for (int i = 0; i < n; i++) {
			System.out.println("Introdueix un valor:");
			array[i] = sc.nextInt();
		}
		System.out.println("");
		System.out.println("Introdueix un '1' per obtenir la suma o un '2' per obtenir el producte:");
		int m = sc.nextInt();

		if (m < 1 && m > 2) {
			System.out.println("Error, s'ha d'introduïr un '1' o un '2'");
		} else if (m == 1) {
			for (int valor : array) {
				suma += valor;
			}
			System.out.println("");
			System.out.println("El resultat de la suma és " + suma);
		} else if (m == 2) {
			for (int valor : array) {
				producte *= valor;
			}
			System.out.println("");
			System.out.println("El resultat del producte és " + producte);
		}
	}
}

//Diseñar una función que tenga como parámetros 2 números, 
//el primero será la cantidad de números que entraremos y 
//el segundo que calcule si es un 1 será la suma de ellos 
//y si es un 2 el producto de ellos, si es diferente que de un mensaje de error.