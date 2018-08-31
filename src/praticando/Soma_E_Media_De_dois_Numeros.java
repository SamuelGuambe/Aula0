/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticando;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Isaias Guambe
 */
public class Soma_E_Media_De_dois_Numeros {
    public static void main(String[] args) {
        
        double numero1;
        double numero2;
        double soma;
        double media;
       
   numero1 =Integer.parseInt(JOptionPane.showInputDialog("entra com o primeiro numero"));
   numero2 =Integer.parseInt(JOptionPane.showInputDialog("entra com o segundo numero"));
   
   soma = (numero1+numero2);
    media = (numero1+numero2)/2;
    
   //JOptionPane.showMessageDialog(null,"a soma dos numeros: "+numero1+" e "+numero2+" é  =   "+ soma);
   //JOptionPane.showMessageDialog(null,"a media dos numeros: "+numero1+" e "+numero2+" é  =   "+ media);
    JOptionPane.showMessageDialog(null,"a soma dos numeros: "+numero1+" e "+numero2+" é  =   "+ soma+
            "  e a sua media : "+" é  =   "+ media);
    
    }
}
