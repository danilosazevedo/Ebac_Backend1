package index;

import javax.swing.JOptionPane;

import dao.ClienteMapDao;
import dao.IClienteDAO;

public class App {
	
	private static IClienteDAO iClienteDAO;
	
	public static void main(String args[]) {
		iClienteDAO = new ClienteMapDao();
		
		String opcao = JOptionPane.showInputDialog(null,"1 - Cadastro 2 - Consultar 3 - Excluir 4 - Alterar 5 - Sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		
		if(opcao.equals("1")) {
			JOptionPane.showInputDialog(null,"Você selecionou a opção:" + opcao, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
