/*
 Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] /
altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
Valor de IMC Diagnóstico
< 16 Criterio de ingreso en hospital
de 16 a 17 infrapeso
de 17 a 18 bajo peso
de 18 a 25 peso normal (saludable)
de 25 a 30 sobrepeso (obesidad de grado I)
de 30 a 35 sobrepeso crónico (obesidad de grado II)
de 35 a 40 obesidad premórbida (obesidad de grado III)
>40 obesidad mórbida (obesidad de grado IV)
 */
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author Santos Osmin Urrutia Iraheta
 */
public class Ejer06_MasaCorporal {
    public static void main(String[] args) {
        System.out.println("MASA CORPORAL");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el pero en Kg: ");
        double peso = sc.nextDouble();
        System.out.println("Introduzca la altura (en centimetros): ");
        double altura = sc.nextDouble()/100;
        sc.close();
        double imc = peso /(altura*altura);
        System.out.println("El estado de la persona en funcion del IMC: ");
        if(imc<16){ System.out.println("Criterio de ingreso en hospital");
        }else if(imc<17){ System.out.println("Infrapeso");
        }else if(imc<18){ System.out.println("Bajo peso");
        }else if(imc<25){ System.out.println("Peso normal(saludable)");
        }else if(imc<30){ System.out.println("Sobrepeso(Obesidad de grado I)");
        }else if(imc<35){ System.out.println("Sobrepeso Crónico(Obesidad de grado II)");
        }else if(imc<40){ System.out.println("Obesidad Premórbida (Obesidad de grado III)");
        }else{  System.out.println("Obesidad Mórbida (Obesisdad de grado IV)");
        }
        
    }
}
