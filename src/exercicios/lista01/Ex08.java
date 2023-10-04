package exercicios.lista01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//Convertendo uma temperatura em graus Kelvin para graus Celsius.
        
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em kelvin: ");
		int k = scan.nextInt();
		
		
		double c = k - 273.15;
		
		System.out.print("A temperatura em graus Celsius é: " + c);
		
		
		
		scan.close();
	}

}
