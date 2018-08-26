package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Historico;

@ManagedBean
@ViewScoped
public class HistoricoMB {
	private Historico historico = new Historico();
	private List<Historico> historicos = new ArrayList<>();
	private DAOGenerico<Historico> dao = new DAOGenerico<>(Historico.class);

	public HistoricoMB() {
		historicos = dao.buscarTodos();
	}
}
