package controle;

import javax.swing.JOptionPane;

public class CalculoJuro {
	public static void main (String[] args ) {
		Double valorProduto =
				Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Produto"));
		int parcelas =
				Integer.parseInt(JOptionPane.showInputDialog("Digite uma quantidade de Parcelas"));
		
		//for(int x=0x<parcelas;x++) {
		//	valorProduto = valorProduto*1.05;
		//}
		Double resultado = valorProduto*Math.pow(1.05,  parcelas);
		System.out.println("Valor Final: "+valorProduto);
	}
	
}
