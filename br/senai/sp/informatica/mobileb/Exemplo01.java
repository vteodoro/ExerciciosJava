package br.senai.sp.informatica.mobileb;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Informe o  nome: ");
		String nome = console.nextLine();
		System.out.println("Informe a idade: ");
		int idade = console.nextInt();
		System.out.println("Informe a pretensao salarial: ");
		double pretSalarial = console.nextDouble();
		
		System.out.println(nome + " com a idade de " + idade + " sua pretensao salarial de R$: " 
		+ pretSalarial + " é alta.");
		
		console.close();
		
	}
	
}