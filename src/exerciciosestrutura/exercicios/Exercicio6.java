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
public class Exercicio6 {
    
    public static void main(String[] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número inteiro: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número inteiro: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número inteiro: "));
        
        if (numero1 >= 100 && numero1 <= 1000){
        JOptionPane.showMessageDialog(null, "Primero número esta no range:");
        }else if(numero2 >= 100 && numero2 >= 1000){
          JOptionPane.showMessageDialog(null, "Segundo número está no range: ");
        } else if(numero3 >= 100 && numero3 >= 1000){
          JOptionPane.showMessageDialog(null, "Terceiro número está no range: ");
        }else {
           JOptionPane.showMessageDialog(null, "Nenhum número está no range ");
        }
    }
}
