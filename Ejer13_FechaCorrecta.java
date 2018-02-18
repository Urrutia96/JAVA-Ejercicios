/*
 Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
 Sin años bisiestos. El unico anio que no existe es el cero(0)
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author santos96
 */
public class Ejer13_FechaCorrecta {
    public static void main(String[] args){
        //variables donde se guardara la fecha
        int dia,mes,anio;
        //creacion de instancia de Scanner
        Scanner sc = new Scanner(System.in);
        //pedimos el dia
        System.out.println("Ingresa el dia");
        dia = sc.nextInt();
        //pedimos el mes
        System.out.println("Ingresa el mes");
        mes = sc.nextInt();
        //pedimos el anio
        System.out.println("Ingresa el año");
        anio = sc.nextInt();
        sc.close();
        //concatenamos los datos en una variales para despues solo mostrarla
        String fecha ="la fecha es correcta: "+ dia+"/"+mes+"/"+anio;
        if(anio==0){
            System.out.println("El anio no existe");
        }else{
            //solo en febrero no tiene mas de 28 dias un mes
            if ((mes==2) && (dia>=1 && dia<=28)){
                System.out.println(fecha);
            }else{
                //se verifican los meses que contienen 30 dias
                if((mes==4 || mes==6 || mes==9 ||mes==11)&&(dia>=1 && dia<=30)){
                    System.out.println(fecha);
                }else{
                    //se verifican los meses que tienen 31 dias
                    if((mes==1 || mes==3 || mes==5 || mes==7 || mes==9 || mes==12 || mes==8)&&(dia>=1 &&dia<=31)){
                        System.out.println(fecha);
                    }else{
                        System.out.println("Fecha Incorrecta: " +fecha);
                    }
                }
            }
        }
        
        
    }
}
