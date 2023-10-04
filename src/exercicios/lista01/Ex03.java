package exercicios.lista01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
    //O programa lê três números inteiros e, em seguida, imprime a soma deles.
    
    Scanner scan = new Scanner(System.in);
    
    int n1, n2, n3;
    
    System.out.print("Digite três números inteiros: ");
    n1 = scan.nextInt();
    n2 = scan.nextInt();
    n3 = scan.nextInt();
    
    int soma = n1 + n2 + n3;
    
    System.out.println("A soma dos números digitados é: " + soma);
    
    scan.close();
    
	}

}
