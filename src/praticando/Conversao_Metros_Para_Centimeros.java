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
public class Conversao_Metros_Para_Centimeros {
    public static void main(String[] args) {
        double cm;
        double metros;
     metros = Integer.parseInt(JOptionPane.showInputDialog(" Entra com a quantidade de metros "));
    // 1m = 100cm
     cm = metros*100;
    JOptionPane.showMessageDialog(null,+ metros+" metro, coresponde a "+cm+" cm");
    }
}
