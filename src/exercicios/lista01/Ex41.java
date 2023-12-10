package exercicios.lista01;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor, total, l;
		int qtd;

		System.out.println("Digite o valor da hora de trabalho em reais: ");
		valor = Double.parseDouble(scan.nextLine());

		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		qtd = scan.nextInt();

		total = (valor * qtd);
		l = total + (total * 0.10);

		System.out.printf("O valor líquido a ser recebido é: %.2f", l);

		scan.close();
	}

}
