package packages.javaswing.teste;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaSwingSimples {

	public static void main(String[] args) {

		// Cria a janela (frame)
        JFrame frame = new JFrame("Minha Primeira Janela Swing");
        // Define o que acontece quando o botão de fechar é clicado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o tamanho da janela (largura, altura)
        frame.setSize(700, 300);
        
        // Define o layout como FlowLayout para organizar os componentes
        frame.setLayout(new FlowLayout());
        // Cria o campo de texto
        JTextField campoNome = new JTextField(15); // 15 colunas visíveis
        
        // Cria o botão
        JButton botao = new JButton("Diga Olá");

     // Cria o rótulo para a mensagem (inicia vazio ou com instrução)
        JLabel mensagem = new JLabel("Digite seu nome acima");
        
     // Adiciona a "ação" ao botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                if (!nome.trim().isEmpty()) {
                    mensagem.setText("Olá, " + nome + "! Bem-vindo(a) ao mundo do Swing!");
                } else {
                    mensagem.setText("Por favor, digite seu nome.");
                }
            }
        });

        // Adiciona todos os componentes à janela
        frame.add(campoNome);
        frame.add(botao);
        frame.add(mensagem);
        
        
        // Deixa a janela visível
        frame.setVisible(true);
	}

}
