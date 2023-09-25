/**
 * 
 */
package br.com.dazevedo.dao;

import br.com.dazevedo.dao.generic.IGenericDAO;
import br.com.dazevedo.domain.Venda;
import br.com.dazevedo.exceptions.DAOException;
import br.com.dazevedo.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
