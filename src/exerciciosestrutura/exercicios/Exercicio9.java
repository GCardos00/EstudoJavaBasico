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
public class Exercicio9 {
    public static void main(String[] args){
         int projetos = Integer.parseInt(JOptionPane.showInputDialog("Selecione \n 1: Para acrescimo de 30% \n 2: Para acrescimo de 40% \n 3: Para acrescimo de 50% \n 4: Para acrescimo de 60%"));
	switch(projetos) {
	case 1 :
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario: "));
                double salarioTot = salario + (salario * 30/100);
                JOptionPane.showMessageDialog(null, "O salario total com o acrescimo de 30% é "+salarioTot);
		break;
	case 2 :
		double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario: "));
                double salarioTot1 = salario1 + (salario1 * 40/100);
                JOptionPane.showMessageDialog(null, "O salario total com o acrescimo de 40% é "+salarioTot1);
		break;
	case 3 :
		double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario: "));
                double salarioTot2 = salario2 + (salario2 * 50/100);
                JOptionPane.showMessageDialog(null, "O salario total com o acrescimo de 50% é "+salarioTot2);
		break;
        case 4 :
                double salario3 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario: "));
                double salarioTot3 = salario3 + (salario3 * 60/100);
                JOptionPane.showMessageDialog(null, "O salario total com o acrescimo de 60% é "+salarioTot3);
                break;
	}
    }
}
