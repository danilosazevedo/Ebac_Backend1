package services;

import dao.ClienteDAO;
import dao.IClienteDAO;
import main.Cliente;

public class ClienteService implements IclienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Boolean salvar(Cliente cliente) {
		return clienteDAO.salvar(cliente);

	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteDAO.buscarPorCPF(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
