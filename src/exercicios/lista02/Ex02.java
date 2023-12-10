package exercicios.lista02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		double numero; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número real: ");
		numero = Double.parseDouble(scan.nextLine());
		
		System.out.println("O número digitado foi " + numero);
		
		scan.close();

	}

}
