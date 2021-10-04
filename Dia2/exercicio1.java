package Dia2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		int n1,n2,n3,maior=0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro inteiro: ");
		n1 = read.nextInt();
		System.out.println("Entre com o segundo inteiro: ");
		n2 = read.nextInt();
		System.out.println("Entre com o terceiro inteiro: ");
		n3 = read.nextInt();
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.printf("O maior número é %d.",n1);
		}
		else if(n2>n1 && n2>=n3)
		{
			System.out.printf("O maior número é %d.",n2);
		}
		else {
			System.out.printf("O maior número é %d.",n3);
		}
		
	}
}
