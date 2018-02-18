/*
Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
días.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Santos Osmin Urrutia Iraheta
 */
public class Ejer14_DiasdeDiferencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia1,dia2,mes1,mes2,anio1,anio2;
        System.out.println("Primera fecha");
        System.out.println("Ingresa el dia");
        dia1=sc.nextInt();
        System.out.println("Ingresa el mes");
        mes1 = sc.nextInt();
        System.out.println("Ingresa el año");
        anio1 = sc.nextInt();
        
        System.out.println("Segunda fecha");
        System.out.println("Ingresa el dia");
        dia2=sc.nextInt();
        System.out.println("Ingresa el mes");
        mes2 = sc.nextInt();
        System.out.println("Ingresa el año");
        anio2 = sc.nextInt();
        
        int total= dia1-dia2 + 30*(mes1-mes2) +365*(anio1-anio2);
        System.out.println("La diferencia es de :"+ total+" dias.");
    }
}
