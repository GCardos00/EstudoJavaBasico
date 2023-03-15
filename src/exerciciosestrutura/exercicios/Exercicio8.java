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
public class Exercicio8 {
    public static void main(String[] args){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da primeira avaliação: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da segunda avaliação: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da terceira avaliação: "));
        double ntFinal = (n1 + n2 + n3)/3;
        
        if(ntFinal >= 6){
            JOptionPane.showMessageDialog(null, "Parabéns, o aluno está aprovado.");
        } else {
            JOptionPane.showMessageDialog(null, "Infelizmente o aluno não bateu a média, ele está de recuperação.");
            double n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova recuperativa: "));
            double ntRec = (n1 + n2 + n3 + n4)/ 4;
            if(ntRec >= 6){
                JOptionPane.showMessageDialog(null, "Parabéns, o aluno está aprovado.");
            } else{
                JOptionPane.showMessageDialog(null, "O aluno está reprovado.");
            }
        }
    }
}
