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
public class Exercicio7 {
    public static void main(String[] args){
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        
        if (valor1 > valor2){
            double valor3 = valor1 - valor2;
            JOptionPane.showMessageDialog(null, "O resultado é " +valor3);
        } else {
            double valor3 = valor2 - valor1;
            JOptionPane.showMessageDialog(null, "O resultado é "+valor3);
        }
    }
}
