package atividade5;

import javax.swing.JOptionPane;

public class MensagemSimples {
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Por favor, digite seu nome.");
		
		JOptionPane.showMessageDialog(null, "Olá "+ nome+ " Seja bem vindo(a)!!!");
		
	}
 
 

}
