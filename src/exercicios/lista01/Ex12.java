package exercicios.lista01;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
    	
    	//Convertendo uma distância em milhas para quilômetros.
    	
    	Scanner scan = new Scanner (System.in);
    	
    	double m, km;
    	
    	System.out.println("Digite uma distância em milhas: ");
    	m = scan.nextDouble();
    	
    	km = 1.6 * m;
    	
    	System.out.println("A distância em km/h é: " + km);
    	
    	scan.close();
    	
    }
}
