/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosestrutura.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author gu
 */
public class Exercicio10 {
    
    public static boolean nota(double notaProfessor, double notaProvaGeral){
      return(notaProfessor >= 6 || notaProvaGeral >= 6);  
    }
    public static void main(String[] args){
        double notaProfessor = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do professor: "));
        double notaProvaGeral = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova geral: "));
        
        if(nota(notaProfessor, notaProvaGeral) == true){
            JOptionPane.showMessageDialog(null, "Nota acima ou na média;");
        } else {
            JOptionPane.showMessageDialog(null, "Nota abaixo da média");
        }
    }
}