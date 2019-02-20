ackage controle;

import javax.swing.JOptionPane;

public class IdentificarFaixaEtaria {
	public static void main(String[] args) {
		String idadeEntrada = 
			JOptionPane.showInputDialog ("Idade");
		Integer idade = Integer.parseInt(idadeEntrada); 
		if(idade>18) {
			System.out.println("Adulto");
		} else if (idade < 18 && idade >= 12) {
			System.out.println("Adolecente");
		} else if (idade <12) {
			System.out.println("Criança");
		} else if (idade>0) {
			
		}
	
	}
}
