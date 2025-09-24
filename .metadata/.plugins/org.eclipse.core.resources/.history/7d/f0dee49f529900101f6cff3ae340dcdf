package packages.javaswing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBorderLayout {

	public static void main(String[] args) {

		JFrame janelaBasica = new JFrame();
		janelaBasica.setTitle("Janela Básica");
		janelaBasica.setSize(600, 400);
		janelaBasica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//janela no topo
		JPanel painelNorte = new JPanel();
		painelNorte.setBackground(Color.RED);
		painelNorte.setPreferredSize(new Dimension(0, 200));
		
		JPanel painelSul = new JPanel();
		painelSul.setBackground(Color.BLUE);
		painelSul.setPreferredSize(new Dimension(0, 50));
		
		janelaBasica.add(painelNorte, BorderLayout.NORTH);
		janelaBasica.add(painelSul, BorderLayout.SOUTH);
		
		
		
		janelaBasica.setVisible(true);
	}

}
