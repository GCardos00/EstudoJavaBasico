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
public class Exercicio2 {
    public static void main(String[] args){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia em que nasceu: "));
        int mês = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês em que nasceu: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano em que nasceu: "));
        
        JOptionPane.showMessageDialog(null, "Você nasceu no dia "+dia+"/"+mês+"/"+ano);
    }
}
