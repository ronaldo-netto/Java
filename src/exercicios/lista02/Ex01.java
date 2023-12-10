package exercicios.lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int numero; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = Integer.parseInt(scan.nextLine());
		
		System.out.println("O número digitado foi " + numero);
		
		scan.close();

	}

}
