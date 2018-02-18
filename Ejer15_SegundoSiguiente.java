/*
    Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente
*/
package Ejercicios;
import java.util.Scanner;

/**
 *
 * @author Santos Osmin Urrutia Iraheta
 */
public class Ejer15_SegundoSiguiente {
    public static void main(String[] args){
        int hora,minuto,segundo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hora");
        hora = sc.nextInt();
        System.out.println("Minuto");
        minuto = sc.nextInt();
        System.out.println("Segundo");
        segundo = sc.nextInt();
        String siguiente = "";
        if ((segundo +1) >=60){
            if((minuto+1)>=60){
                if((hora>24)){
                    hora=0;
                }else{
                    siguiente = (hora+1) +"/"+"0/1";
                }
            }else{
                siguiente =hora+"/"+(minuto+1)+"/1";
            }
        }else{
            siguiente = hora+"/"+minuto+"/0";
        }
        
        System.out.println(siguiente);
    }
}
