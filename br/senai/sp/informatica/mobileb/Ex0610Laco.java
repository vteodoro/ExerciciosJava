package br.senai.sp.informatica.mobileb;

import java.util.Scanner;

public class Ex0610Laco {

	private static Scanner s;
	public static void main(String[] args) {
		//ex01();
		//ex02();
		//ex03();
		//ex04();
		//ex05();
	}
	
	public static void ex01() {
		for(int i = 0; i <= 1000; i += 2) {
			System.out.println(i);
		}
	}
	
	public static void ex02() {
		s = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int first = s.nextInt();
		System.out.println("Informe o último número: ");
		int last = s.nextInt();
		
		for(int i = first; i < last ; i++ ) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		s.close();
	}

	public static void ex03() {
		s = new Scanner(System.in);
		int x = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			x += s.nextInt();			
		}
		System.out.println("A soma é: " + x);
		System.out.println("A média é: " + x/5);
		
		s.close();
	}

	public static void ex04() {
		s = new Scanner(System.in);
		System.out.println("Informe a quantidade: ");
		int i = s.nextInt();
		int x;
		int maior = 0;
		
		for(int j = 0; j < i ; j ++) {
			System.out.println("Informe um número: ");
			x = s.nextInt();
			if(x > maior) {
				maior = x;
			}
		}
		System.out.println("O  maior é: " + maior);
		s.close();
	}

	public static void ex05() {
		s = new Scanner(System.in);
		for(int i = 1; i != 0; i++) {
			System.out.println("Informe o salário: ");
			double sal = s.nextInt();
			/*
			if(sal == 0) {
				break;
			}else if(sal < 500) {
				sal += sal * 0.2;
				System.out.println("O salário com aumento é: " + sal);
			}else {
				sal += sal * 0.1;
				System.out.println("O salário com aumento é: " + sal);
			}*/
			sal = sal * (sal <= 500 ? 1.2 : 1.1);
			System.out.println("O salário com aumento é: " + sal);
		}
		
		s.close();
	}
}
