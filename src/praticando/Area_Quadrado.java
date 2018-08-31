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
public class Area_Quadrado {
    public static void main(String[] args) {
       double area;
        double comprimento;
        double largura;
    
    comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retangulo"));
   largura=Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retangulo"));
    area= comprimento*largura;
    double  doubro_da_area= area*2;
    JOptionPane.showMessageDialog(null," a area do retangulo é: "+ area+" o dobro da sua area é: "+doubro_da_area);
    }
    
}
