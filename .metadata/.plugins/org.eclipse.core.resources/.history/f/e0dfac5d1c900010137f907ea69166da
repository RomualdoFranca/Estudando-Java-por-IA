package packages.io.file.criacao_arquivos_diretorios;

import java.io.File;
import java.io.IOException;

public class CriaArquivosEExcecao2 {

	public static void main(String[] args) {

		File path = new File("C:\\Java IA");

		File dir = new File(path, "dir01");

		if (!dir.exists()) {
			boolean criaDir = dir.mkdir();

			if (criaDir) {
				System.out.println("Diretorio criado");
			} else {
				System.out.println("Falha ao criar diretorio");
			}
		}

		File arquivo = new File(dir, "text.md");

		try {
			boolean criaArquivo = arquivo.createNewFile();
			if (criaArquivo) {
				System.out.println("Arquivo criado");

			}else {
				System.out.println("Falha ao criar arquivo. O arquivo já existe");
				
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um I/O exception");
			e.printStackTrace();
		
		}
	}

}
