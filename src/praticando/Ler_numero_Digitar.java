/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticando;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Isaias Guambe
 */
public class Ler_numero_Digitar {
    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("digita um numero"));
       JOptionPane.showMessageDialog(null," o numero digitado e: "+ numero);
    }
}
