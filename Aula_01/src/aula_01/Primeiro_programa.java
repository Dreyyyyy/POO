package aula_01;

import java.util.Scanner;

public class Primeiro_programa {
	public static void main(String[] args) {
		Scanner entrada_dados = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = entrada_dados.nextLine();
		System.out.println("Digite seu sexo:");
		String sexo = entrada_dados.nextLine();
		System.out.println("Digite seu estado civil:");
		String estado_c = entrada_dados.nextLine();
		System.out.println("Digite a quantidade de filhos:");
		int filhos = entrada_dados.nextInt();
		entrada_dados.nextLine();//Limpar o buffer, consumindo a quebra de linha do "nextInt" anterior
		System.out.println("Digite sua escolaridade:");
		String escolaridade = entrada_dados.nextLine();
		System.out.println("Digite sua renda mensal:");
		float salario = entrada_dados.nextFloat();
		entrada_dados.close();
		System.out.println("-------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civíl: " + estado_c);
		System.out.println("Quantidade de filhos: " + filhos);
		System.out.println("Escolaridade: " + escolaridade);
		System.out.printf("Renda mensal: R$%.2f\n", salario);
	}
}