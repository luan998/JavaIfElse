package Dia2;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		int idade;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade = read.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.printf("Você tem %d anos e está na categoria infantil",idade);
		}
		else if(idade>=15 && idade<=17){
			System.out.printf("Você tem %d anos e está na categoria juvenil",idade);
		}
		else if(idade>=18 && idade<=25){
			System.out.printf("Você tem %d anos e está na categoria adulto",idade);
		}
		else {
			System.out.println("Você não está em nenhuma categoria ou digitou sua idade incorretamente.");
		}
	}
}
