package Service;

import DAO.ClienteDaoMock;
import DAO.IClienteDAO;

public class ClienteService {
	
    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao) {
//        clienteDao = new IClienteDAO();
        clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

}
