/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallaboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author usuariomac
 */
public class ParcialLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PERMITE DIVIDIR DOS NUMEROS");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        double div = num1/num2;
        System.out.println("El resultado de "+num1+"/"+num2+" es: "+div);
        if (num1 < num2) {
            System.out.println("El numero "+num2+" es mayor que "+num1);
        } else {
            System.out.println("El numero "+num1+" es mayor que "+num2);
        }
    }
    
}
