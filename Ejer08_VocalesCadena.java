/*
   8. Pedir una cadena y mostar cuantas vocales tiene
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 * @author Santos Osmin Urrutia Iraheta
 */
public class Ejer08_VocalesCadena {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Info", JOptionPane.INFORMATION_MESSAGE);
        cadena = cadena.toLowerCase();
        char[] vocales = {'a','e','i','o','u'};
        int contadorVocales=0;
        boolean esVocal;
        for(int i=0; i<cadena.length();i++){
            esVocal=false;
            for(int j=0;j<vocales.length && !esVocal;j++){
                if (vocales[j]==cadena.charAt(i)){
                    contadorVocales++;
                    esVocal= true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "numero de vocales: "+contadorVocales , cadena, JOptionPane.INFORMATION_MESSAGE);
    }
}
