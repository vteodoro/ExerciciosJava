package br.senai.sp.informatica.mobileb;

import java.util.Scanner;

public class Ex0510 {
	
	private static Scanner s;

	public static void main(String[] args) {
		//igual();
		//par();
		//divisivel();
		//salLiquido();
		//ordenar();
		//nadador();
		
	}

	public static void igual() {
		s = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		int n1 = s.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int n2 = s.nextInt();
		
		if(n1 == n2) {
			System.out.println("N�meros iguais.");
		}else {
			System.out.println("N�meros diferentes.");
		}
	}
	
	public static void par() {
		s = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int n = s.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("N�mero par.");
		}else {
			System.out.println("N�mero impar.");
		}
		
	}	
	
	public static void divisivel() {
		
		s = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		int n1 = s.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int n2 = s.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.println("� divis�vel.");
		}else {
			System.out.println("N�o � divis�vel.");
		}
	}
	
	public static void salLiquido() {
		s = new Scanner(System.in);
		System.out.println("Informe o sal�rio bruto: ");
		double sal = s.nextDouble();
		
		if(sal < 300.0) {
			sal *= 0.95;
		}
		else if(sal <= 1200.0) {
			sal *= 0.9;
		}
		else {
			sal *= 0.85;
		}
		
		System.out.println("O sal�rio l�quido �: " + sal);
	}
	
	public static void ordenar() {
		s = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		int n1 = s.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int n2 = s.nextInt();
		
		if(n1 > n2) {
			System.out.println(n2 + " " + n1);
		}else {
			System.out.println(n1 + " " + n2);
		}
	}
	
	public static void nadador() {
		s = new Scanner(System.in);
		System.out.println("Informe a idade: ");
		int idade = s.nextInt();
		String c;
		
		if(idade <= 10) {
			c = "Infantil";
		}else if(idade <= 15) {
			c = "Infanto";
		}else if(idade <= 18) {
			c = "Juvenil";
		}else {
			c = "Adulto";
		}
		System.out.println("Sua classifica��o �: " + c);
	}
}