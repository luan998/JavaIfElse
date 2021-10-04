package Dia2;

import java.util.*;

public class condicional1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade:");
		idade = read.nextInt();
		read.nextLine();//limpa o buffer de memória para ler dele depois
		System.out.printf("Entre com o seu nome:");
		nome = read.nextLine();
		System.out.printf("Seu nome: %s\n",nome);
		System.out.printf("Sua idade: %d\n",idade);
			//printf puxa mais simples as porcentagens e as variaveis direto sem ter que fazer "bla"+nome+"bla"+ e etc, com a % já puxa na ordem as coisas
			//%s puxa string, %d puxa inteiro
		if(idade>=18) 
		{
			System.out.printf("Você é maior de idade.\n");
		}
		else if(idade>=1 && idade<18)
		{
			System.out.printf("Você é menor de idade.\n");
		}
		else
		{
			System.out.println("Você entrou com uma idade inválida.\n");
		}			
	}
}
