package packages.io.file.criacao_arquivos_diretorios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CriaArquivosEExcecao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// File pode ser tanto um caminho de um arquivo como o caminho de uma pasta
		// define o caminho onde o diretorio sera criado
		File pathDirectory = new File("C:\\Java IA");

		// cria um objeto File que será um diretório
		File diretorio = new File(pathDirectory, "meus_documentos");

		// !diretorio.exists(): retorna false indicando que o diretorio não existe no
		// caminho especificado
		if (!diretorio.exists()) {
			// cria o diretorio se ele não existir
			boolean diretorioCriado = diretorio.mkdir();
			// mesmo que o diretorio não exista, ainda não é garantido que ele possa ser
			// criado
			// pode receber um nome com caractere inválido, por exemplo.
			// por isso a necessidade de outra estrutura condicional
			if (diretorioCriado) {
				System.out.println("Diretório criado com sucesso.");

			} else {
				System.out.println("Falha ao criar o diretório '" + diretorio.getName() + "'");

			}

		} else {
			System.out.println(
					"Falha ao criar o diretório.\nJá existe um diretório '" + diretorio.getName() + "' neste local");

		}

		// instancia um objeto File que será um arquivo
		File arquivo = new File(diretorio, "list.txt");

		try {
			// arquivo.createNewFile(): método que cria o arquivo
			boolean arquivoCriado = arquivo.createNewFile();

			if (arquivoCriado) {// retorna false unicamente se o arquivo com o nome e caminho especificados já
								// existe
				System.out.println("Arquivo criado com sucesso.");
			} else {
				System.out.println("O arquivo '" + arquivo.getName() + "' já existe");
			}
		}
		// o bloco catch é para qualquer outro tipo de falha que não seja a existência 	do arquivo.
		// Todas essas outras falhas será considerado uma exceção
		catch (IOException e) {
			System.out.println("Ocorreu um erro I/O ao tentar criar o arquivo");
			e.printStackTrace();
		}

		sc.close();
	}

}
