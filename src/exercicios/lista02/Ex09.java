package exercicios.lista02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		double salario, emprestimo, porcentagem;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu sálario bruto: ");
		salario = Double.parseDouble(scan.nextLine());

		System.out.println("Digite a prestação do emprestimo: ");
		emprestimo = Double.parseDouble(scan.nextLine());

		porcentagem = 0.20 * salario;

		if (emprestimo > porcentagem) {
			System.out.println("Emprestimo não concedido");
		} else {
			System.out.println("Emprestimo concedido");
		}

		scan.close();
	}

}
