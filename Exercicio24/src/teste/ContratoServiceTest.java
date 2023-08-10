package teste;

import DAO.ContratoDAO;
import DAO.ContratoDaoMock;
import DAO.IContratoDAO;
import Service.ContratoService;
import Service.IContratoService;
import org.junit.Test;
import org.junit.Assert;

public class ContratoServiceTest {

	@Test
	public void salvarTest() {
		IContratoService service  = new ContratoService();
		String retorno = service.salvar();
		Assert.assertEquals("Salvo com sucesso", retorno);
	}
	
	@Test
	public void buscarTest() {
		IContratoService service  = new ContratoService();
		String retorno = service.buscar();
		Assert.assertEquals("Busca realizada", retorno);
	}
	
	@Test
	public void excluirTest() {
		IContratoService service  = new ContratoService();
		String retorno = service.excluir();
		Assert.assertEquals("Excluído com sucesso", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IContratoService service  = new ContratoService();
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado com sucesso", retorno);
	}

//	@Test(expected = UnsupportedOperationException.class)
//	public void esperadoErroNoSalvarComBancoDeDadosTest() {
//		IContratoDAO dao = new ContratoDAO(dao);
//		IContratoService service = new ContratoService();
//		String retorno = service.salvar();
//		Assert.assertEquals("Sucesso", retorno);
//	}

	// TODO
	// Fazer métodos de buscar, excluir e atualizar

}
