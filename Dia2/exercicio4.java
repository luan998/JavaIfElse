package Dia2;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		double n;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor:");
		n = read.nextDouble();
		
		if(n%2==0) {
			System.out.printf("O resultado é %.2f",Math.sqrt(n));
		}
		else {
			System.out.printf("O resultado é %.2f",Math.pow(n, 2));
		}
	}
}
