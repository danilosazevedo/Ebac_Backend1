/**
 * 
 */
package br.com.dazevedo.services;

import br.com.dazevedo.dao.IProdutoDAO;
import br.com.dazevedo.domain.Produto;
import br.com.dazevedo.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
