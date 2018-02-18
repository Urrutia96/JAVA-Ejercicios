
//2. Realizar la suma, resta, multiplicacion, division y resto de dos numeros.
package Ejercicios;

import java.util.Scanner;
/**
 * @author osmin
 */
public class Ejer02_OperacionesBasicas {
    private double resultado;
    
    public static void main(String[] args) {
        boolean exit=true;
        do {            
            System.out.println("Elija que operacion quiere hacer.\n");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("5: Residuo");
            System.out.println("6: Salir");
            Scanner sc = new Scanner(System.in);
            //Se resive el numero de la operacion que se quiere realizar
            int opcion = sc.nextInt();
            if (opcion ==6){
                exit=false;
            }
            if ((opcion<6) && (opcion>0)){
            //Se resiven los dos valores que se van a operar
            double val1, val2 = 0;
            System.out.println("Digite el primer valor a operar");
            val1 = sc.nextDouble();
            System.out.println("Digite el segundo valor a operar");
            val2 = sc.nextDouble();
            System.out.println("El Resultado Es:");
            sc.close();
            //instanciamos la misma clase para poder usar los metodos
            Ejer02_OperacionesBasicas e2 = new Ejer02_OperacionesBasicas();
            //ya resivida la operacion que se quiere hacer
            //evaluamos que metodo llamaremos con el operacdor Switch
            switch(opcion){
                case 1:
                    System.out.println(e2.suma(val1,val2));
                    break;
                case 2:
                    System.out.println(e2.resta(val1, val2));
                    break;
                case 3:
                    System.out.println(e2.multiplicacion(val1,val2));
                    break;
                case 4:
                    System.out.println(e2.division(val1, val2));
                    break;
                case 5:
                    System.out.println(e2.residuo(val1, val2));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Por favor Dijite un numero de la lista /n /n");
                    break;
            }
            }
        } while (exit);
        
    }
    
    public double suma(double val1, double val2){
        this.resultado = val1 + val2; 
        return resultado;
    }
    public double resta(double val1, double val2){ 
        this.resultado = val1-val2;
        return this.resultado;
    }
    
    public double multiplicacion(double val1, double val2){
        this.resultado = val1 * val2;
        return this.resultado;
    }
    
    public double division(double val1, double val2){
        this.resultado = val1/val2;
        return this.resultado;
    }
    
    public double residuo(double val1, double val2){
        this.resultado = val1%val2;
        return this.resultado;
    }
}
