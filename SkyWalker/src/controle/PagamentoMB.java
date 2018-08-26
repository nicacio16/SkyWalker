package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Pagamento;

@ManagedBean
@ViewScoped
public class PagamentoMB {
	private Pagamento pagamento = new Pagamento();
	private List<Pagamento> pagamentos = new ArrayList<>();
	private DAOGenerico<Pagamento> dao = new DAOGenerico<>(Pagamento.class);

	public PagamentoMB() {
		pagamentos = dao.buscarTodos();
	}
}
