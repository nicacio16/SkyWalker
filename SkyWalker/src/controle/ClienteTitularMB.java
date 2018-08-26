package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ClienteTitular;

@ManagedBean
@ViewScoped
public class ClienteTitularMB {
	private ClienteTitular clienteTitular = new ClienteTitular();
	private List<ClienteTitular> clientesTitulares = new ArrayList<>();
	private DAOGenerico<ClienteTitular> dao = new DAOGenerico<>(ClienteTitular.class);

	public ClienteTitularMB() {
		clientesTitulares = dao.buscarTodos();
	}
}
