package exercicios.lista01;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, b, hipotenusa;

		System.out.println("Digite o cateto a do triângulo: ");
		a = Double.parseDouble(scan.nextLine());

		System.out.println("Digite o cateto b do triângulo: ");
		b = Double.parseDouble(scan.nextLine());

		hipotenusa = Math.sqrt((a * a) + (b * b));

		System.out.println("A hipotenusa é: " + hipotenusa);

		scan.close();

	}

}
