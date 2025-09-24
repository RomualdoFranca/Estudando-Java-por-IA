package packages.javaswing.GridLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GradeNoJPanel {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setTitle("JPanel com Grade");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 500);
		
		
		JPanel painelDaGrade = new JPanel();
		painelDaGrade.setBorder(new EmptyBorder(30, 30, 30, 30));
		
		painelDaGrade.setLayout(new GridLayout(3, 3, 10, 10));
		
		for(int i = 0; i <= 8; i++) {
			painelDaGrade.add(new JButton(String.format("%d", i)));
		}
		
		window.add(painelDaGrade, BorderLayout.CENTER);
		
		
		
		
		
		
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
	}

}
