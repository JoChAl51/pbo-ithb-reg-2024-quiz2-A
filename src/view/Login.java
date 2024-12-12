package view;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	public Login() {
		setVisible(true);
		initComponent();
	}

	private void initComponent() {
	    setSize(400, 230);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Login");

		JPanel fieldLogin = new JPanel();
		fieldLogin.setBounds(10, 10, 380, 210);
		fieldLogin.setLayout(null);

		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(165, 0, 40, 10);
		fieldLogin.add(emailLabel);

//		JTextField emailField = new JTextField();
//		emailField.setBounds(0, 40, 365, 30);
//		fieldLogin.add(emailField);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(153, 70, 70, 10);
		fieldLogin.add(passwordLabel);

//		JPasswordField passwordField = new JPasswordField();
//		passwordField.setBounds(0, 110, 365, 30);
//		fieldLogin.add(passwordField);

		JButton login = new JButton("Login");
		login.setBounds(0, 140, 365, 30);
		fieldLogin.add(login);

		add(fieldLogin);
	}

	public static void main(String[] args) {
		new Login();
	}
}
