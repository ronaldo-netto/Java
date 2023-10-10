package exercicios.lista01;

import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		
		// Convertendo uma velocidade de m/s para km/h.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a velocidade em m/s :  ");
		double m = scan.nextDouble();
		
		double km = m * 3.6;
		
		System.out.print("A velocidade em km/h é : " + km);
				
		scan.close();
	}

}
