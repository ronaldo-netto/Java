package exercicios.lista01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// Convertendo metros cubicos para litros.
		
		Scanner scan = new Scanner(System.in);
		
		double m;
		int l;
		
		
		System.out.println("Digite um valor de volume em metros cúbicos: ");
		m = Double.parseDouble(scan.nextLine());
		
		l = (int) (1000 * m);
		
		System.out.println("O resultado da conversão em litros é: " + l);
						
		scan.close();
		

	}

}
