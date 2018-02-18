/*
Indicar si un numero pasado por consola es par o no
 */
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author osmin
 */
public class Ejer04_ParONoPar {
    public static void main(String[] args) {
        //Instanciamos la clase que nos permite pedir datos por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el numero que quieres saber si es par o no");
        int numero = sc.nextInt();
        sc.close();
        //con el operador (%) Mod, resivimos el residuo de dividir entre 2 numeros
        //si se optiene el residuo de 0 es por que es par, de lo contrario 
        //si de la operacion el residuo es mas que cero, eso indica que es impar.
        if (numero%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es Impar");
        }
    }
}
