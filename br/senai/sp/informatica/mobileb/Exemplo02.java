package br.senai.sp.informatica.mobileb;

import javax.swing.JOptionPane;

public class Exemplo02 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		
		String temp = JOptionPane.showInputDialog("Informe a idade: ");
		int idade = Integer.parseInt(temp);
		
		temp = JOptionPane.showInputDialog("Informe a pretensao salarial: ");
		double pret = Double.parseDouble(temp);
		
		JOptionPane.showMessageDialog(null, nome + " com a idade de " + idade + " sua pretensao salarial de R$: " 
		+ pret + " é alta.");
		
	}
}