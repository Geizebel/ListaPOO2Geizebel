package atividade7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aula extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textsobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aula frame = new aula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public aula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(146, 48, 251, 31);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel.setBounds(20, 49, 98, 31);
		contentPane.add(lblNewLabel);
		
		textsobrenome = new JTextField();
		textsobrenome.setColumns(10);
		textsobrenome.setBounds(146, 89, 251, 31);
		contentPane.add(textsobrenome);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome");
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 90, 126, 31);
		contentPane.add(lblNewLabel_1);
		
		JButton entrar = new JButton("entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Como vai "+ textNome.getText() +" "+ textsobrenome.getText()+", tudo bem?");
			}
		});
		entrar.setFont(new Font("Candara", Font.BOLD, 17));
		entrar.setBounds(196, 194, 98, 31);
		contentPane.add(entrar);
	}
}
