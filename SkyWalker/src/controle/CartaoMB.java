package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Cartao;

@ManagedBean
@ViewScoped
public class CartaoMB {
	private Cartao cartao = new Cartao();
	private List<Cartao> cartoes = new ArrayList<>();
	private DAOGenerico<Cartao> dao = new DAOGenerico<>(Cartao.class);

	public CartaoMB() {
		cartoes = dao.buscarTodos();
	}
}
