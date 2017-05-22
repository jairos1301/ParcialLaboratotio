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
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        int div = num1/num2;
        System.out.println("El resultado de "+num1+"/"+num2+" es: "+div);
    }
    
}
