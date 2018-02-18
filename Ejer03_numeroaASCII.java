/*Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
Por ejemplo: si introduzco un 97, me muestre una a.
*/
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author osmin
 */
public class Ejer03_numeroaASCII {
    public static void main(String[] args) {
        //Instanciamos la clase que nos permite resibir datos por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una cantidad para saber a que caracter ");
        System.out.println("pertenece en la tabla ASCII");
        //resibimos el numero
        int numero = sc.nextInt();
        sc.close();
        //hacemos casting para pasar numero a caracter
        char ascii = (char) numero;
        System.out.println("\n El numero " +numero+" pertenece al caracter: '" + ascii+"'");
        
    }
}
