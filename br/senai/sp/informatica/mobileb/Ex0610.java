package br.senai.sp.informatica.mobileb;

import java.util.Scanner;

public class Ex0610 {
	private static Scanner s;
	public static void main(String[] args) {
		//mediaArit();
		//triangulo();
		//bhaskara();
		//sitFinal();
	}
	
	public static void mediaArit() {
		s = new Scanner(System.in);
		System.out.println("Informe a nota: ");
		double media = s.nextDouble();
		System.out.println("Informe a nota: ");
		media += s.nextDouble();
		System.out.println("Informe a nota: ");
		media += s.nextDouble();
		System.out.println("Informe a nota: ");
		media += s.nextDouble();
		
		media /= 4;
		
		if(media >= 7) {
			System.out.println(media + "\nAprovado");
		}else {
			System.out.println(media + "\nReprovado");
		}
	}
	
	public static void triangulo() {
		s = new Scanner(System.in);
		System.out.println("Primeiro lado: ");
		int a = s.nextInt();
		System.out.println("Segundo lado: ");
		int b = s.nextInt();
		System.out.println("Terceiro lado: ");
		int c = s.nextInt();
		
		int difbc = b - c;
		int difac = a - c;
		int difab = a - b;
		int s1 = b + c;
		int s2 = a + c;
		int s3 = a + b;
		
		if(!(Math.abs(difbc) < a && a < s1) && !(Math.abs(difac) < b && b < s2) && !(Math.abs(difab) < c && c < s3)) {
			System.out.println("Triângulo não existe.");
		}else 
			
		if(a == b && b == c) {
			System.out.println("Equilatero");
		}else if(a != b && a != c && b != c) {
			System.out.println("Escaleno");
		}else {
			System.out.println("Isósceles");
		}
	}

	public static void bhaskara() {
		s = new Scanner(System.in);
		System.out.println("Informe o valor de a: ");
		int a = s.nextInt();
		System.out.println("Informe o valor de b: ");
		int b = s.nextInt();
		System.out.println("Informe o valor de c: ");
		int c = s.nextInt();
		
		int delta = b * b - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Não é possível calcular.");
		}else {
			int x1 = (int) ((- b + Math.sqrt(delta)) / 2 * a);
			int x2 = (int) ((- b - Math.sqrt(delta)) / 2 * a);
			System.out.println(x1 + "\n" + x2);
		}
	}
	
	public static void sitFinal() {
		s = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = s.nextLine();
		System.out.println("Informe a 1ª nota: ");
		double media = s.nextDouble();
		System.out.println("Informe a 2ª nota: ");
		media += s.nextDouble();
		System.out.println("Informe a 3ª nota: ");
		media += s.nextDouble();
		System.out.println("Informe o número de faltas: ");
		int faltas = s.nextInt();
		
		media /= 3;
		
		if(media >= 7 && faltas <= 15) {
			System.out.println(nome + ", você foi aprovado!");
		}else {
			System.out.println(nome + ", você foi reprovado!");
		}
		
	}
	
}