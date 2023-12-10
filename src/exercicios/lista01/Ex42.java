package exercicios.lista01;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {

		double salario, g, i, total;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o salário-base:");
		salario = Double.parseDouble(scan.nextLine());

		g = salario * 0.05;
		i = salario * 0.07;
		total = (salario - i) + g;

		System.out.printf("O salário a receber é %.2f", total);

		scan.close();

	}

}
