package services;

import main.Cliente;

public interface IclienteService {

	Boolean salvar(Cliente cliente);

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente);

}
