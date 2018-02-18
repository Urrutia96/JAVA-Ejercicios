
package Ejercicios;
/*
    Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente
*/
import java.util.Scanner;
/**
 *
 * @author Santos Osmin Urrutia Iraheta
 */
public class Ejer15_SegundoSiguienteF2 {
    public static void main(String[] args) {
         int hora,minuto,segundo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hora");
        hora = sc.nextInt();
        System.out.println("Minuto");
        minuto = sc.nextInt();
        System.out.println("Segundo");
        segundo = sc.nextInt();
        
        
        segundo++;
        if(segundo >=60){
            segundo =0;
            minuto++;
            if(minuto>=60){
                minuto = 0;
                hora++;
                if(hora>=24){
                    hora = 0;
                }
            }
        }
        
        System.out.println(hora+"/"+minuto+"/"+segundo);
    }
}
