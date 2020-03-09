package aula_01;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada_dados = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int num1 = entrada_dados.nextInt();
		System.out.println("Digite o segundo valor:");
		int num2 = entrada_dados.nextInt();
		System.out.println("Digite o terceiro valor:");
		int num3 = entrada_dados.nextInt();
		entrada_dados.close();
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Maior número: " + num1);
		}	
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Maior número: " + num2);
		}
		else {
			System.out.println("Maior número: " + num3);
		}
	}
}
