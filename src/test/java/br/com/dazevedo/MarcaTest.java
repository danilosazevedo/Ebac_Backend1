/**
 * 
 */
package br.com.dazevedo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dazevedo.dao.IMarcaDao;
import br.com.dazevedo.dao.MarcaDao;
import br.com.dazevedo.domain.Marca;


/**
 * 
 */
public class MarcaTest {
	private IMarcaDao marcaDao;
	
	public MarcaTest() {
		marcaDao = new MarcaDao();
	}
	
	@Test
	public void cadastrar() {
		Marca ford = new Marca();
		ford.setCoidigo("A1");
		ford.setNome("Ford");
		ford = marcaDao.cadastrar(ford);
		
		assertNotNull(ford);
		assertNotNull(ford.getId());
		
		
	}
	
	
}
