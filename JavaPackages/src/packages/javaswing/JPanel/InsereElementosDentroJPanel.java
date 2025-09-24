package packages.javaswing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsereElementosDentroJPanel {

	public static void main(String[] args) {

		JFrame janela = new JFrame();
		janela.setTitle("Inserindo Elementos no JPanel");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(600, 400);
		janela.setLayout(new BorderLayout());
		
		//Criação e Configuração dos JPanels (os sub-contêineres)
		JPanel containerNorth = new JPanel();
		containerNorth.setBackground(new Color(255, 102, 102));
		//Define o layout do containerNorte como BoxLayout, para alinhar os elementos horizontalmente
		containerNorth.setLayout(new BoxLayout(containerNorth, BoxLayout.X_AXIS));
		
		//cria os componentes que serão inseridos no containerNorte
		JLabel labelNome = new JLabel("Nome");
		JTextField campoNome = new JTextField(15);
		
		//adiciona espçamento fixo entre os componentes
		containerNorth.add(Box.createRigidArea(new Dimension(10, 0))); //espaçamento a esquerda
		containerNorth.add(labelNome);
		containerNorth.add(Box.createHorizontalStrut(10));
		containerNorth.add(campoNome);
		containerNorth.add(Box.createRigidArea(new Dimension(40, 0)));
        
		janela.add(containerNorth, BorderLayout.NORTH);
		
//		janela.setLocationRelativeTo(null);

		janela.setVisible(false);
	}

}
