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
public class Exercicio4 {
    public static void main(String[] args){
        double invest = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de investimento: "));
        double rendiment = invest * 0.013; 
        double total = invest + rendiment;
        JOptionPane.showMessageDialog(null, "Seu investimento rendeu " +rendiment + " e seu valor total na poupança é de " +total);
    }
}
