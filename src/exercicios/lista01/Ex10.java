package exercicios.lista01;

import java.util.Scanner;

public class Ex10{

	public static void main(String[] args) {
		
		// Convertendo uma velocidade de km/h para m/s.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a velocidade em km/h: ");
		double km = scan.nextDouble();

		double m =  + km / 3.6;

		System.out.print("A velocidade em metros por segundo é " + m);
		System.out.printf("%.5f", m);
		scan.close();
	}

}
