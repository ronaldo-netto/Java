package exercicios.lista01;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double n1, n2, n3, n4, ma;

		System.out.println("Digite quatro notas respectivamente: ");
		n1 = Double.parseDouble(scan.nextLine());
		n2 = Double.parseDouble(scan.nextLine());
		n3 = Double.parseDouble(scan.nextLine());
		n4 = Double.parseDouble(scan.nextLine());

		ma = (n1 + n2 + n3 + n4) / 4;

		System.out.println("A média aritmética é: " + ma);

		scan.close();

	}

}
