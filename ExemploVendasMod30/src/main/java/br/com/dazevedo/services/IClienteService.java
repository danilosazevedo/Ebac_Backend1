/**
 * 
 */
package br.com.dazevedo.services;

import br.com.dazevedo.domain.Cliente;
import br.com.dazevedo.exceptions.DAOException;
import br.com.dazevedo.exceptions.TipoChaveNaoEncontradaException;
import br.com.dazevedo.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
