package packages.io.file.manipulacaoarquivos.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorDeConsole {
	
	public static String lerEntradaNome(Scanner sc) {
		System.out.print("Digite o nome:");
		String nome = sc.nextLine();
		return nome;
	}
		
//		if(opcao == 1) {
//			System.out.println("Digite o nome do arquivo");
//			nome = sc.nextLine();
//		}
//		if(opcao == 2) {
//			System.out.println("Digite o nome do diretório");
//			nome = sc.nextLine();
//		}
	
	public static boolean validaEntradaNome(String nome, Scanner sc) {
		while(true) {
			nome = lerEntradaNome(sc);
			try {
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
			}
		}
	}

	public static int lerEntradaMenu(Scanner sc) {
		System.out.print("Digite a opção: -> ");
		int num = Integer.parseInt(sc.nextLine());
		return num;

	}

	public static boolean validaEntradaMenu(int num) {

		return num >= 1 && num <= 2;
	}

	public static int selecionaOpcaoMenu(Scanner sc) {
		String menu = """
				Escolha a opção desejada:
				Criar arquivo: 	 1
				Criar diretório: 2
				""";
		//Apagar arquivo:  3
		//Apagar diretório:4
		System.out.print(menu);

		while (true) {

			try {

				int num = lerEntradaMenu(sc);
				if (validaEntradaMenu(num)) {
					return num;
				}
				System.out.println("Opção inválida. Digite uma opção válida 1 ou 2.");

			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Digite apenas números.");
			}
		}
	}

}
