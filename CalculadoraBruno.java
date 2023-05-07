package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraBruno {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		ArrayList<String> historico = new ArrayList<String>();

		int acao = 1;

		while (acao > 0) {// while estrutura de repetição, enquanto a acao for maior q 0 ela vai se
							// repitir

			if (acao == 1) {
				System.out.println("===== Operação Matemática");
				System.out.println("Digite o primeiro número: ");

				int numero1, numero2;

				while (true) {

					try {

						numero1 = Scanner.nextInt();
						Scanner.nextLine();
						break;

					} catch (Exception e) {

						System.out.println("Você digitou um caráter errado.");
						System.out.println("Digite o primeiro número: ");
						Scanner.nextLine();

					}

				}

				System.out.println("Digite o operador: ");
				String operador = Scanner.nextLine();

				while (!(operador.equals("+") || operador.equals("-") || operador.equals("*")
						|| operador.equals("/"))) {

					System.out.println("Você digitou um operador errado.");
					System.out.println("Digite o operador: ");
					operador = Scanner.nextLine();
				}
				
				/*
				 
				 System.out.println(Digite o operador: ");
				 char operador = Scanner.next().charAt(0);
				 
				 while (!(operador == '+' || operador == '-' || operador == '*'
						|| operador =='/')) {

					System.out.println("Você digitou um operador errado.");
					System.out.println("Digite o operador: ");
					operador = Scanner.next().charAt(0);
				}
				 
				 
				 */
				
				while (true) {

					try {

						System.out.println("Digite o segundo número: ");
						numero2 = Scanner.nextInt();
						break;

					} catch (Exception e) {

						System.out.println("Você digitou um caráter errado.");
						System.out.println("Digite o segundo número: ");
						Scanner.nextLine();
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

					System.out.println("Operação Inválida");
					System.exit(0);
				}

				System.out.println(String.format("%d %s %d = %d", numero1, operador, numero2, resultado));

				String entradaHistorico = String.format("%d %s %d = %d", numero1, operador, numero2, resultado);

				historico.add(entradaHistorico);
			} else if (acao == 2) {

				System.out.println("==== Histórico ====");
				System.out.println(String.format("Você já fez %d operações", historico.size()));

				for (int i = 0; i < historico.size(); i++) {

					System.out.println(historico.get(i));
				}
			}
			System.out.println("==== O que você deseja Fazer ? ===");
			System.out.println(" 1. Realizar outra operação matemática");
			System.out.println(" 2. Acessar Historico");
			System.out.println(" 0. Sair");
			System.out.println("Sua Ação: ");

			acao = Scanner.nextInt();

		} // while

	}

}
