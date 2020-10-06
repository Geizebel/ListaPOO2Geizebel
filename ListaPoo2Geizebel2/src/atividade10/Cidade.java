package atividade10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Cidade extends JFrame {

	private JPanel contentPane;
	private JPanel contentPaneEst;
	private JTextField textEnder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cidade frame = new Cidade();
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
	public Cidade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastre seu endere\u00E7o:");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(10, 10, 405, 41);
		contentPane.add(lblNewLabel);
		
		JComboBox cidade = new JComboBox();
		cidade.setBounds(0, 171, 191, 41);
		contentPane.add(cidade);
		cidade.addItem("Belo Horizonte");
		cidade.addItem("Santa Luzia");
		cidade.addItem("Sabará");
		cidade.addItem("Contagem");
		cidade.addItem("Ribeirão das Neves");
		cidade.addItem("Sardoá");
		
	
		
		textEnder = new JTextField();
		textEnder.setFont(new Font("Arial", Font.PLAIN, 15));
		textEnder.setBounds(10, 96, 317, 27);
		contentPane.add(textEnder);
		textEnder.setColumns(10);
		
		JLabel lblNewLabel_1 =  new JLabel("Digite seu endere\u00E7o:");
		lblNewLabel_1.setForeground(new Color(51, 0, 255));
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 61, 141, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Selecione a cidade:");
		lblNewLabel_2.setForeground(new Color(153, 0, 255));
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 144, 148, 27);
		contentPane.add(lblNewLabel_2);
		
		JComboBox estado = new JComboBox();
			contentPane.add(estado);
			estado.addItem("Minas Gerais");
			estado.addItem("São Paulo");
			estado.addItem("Rio de Janeiro");
		
		estado.setBounds(240, 171, 159, 35);
		contentPane.add(estado);
		JButton pronto = new JButton("Pronto!");
		pronto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Seu cadastro foi finalizado: "+textEnder.getText()+", "+cidade.getSelectedItem()+", "+estado.getSelectedItem());
			}
		});
		pronto.setFont(new Font("Arial", Font.BOLD, 13));
		pronto.setBounds(317, 218, 109, 35);
		contentPane.add(pronto);
		
		JLabel lblNewLabel_3 = new JLabel("Selecione o estado:");
		lblNewLabel_3.setForeground(new Color(153, 0, 204));
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 13));
		lblNewLabel_3.setBounds(241, 143, 120, 29);
		contentPane.add(lblNewLabel_3);
		
	
		
	}
}
