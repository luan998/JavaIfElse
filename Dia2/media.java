package Dia2;

import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = read.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = read.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = read.nextFloat();
		//PRINTF LÊ COM A VÍRGULA, O RESTO O + FUNCIONA
		media = (n1+n2+n3)/3;
		System.out.printf("\nMédia: %2.2f",media);//tem que usar a vírgula caso arredonde e mostre um valor depois
		//%f para ver quantas casas decimais passa pra esquerda e direita
		
		if(media>=7 && media<=10) {
			System.out.println("\nParabéns, você passou!!!");
		}
		else if(media>=5 && media<7) {
			System.out.println("\nVocê está de recuperação!!!");
		}
		else {
			System.out.println("\nVocê foi reprovade!!!");
		}
		
	}
}
