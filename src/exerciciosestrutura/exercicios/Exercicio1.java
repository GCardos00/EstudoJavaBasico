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
public class Exercicio1 {
    public static void main(String[] args){
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano em que estamos: "));
        int idade = anoAtual - anoNasc;
        
        JOptionPane.showMessageDialog(null, "Sua idade é: " +idade);
        
    }
}
