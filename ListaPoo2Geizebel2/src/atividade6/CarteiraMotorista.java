package atividade6;

import javax.swing.JOptionPane;

public class CarteiraMotorista {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Por favor, informe seu nome.");
		int idade =Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, informe sua idade."));
		
		
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, nome+", voc� tem permiss�o para tirar carteira de motorista.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Desculpe " +nome+ ",voc� n�o tem permiss�o");
		}
	}
}
