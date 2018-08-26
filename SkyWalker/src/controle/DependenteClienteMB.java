package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.DependenteCliente;

@ManagedBean
@ViewScoped
public class DependenteClienteMB {
	private DependenteCliente dependenteCliente = new DependenteCliente();
	private List<DependenteCliente> dependenteClientes = new ArrayList<>();
	private DAOGenerico<DependenteCliente> dao = new DAOGenerico<>(DependenteCliente.class);

	public DependenteClienteMB() {
		dependenteClientes = dao.buscarTodos();
	}
}
