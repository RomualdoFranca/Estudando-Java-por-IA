package packages.io.file.verifica_apaga;

import java.io.File;
import java.util.Scanner;

import packages.io.file.manipulacaoarquivos.service.ManipulacaoDeArquivos;
import packages.io.file.manipulacaoarquivos.utils.LeitorDeConsole;

public class VerificaEApaga {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ManipulacaoDeArquivos gerenciador = new ManipulacaoDeArquivos();
		int opcao = LeitorDeConsole.selecionaOpcaoMenu(sc);
		
		if(opcao == 2) {
			System.out.println("Criar diretório:");
			String nome = LeitorDeConsole.lerEntradaNome(sc);
			File file = gerenciador.criaDiretorio(nome);
			
			if(!file.exists()) {
				boolean criaDiretorio = file.mkdir();
				
				if(criaDiretorio) {
					System.out.println("Diretorio criado");
				}else {
					System.out.println("Falha ao criar diretorio");
				}
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
