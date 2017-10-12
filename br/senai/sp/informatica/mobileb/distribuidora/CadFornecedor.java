package br.senai.sp.informatica.mobileb.distribuidora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFornecedor {

	private static Scanner s;
	public static void main(String[] args) {
		List<Fornecedor> lista = new ArrayList<>();
		s = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = s.nextLine();
		
		while(!nome.equals("end")) {
			
			System.out.println("Informe o id: ");
			int ident = s.nextInt();
			System.out.println("Informe o endereco: ");
			String ender = s.nextLine();
			
			Fornecedor fr = new Fornecedor(nome, ident, ender);
			
			lista.add(fr);
			
			System.out.println("Informe o nome: ");
			nome = s.nextLine();
		}
		
		String txt = "";
		for(Fornecedor fr : lista) {
			txt += fr + "\n";
		}
		System.out.println(txt);
		
	}
	
}
