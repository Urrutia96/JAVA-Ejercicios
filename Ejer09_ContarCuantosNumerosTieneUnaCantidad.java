/*
    9. Pedir una cantidad, si la cantidad tiene mas de un digito sumar digito 
    mas digito, si la suma de todos los digitos da como resultado una cantidad 
    de mas de un digito, repetir el proceso hasta que el resultado llegue a una
    cantidad de un solo digito.
    ejemplo:   458695849584958
    Respuesta: 4+5+8+6+9+5+8+4+9+5+8+4+9+5+8=97->9+7=16->1+6=7
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Santos Osmin Urrutia Iraheta
 */
public class Ejer09_ContarCuantosNumerosTieneUnaCantidad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe una cantidad: ");
        String cantidad = sc.next();
        sc.close();
        int contador=0;
        int conversion=0;
        boolean repetir = true;
        while (repetir){
            for (int i = 0; i < cantidad.length(); i++) {
                conversion= Integer.parseInt(String.valueOf(cantidad.charAt(i)));
                System.out.print(conversion+"+");
                contador = contador + conversion;
            }
            cantidad = String.valueOf(contador);
            System.out.println("="+contador);
            contador=0;
            if (cantidad.length()>1){
                repetir =true;
            }else{
                repetir=false;
            }
        }
    }
}
