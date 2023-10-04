package exercicios.lista01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
    //Convertendo uma temperatura de graus Celsius para graus Fahrenheit.
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em graus celsius: ");
	int c = scan.nextInt();
	
	double f = (c * 9.0/5.0) + 32.0;
	
	System.out.println("A temperatura em Fahrenheit é: " + f);
	
	scan.close();
	
	}

}
