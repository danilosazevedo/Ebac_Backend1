/**
 * 
 */
package br.com.dazevedo.dao;

import java.util.List;

import br.com.dazevedo.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoDao {

	public Produto cadastrar(Produto produto);

	public void excluir(Produto prod);

	public List<Produto> buscarTodos();
}
