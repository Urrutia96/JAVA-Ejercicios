/*
5. Pedir 2 numeros por teclado e indicar si uno es mayor que el otro o si son iguales.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author osmin
 */
public class Ejer05_MayorOMenor {
    public static void main(String[] args){
        //Instanciamos la clase que nos permite pedir datos por consola
        Scanner sc = new Scanner(System.in);
        //Pedimos los numeros para luego compararlos
        System.out.println("Introduzca el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = sc.nextInt();
        sc.close();
        //si el primer numero es mayor al segundo 
        if(num1 > num2){
            System.out.println(num1+" es mayor que " + num2);
        //si el primero es menor al segundo
        }else if(num1< num2){
            System.out.println(num2+" es mayor que " + num1);
        //sino cumple ninguna de las anteriores, es porque son iguales
        }else{
            System.out.println("Los numero son iguales");
        }
    }
}
