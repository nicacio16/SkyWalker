package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Administrador;

@ManagedBean
@ViewScoped
public class AdministradorMB {
	private Administrador administrador = new Administrador();
	private List<Administrador> administradores = new ArrayList<>();
	private DAOGenerico<Administrador> dao = new DAOGenerico<>(Administrador.class);

	public AdministradorMB() {
		administradores = dao.buscarTodos();
	}
}