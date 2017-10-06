package br.senai.sp.informatica.mobileb;

import javax.swing.JOptionPane;

public class Ex0410 {
	
	public static void main(String[] args) {
		
		//PDF 01
		//potencia();
		//media();
		//area();
		
		//PDF 02
		//volume();
		//numInvertido();
		//cedulas();
		
	}
	
	public static void potencia() {
		String aux = JOptionPane.showInputDialog("Informe a base: ");
		double base = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe o expoente: ");
		double exp = Integer.parseInt(aux);
		double resp = Math.pow(base, exp);
		JOptionPane.showMessageDialog(null, "O total é: " + resp);
	}
	
	public static void media() {
		String aux = JOptionPane.showInputDialog("Informe a primeira nota: ");
		double n1 = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe a segunda nota: ");
		double n2 = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe a terceira nota: ");
		double n3 = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe a quarta nota: ");
		double n4 = Double.parseDouble(aux);
		double resp = (n1 + n2 + n3 + n4)/4;
		JOptionPane.showMessageDialog(null, "A media é: " + resp);
	}
	
	public static void area() {
		String aux = JOptionPane.showInputDialog("Informe a base: ");
		double base = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe a altura: ");
		double alt = Double.parseDouble(aux);
		double resp = (base * alt)/2;
		JOptionPane.showMessageDialog(null, "A área do triângulo é: " + resp);
	}

	public static void volume() {
		String aux = JOptionPane.showInputDialog("Informe a largura: ");
		double larg = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe o comprimento: ");
		double comp = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Informe a profundidade: ");
		double prof = Double.parseDouble(aux);
		double preco = (larg * comp * prof) * 45;
		
		JOptionPane.showMessageDialog(null, "O preço final é de: R$" + preco);
	}

	public static void numInvertido() {
		String aux = JOptionPane.showInputDialog("Informe um número de 3 digitos: ");
		int numero = Integer.parseInt(aux);
		
		int a = numero / 10;
		int b = numero % 10;
		int c = a / 10;
		a %= 10;

		/*while(num > 0){
			inv = inv * 10 + num % 10;
			num = num / 10;
		}*/
		
		JOptionPane.showMessageDialog(null, "Número invertido: " + b + a + c);
	}

	public static void cedulas() {
		String aux = JOptionPane.showInputDialog("Informe o valor do saque: ");
		int saque = Integer.parseInt(aux);
		int cem, cinq, vinte, dez, cinco, dois, um, x;
		
		cem = saque/100;
		x = saque % 100;
		cinq = x / 50;
		x %= 50;
		vinte = x / 20;
		x %= 20;
		dez = x / 10;
		x %= 10;
		cinco = x /5;
		x %= 5; 
		dois = x / 2;
		x %= 2;
		um = x;
		
		JOptionPane.showMessageDialog(null,"O valor do saque foi de: " + saque + "\nNotas de 100: " + cem + "\nNotas de 50: " + 
		cinq + "\nNotas de 20: " + vinte + "\nNotas de 10: " + dez + "\nNotas de 5: " + 
		cinco + "\nNotas de 2: " + dois + "\nNotas de 1: " + um);
		
		
	}
	
}