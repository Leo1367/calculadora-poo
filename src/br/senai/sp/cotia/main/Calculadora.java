package br.senai.sp.cotia.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		ArrayList<String> historico = new ArrayList<String>();

		int acao = 1;
		
		while (acao > 0) {

			if (acao == 1) {
				System.out.println("===== Opera��o Matem�tica");
				System.out.println("Digite o primeiro n�mero: ");

				int numero1, numero2;

				while (true) {

					try {

						numero1 = leitor.nextInt();
						leitor.nextLine();
						break;

					} catch (Exception e) {

						System.out.println("Voc� digitou um car�ter errado.");
						System.out.println("Digite o primeiro n�mero: ");
						leitor.nextLine();

					}

				}

				System.out.println("Digite o operador: ");
				String operador = leitor.nextLine();

				while (!(operador.equals("+") || operador.equals("-") || operador.equals("*")
						|| operador.equals("/"))) {

					System.out.println("Voc� digitou um operador errado.");
					System.out.println("Digite o operador: ");
					operador = leitor.nextLine();
				}

				while (true) {

					try {

						System.out.println("Digite o segundo n�mero: ");
						numero2 = leitor.nextInt();
						break;

					} catch (Exception e) {

						System.out.println("Voc� digitou um car�ter errado.");
						System.out.println("Digite o segundo n�mero: ");
						leitor.nextLine();
						continue;

					}

				}

				int resultado = 0;

				switch (operador) {
				case "+":
					resultado = numero1 + numero2;
					break;

				case "-":
					resultado = numero1 - numero2;
					break;

				case "*":
					resultado = numero1 * numero2;
					break;

				case "/":
					resultado = numero1 / numero2;
					break;

				default:

					System.out.println("Opera��o Inv�lida");
					System.exit(0);
				}

				System.out.println(String.format("%d %s %d = %d", numero1, operador, numero2, resultado));

				String entradaHistorico = String.format("%d %s %d = %d", numero1, operador, numero2, resultado);

				historico.add(entradaHistorico);
			} else if (acao == 2) {

				System.out.println("==== Hist�rico ====");
				System.out.println(String.format("Voc� j� fez %d opera��es", historico.size()));

				for (int i = 0; i < historico.size(); i++) {

					System.out.println(historico.get(i));
				}
			}
			System.out.println("==== O que voc� deseja Fazer ? ===");
			System.out.println(" 1. Realizar outra opera��o matem�tica");
			System.out.println(" 2. Acessar Historico");
			System.out.println(" 0. Sair");
			System.out.println("Sua A��o: ");

			acao = leitor.nextInt();

		}
		
		leitor.close();

	}

}