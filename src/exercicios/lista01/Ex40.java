package exercicios.lista01;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double total, l;
		int qtd;

		System.out.println("Digite a quantidade de dias trabalhados:");
		qtd = Integer.parseInt(scan.nextLine());

		total = qtd * 30;
		l = total - (total * 0.08);

		System.out.printf("O valor líquido a ser recebido é: %.2f", l);

		scan.close();

	}

}
