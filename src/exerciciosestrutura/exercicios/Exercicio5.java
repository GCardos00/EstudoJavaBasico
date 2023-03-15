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
public class Exercicio5 {
    public static void main(String[] args){
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario: "));
        double acrescimo = salario + (salario * 20/100);
        
        JOptionPane.showMessageDialog(null, "Seu salario teve um acrescimo de "+acrescimo+ " e o valor total ficou "+salario);
    }
    
}
