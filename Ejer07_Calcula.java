/*
7. 
 */
package Ejercicios;

/**
 *
 * @author osmin
 */
public class Ejer07_Calcula {

    public static void main(String[] args) {
        char c;
        int a, b;
        c = args[0].charAt(0);
        a = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[2]);
        switch (c) {
            case 'S':
            case 's':
                System.out.println("Resultado de la suma: " + (a + b));
                break;
            case 'R':
            case 'r':
                System.out.println("Resultado de la resta: " + (a - b));
                break;
            case 'M':
            case 'm':
            case 'P':
            case 'p':
                System.out.println("Resultado del producto: " + a * b);
                break;
            case 'D':
            case 'd':
                System.out.println("Resultado de la division: " + a / b);
                break;
            default:
                System.out.println("Por favor, indica la operacion");
                break;
        }
    }
}
