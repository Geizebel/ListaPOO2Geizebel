package atividade8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class opcao extends JFrame {

	private JPanel contentPane;
	private JRadioButton sp;
	private JRadioButton mg;
	private JRadioButton ba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					opcao frame = new opcao();
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
	public opcao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("De qual estado voc\u00EA \u00E9?");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(45, 42, 359, 30);
		contentPane.add(lblNewLabel);
		
		JRadioButton branco = new JRadioButton("SP");
		branco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(sp.isSelected()) {
//					mg.setSelected(false);
//					ba.setSelected(false);
//				}
			}
		});
		branco.setFont(new Font("Arial", Font.BOLD, 25));
		branco.setBounds(19, 124, 103, 21);
		contentPane.add(branco);
		
		JRadioButton mg = new JRadioButton("MG");
		mg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(mg.isSelected()) {
//					branco.setSelected(false);
//					ba.setSelected(false);
//				}
			}
		});
		mg.setFont(new Font("Arial", Font.BOLD, 25));
		mg.setBounds(135, 124, 110, 21);
		contentPane.add(mg);
		
		JRadioButton ba = new JRadioButton("BA");
		ba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(ba.isSelected()) {
//					mg.setSelected(false);
//					branco.setSelected(false);
//				}
			}
		});
		ba.setFont(new Font("Arial", Font.BOLD, 25));
		ba.setBounds(274, 124, 110, 21);
		contentPane.add(ba);
		
		JButton botao = new JButton("responder");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "Obrigado por responder!");
			}
		});
		botao.setFont(new Font("Arial", Font.BOLD, 15));
		botao.setBounds(162, 211, 118, 21);
		contentPane.add(botao);
	}
}
