/**
 * 
 */
package br.com.dazevedo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dazevedo.dao.ProdutoDao;
//import br.com.dazevedo.dao.daoProduto;
import br.com.dazevedo.dao.IProdutoDao;
import br.com.dazevedo.domain.Produto;

/**
 * @author danilo.azevedo
 *
 */
public class ProdutoTest {

	private IProdutoDao daoProduto;
	
	public ProdutoTest() {
		daoProduto = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("1");
		prod.setDescricao("nome exemplo");
		prod.setNome("produto");
		
		prod = daoProduto.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
