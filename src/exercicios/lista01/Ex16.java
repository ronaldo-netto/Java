package exercicios.lista01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		// Convertendo polegadas para centimetros.
		
		Scanner scan = new Scanner(System.in);
		
		double p, c;
		
		System.out.println("Digite o comprimento em polegadas: ");
		p = scan.nextDouble();
		
		c = p * 2.54;
		
		System.out.println("O comprimento em cm é: "+ c);
		
		scan.close();

	}

}
