package Dia2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro inteiro: ");
		n1 = read.nextInt();
		System.out.println("Entre com o segundo inteiro: ");
		n2 = read.nextInt();
		System.out.println("Entre com o terceiro inteiro: ");
		n3 = read.nextInt();
		
		if(n1<n2)
		{
			if(n2<n3) {
				System.out.printf("Os números na ordem são: \n%d \n%d \n%d",n1,n2,n3);
			}
			else if(n1<n3)	{
				System.out.printf("Os números na ordem são: \n%d \n%d \n%d",n1,n3,n2);
			}
			else {
				System.out.printf("Os números na ordem são: \n%d \n%d \n%d",n3,n1,n2);
			}
		}
		else if(n2<n3) {
			if(n1<n3) {
				System.out.printf("Os números na ordem são: \n%d \n%d \n%d",n2,n1,n3);
			}
			else {
				System.out.printf("Os números na ordem são: \n%d \n%d \n%d",n2,n3,n1);
			}
		}
		else {
			System.out.printf("Os números na ordem são: \n%d \n%d \n%d",n3,n2,n1);
		}
	}
}
