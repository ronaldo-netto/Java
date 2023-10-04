package exercicios.lista01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	// O programa lê um número real e, em seguida, imprime.
		
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite um número real: ");
    double numero = entrada.nextDouble();
    
    System.out.println("Número digitado " + numero);
    
    entrada.close();
    
	}

}
