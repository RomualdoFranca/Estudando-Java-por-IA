package packages.io.file.criacao_arquivos_diretorios;

import java.io.File;
import java.io.IOException;

public class CriaArquivosEExcecao2 {

	public static void main(String[] args) {

//		String path = "C:\\Java IA";
		File path = new File("C:\\Java IA");

		imprimeListaNomesDiretorios(path);
		
		File dir = criaDiretorio(path, "pastaMetodo2");
		imprimeMensagemCriacaoDiretorio(dir);

		// cria arquivo
		try {
			File arquivo = criaArquivo(path, "text.txt");
			imprimeMensagemCriacaoArquivo(arquivo);
		} catch (Exception e) {
			System.out.println("Ocorreu um I/O exception");
			e.printStackTrace();
		}

		
		
	}

	public static File criaDiretorio(File path, String nome) {
		File diretorio = new File(path, nome);
		diretorio.mkdir();
		return diretorio;
	}

	public static File criaArquivo(File path, String nome) throws IOException {
		File arquivo = new File(path, nome);
		arquivo.createNewFile();
		return arquivo;

	}

	public static void imprimeMensagemCriacaoArquivo(File arquivo) {
		if (arquivo.exists()) {
			System.out.println("O arquivo '" + arquivo.getName() + "' foi criado ou já existia.");

		} else {
			System.out.println("Falha ao criar a arquivo '" + arquivo.getName());

		}
	}

	public static void imprimeMensagemCriacaoDiretorio(File diretorio) {
		if (diretorio.exists()) {
			System.out.println("O diretório '" + diretorio.getName() + "' foi criado ou já existia.");
		} else {
			System.out.println("Falha ao criar diretório '" + diretorio.getName());
		}
	}

	public static void imprimeListaNomesDiretorios(File path) {
		File[] listaDiretorios = path.listFiles(File::isDirectory);
		System.out.println("Diretórios no caminho : " + path);
		for (File file : listaDiretorios) {
			System.out.println(file.getName());
		}
		System.out.println();
	}
	

}
