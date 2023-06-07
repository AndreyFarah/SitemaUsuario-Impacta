package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaLogin {
	
	public void abrirTelaLogin (){
		
		
		String usuario = "USUARIO";
		String senha = "SENHA";
		
		JFrame frameTelaLogin = new JFrame();
		frameTelaLogin.setTitle("TELA DE LOGIN");
		frameTelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTelaLogin.setSize(300,200);
		
		JPanel panelTelaLogin = new JPanel();
		GridLayout grid = new GridLayout(0,1);
		panelTelaLogin.setLayout(grid);
		
		JLabel labelUsuario = new JLabel(usuario);
		panelTelaLogin.add(labelUsuario);

		JTextField textUsuario = new JTextField(10);
		panelTelaLogin.add(textUsuario);
		
		JLabel labelSenha = new JLabel(senha);
		panelTelaLogin.add(labelSenha);
		
		JTextField textSenha = new JTextField(10);
		panelTelaLogin.add(textSenha);
		
		
		
		
		frameTelaLogin.add(panelTelaLogin);
		frameTelaLogin.setVisible(true);
		

		
		
		
	}

}
