package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.IClienteDAO;
import main.Cliente;
import services.ClienteService;
import services.IclienteService;

public class ClienteServiceTest {

	public IclienteService clienteService;

	private Cliente cliente;

	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
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
		clienteService.salvar(cliente);
	}

	@Test
	public void pesquisarCliente() {

		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

		Assert.assertNotNull(clienteConsultado);

	}

	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.salvar(cliente);

		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());

	}
	
	@Test
	public void alterarCliente() {
		cliente.setNome("Danilo Azevedo");
		clienteService.alterar(cliente);

		Assert.assertEquals("Danilo Azevedo", cliente.getNome());
	}

}
