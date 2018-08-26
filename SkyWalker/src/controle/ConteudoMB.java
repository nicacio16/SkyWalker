package controle;

import daoGenerico.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Conteudo;

@ManagedBean
@ViewScoped
public class ConteudoMB {
	private Conteudo conteudo = new Conteudo();
	private List<Conteudo> conteudos = new ArrayList<>();
	private DAOGenerico<Conteudo> dao = new DAOGenerico<>(Conteudo.class);

	public ConteudoMB() {
		conteudos = dao.buscarTodos();
	}
}
