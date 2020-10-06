package atividade9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField totalTex;
	private JRadioButton pequena;
	private JRadioButton media;
	private JRadioButton grande;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pizzaria GR");
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 32));
		lblNewLabel.setBounds(98, 10, 192, 66);
		contentPane.add(lblNewLabel);
		
		JRadioButton pequena = new JRadioButton("pequena $ 5");
		pequena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pequena.isSelected()) {
					grande.setSelected(false);			
					media.setSelected(false);				}
			}
			});
		pequena.setFont(new Font("Carlito", Font.BOLD, 15));
		pequena.setBounds(23, 96, 120, 21);
		contentPane.add(pequena);
		
		JRadioButton media = new JRadioButton("media $ 10");
		media.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(media.isSelected()) {
					grande.setSelected(false);			
					pequena.setSelected(false);				}
			}
			}
		);
		media.setFont(new Font("Carlito", Font.BOLD, 15));
		media.setBounds(23, 127, 103, 21);
		contentPane.add(media);
		
		JRadioButton grande = new JRadioButton("grande $ 15");
		grande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grande.isSelected()) {
					media.setSelected(false);			
					pequena.setSelected(false);			
					}
				
			}
			}
		);
		grande.setFont(new Font("Carlito", Font.BOLD, 15));
		grande.setBounds(24, 161, 103, 21);
		contentPane.add(grande);
		
		JCheckBox bacon = new JCheckBox(" Bacon $ 2");
		bacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bacon.setFont(new Font("Tahoma", Font.BOLD, 12));
		bacon.setBounds(289, 96, 93, 21);
		contentPane.add(bacon);
		
		JCheckBox queijo = new JCheckBox(" Queijo $ 2");
		queijo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		queijo.setFont(new Font("Tahoma", Font.BOLD, 12));
		queijo.setBounds(289, 124, 93, 21);
		contentPane.add(queijo);
		
		JCheckBox molho = new JCheckBox("molho $ 1");
		molho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		molho.setFont(new Font("Tahoma", Font.BOLD, 12));
		molho.setBounds(289, 146, 93, 21);
		contentPane.add(molho);
		
		JCheckBox borda = new JCheckBox("Borda recheada $ 5");
		borda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		borda.setFont(new Font("Tahoma", Font.BOLD, 12));
		borda.setBounds(266, 169, 170, 21);
		contentPane.add(borda);
		
		JLabel lblNewLabel_1 = new JLabel("total");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(216, 222, 59, 31);
		contentPane.add(lblNewLabel_1);
		
		totalTex = new JTextField();
		totalTex.setBounds(289, 230, 96, 19);
		contentPane.add(totalTex);
		totalTex.setColumns(10);
		
		JButton calcular = new JButton("calcular");
		calcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		calcular.setForeground(Color.BLUE);
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total = 0;
				if (pequena.isSelected()) {
					total = total + 5;
					if(bacon.isSelected()) {
						total = total + 2;
					}
					if(queijo.isSelected()) {
						total = total + 2;
					}
					if(molho.isSelected()) {
						total = total + 1;
					}
					if(borda.isSelected()) {
						total = total + 5;
					}
				}
				
			
				else if (media.isSelected()) {
				total = total + 10;
				if(bacon.isSelected()) {
					total = total + 2;
				}
				if(queijo.isSelected()) {
					total = total + 2;
				}
				if(molho.isSelected()) {
					total = total + 1;
				}
				if(borda.isSelected()) {
					total = total + 5;
				}
			}
			
		
			else if (grande.isSelected()) {
				total = total + 15;
				if(bacon.isSelected()) {
					total = total + 2;
				}
				if(queijo.isSelected()) {
					total = total + 2;
				}
				if(molho.isSelected()) {
					total = total + 1;
				}
				if(borda.isSelected()) {
					total = total + 5;
				}
			}
			
			
			totalTex.setText(Double.toString(total));
			total=Double.parseDouble(totalTex.getText());
			totalTex.setText(Double.toString(total));
		}
				
		}
	);
		calcular.setBounds(10, 229, 98, 21);
		contentPane.add(calcular);
		
		JButton sair = new JButton("sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setFont(new Font("Tahoma", Font.BOLD, 14));
		sair.setForeground(Color.RED);
		sair.setBounds(102, 229, 85, 21);
		contentPane.add(sair);
		
		JLabel lblNewLabel_2 = new JLabel("Tamanhos:");
		lblNewLabel_2.setForeground(new Color(102, 0, 204));
		lblNewLabel_2.setFont(new Font("Carlito", Font.BOLD, 13));
		lblNewLabel_2.setBounds(24, 59, 78, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Complementos");
		lblNewLabel_3.setFont(new Font("Carlito", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(0, 102, 255));
		lblNewLabel_3.setBounds(297, 59, 85, 17);
		contentPane.add(lblNewLabel_3);
		}
}
