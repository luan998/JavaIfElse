package Dia2;

import java.util.Scanner;

public class decisao2 {
	public static void main(String[] args) {
		
		int op;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de op��es...");
		System.out.println("\n1- Voc� � muito gentil...");
		System.out.println("\n2- Voc� � muito persistente...");
		System.out.println("\n3- Voc� � muito resiliente...");
		System.out.println("\n4- Voc� � muito dedicada...");
		System.out.println("\nDigite uma op��o ");
		op = read.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\nVoc� � muito gentil...");
			break;
		case 2:
			System.out.println("\nVoc� � muito persistente...");
			break;
		case 3:
			System.out.println("\nVoc� � muito resiliente...");
			break;
		case 4:
			System.out.println("\nVoc� � muito dedicada...");
			break;
		default:
			System.out.println("\nOp��o inv�lida!!!");
			break;

		}
	}
}
