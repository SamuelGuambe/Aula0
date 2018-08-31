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
public class Calculo_Area {
    public static void main(String[] args) {
     double area;
     double raio;
       raio = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do  raio"));
        area =Math.PI*Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null," a area do circulo é " +area);
    }
}
