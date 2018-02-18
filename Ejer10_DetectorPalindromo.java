/*
 * 	Detector de Palindromos:
 * 	En otras palabras, revisas si una palabra es igual si se lee al reves
 * 
 */

package Ejercicios;
import java.util.Scanner;

public class Ejer10_DetectorPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra = sc.next(); sc.close();
		char[] character = palabra.toCharArray();
		char[] reves = new char[character.length];
		int contador=0;
		//int coincidencias=0;
		for(int i=character.length-1;contador < character.length;i--) {
			if (contador<character.length) {
				reves[contador]=character[i];
			}
			contador++;
		}
		//forma 1
		String vuelta = new String(reves);
		if (palabra.equalsIgnoreCase(vuelta)){
			System.out.println("Felicidades: Si es igual al reves");
		}else {

			System.out.println("No son iguales");
		}
		/*forma2
		for(int j=0;j<character.length;j++) {
			if(character[j]==reves[j]) {
				coincidencias++;
			}
		}
		if(coincidencias==character.length) {
			System.out.println("Felicidades: Si es igual al reves");
		}else {

			System.out.println("No son iguales");
		}*/
	}

}
