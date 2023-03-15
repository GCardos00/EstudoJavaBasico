/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosestrutura.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio12 {
    public static void main(String[] args) {
        
        double tempe1 = Double.parseDouble(JOptionPane.showInputDialog("Insira uma temperatura: "));
        double tempe2 = Double.parseDouble(JOptionPane.showInputDialog("Insira mais uma temperatura: "));
        double tempe3 = Double.parseDouble(JOptionPane.showInputDialog("Insira novamente uma temperatura: "));
        
    if(tempe1 < 0) {
        JOptionPane.showMessageDialog(null, "Temperatura 1 é abaixo de 0");
    } else {
        JOptionPane.showMessageDialog(null, "Temperatura 1 é acima de 0");
    }
    
    if(tempe2 < 0) {
        JOptionPane.showMessageDialog(null, "Temperatura 2 é abaixo de 0");
    } else {
        JOptionPane.showMessageDialog(null, "Temperatura 2 é acima de 0");
    }
    
    if(tempe3 < 0) {
        JOptionPane.showMessageDialog(null, "Temperatura 3 é abaixo de 0");
    } else {
        JOptionPane.showMessageDialog(null, "Temperatura 3 é acima de 0");
    }
    }
}
  