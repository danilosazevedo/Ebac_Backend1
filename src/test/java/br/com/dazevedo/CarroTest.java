/**
 * 
 */
package br.com.dazevedo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dazevedo.dao.CarroDao;
import br.com.dazevedo.dao.ICarroDao;
import br.com.dazevedo.dao.IMarcaDao;
import br.com.dazevedo.dao.MarcaDao;
import br.com.dazevedo.domain.Carro;
import br.com.dazevedo.domain.Marca;

/**
 * 
 */
public class CarroTest {
   private IMarcaDao marcaDao;
   private ICarroDao carroDao;
	
	public CarroTest() {
		marcaDao = new MarcaDao();
		carroDao = new CarroDao();
	}
	
	@Test
	public void cadastrar() {
		Marca ford = criarMarca("A1", "Ford");
		Carro carro = new Carro();
		carro.setCodigo("A1");
		carro.setModelo("Focus 2.0");
		carro.setMarca(ford);
		carro = carroDao.cadastrar(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
	}
	
	private Marca criarMarca(String codigo, String nome) {
		Marca marca = new Marca();
		marca.setCoidigo(codigo);
		marca.setNome(nome);
		return marcaDao.cadastrar(marca);
	}
}
