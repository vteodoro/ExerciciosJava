package br.senai.sp.informatica.mobileb;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1010 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] lista = new String[3];
		int indice = 0;

		System.out.println("Informe o " + (indice+1) + "º Nome: ");
		String nome = s.nextLine();

		while(!nome.equals("fim")) {
			if(indice >= lista.length) {
				lista = Arrays.copyOf(lista, lista.length + 3);
			}
			lista[indice++] = nome;

			System.out.print("Informe o " + (indice+1) + "º Nome: ");
			nome = s.nextLine();
		}

		//Arrays.sort(lista);
		
		for(int i = 0; i < indice ; i++) {
			for(int j = 0; j < indice-1 ; j++) {
				if(lista[j].compareTo(lista[j+1]) > 0) {
					String temp = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = temp;
				}
			}
		}

		String texto = "";
		for (int i = 0; i < indice; i++) {
			texto += lista[i] + "\n";
		}
		System.out.println(texto);

		s.close();
	}
}