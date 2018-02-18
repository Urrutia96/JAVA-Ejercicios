/*
 * Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
 */

package Ejercicios;

import java.util.Scanner;

public class Ejer12_PedirNumeroyMostrarReves {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita una cantidad menor a 9999:");
		int cantidad = sc.nextInt();sc.close();
		int dm,um,c,d,u;
        // 9 9 . 9 9 9  a cada guarismo lo llamaremos:
        //dm um  c d u: dm (decenas de millar), um:(unidades de millar)
        //              c: (centenas), d: (decenas), u: (unidades
		
		//unidad
		u = cantidad % 10;
		cantidad = cantidad/10;
		//decenas
		d= cantidad%10;
		cantidad = cantidad/10;
		//centenas
		c = cantidad%10;
		cantidad = cantidad/10;
		//unidades de millar
		um = cantidad%10;
		cantidad = cantidad/10;
		//decenas de millar
		dm=cantidad%10;
		cantidad = cantidad/10;
		
		//imprimimos al reves
		System.out.println(u+""+d+""+c+""+um+""+dm);
	}
}
