package packages.javaswing.JFrame;

import javax.swing.JFrame;

public class JanelaBasica {

	public static void main(String[] args) {

		//instancia um objeto JFrame.
		JFrame janelaBasica = new JFrame();
		//adiciona titulo a janela
		janelaBasica.setTitle("Janela Básica");
		//define dimensões
		janelaBasica.setSize(500, 300);
		//configura a ação de fechar
		janelaBasica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//faz com que a janela aparece na tela
		janelaBasica.setVisible(true);
		
		
	}
	
}
