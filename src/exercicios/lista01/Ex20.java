package exercicios.lista01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double k , l;
			
		System.out.println("Digite a massa em quilogramas: ");
		k = Double.parseDouble(scan.nextLine());
		
		l = k / 0.45;
		
		System.out.printf("O valor convertido para libras é: %.4f ", l);
			
		scan.close();

	}

}
