package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.ClienteDAO;
import dao.IClienteDAO;
import main.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDAO;
	
	private Cliente cliente;
	
	public  ClienteDAOTest() {
		clienteDAO = new ClienteDaoMock();
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678912L);
		cliente.setNome("Danilo");
		cliente.setCidade("Natal");
		cliente.setEnd("Endereco");
		cliente.setEstado("RN");
		cliente.setNumero(569);
		cliente.setTel(84994894269L);
		clienteDAO.salvar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
		
	}
	
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteDAO.salvar(cliente);

		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());

	}
	
	@Test
	public void alterarCliente() {
		cliente.setNome("Danilo Azevedo");
		clienteDAO.alterar(cliente);

		Assert.assertEquals("Danilo Azevedo", cliente.getNome());
	}

}
