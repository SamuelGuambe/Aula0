/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticando;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Salario_Por_Hora {
    public static void main(String[] args) {
        double valor_por_hora;
        double quant_horas;
        double salario;
        double DIA= 8;
        /*
        * caculo de salario, conhecendo o valor que ganhas por hora e horas trabalhados
        */
        
        valor_por_hora= Integer.parseInt(JOptionPane.showInputDialog(" Escreva o valor que ganhas por horas"));
    quant_horas = Integer.parseInt(JOptionPane.showInputDialog(" Escreve a quantidade de horas do trabaho"));
    
    salario = valor_por_hora*quant_horas;
    JOptionPane.showMessageDialog(null,"O seu salario corespondente e: " +salario);
   
    /*
    * cacula quanto ganha por hora, sabendo o salario mensal
    */
    salario = Integer.parseInt(JOptionPane.showInputDialog("Escreva o seu salario"));
    quant_horas = Integer.parseInt(JOptionPane.showInputDialog(" Escreve a quantidade de horas do trabaho")); 
   
    valor_por_hora= salario/quant_horas;
    JOptionPane.showConfirmDialog(null, "Voce ganha: "+valor_por_hora+ " MTN por hora");
    }
  
}
