package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Plano;

@ManagedBean
@ViewScoped
public class PlanoMB {
	private Plano plano = new Plano();
	private List<Plano> planos = new ArrayList<>();
	private DAOGenerico<Plano> dao = new DAOGenerico<>(Plano.class);

	public PlanoMB() {
		planos = dao.buscarTodos();
	}
}
