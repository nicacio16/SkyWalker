package modelo;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Conteudo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idConteudo;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String genero;
	@Column(nullable = false)
	private String tipo;
	@Column(nullable = false)
	private int indicacao;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private int anoLancamento;
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Time tempoDuracao;

	public long getIdConteudo() {
		return idConteudo;
	}

	public void setIdConteudo(long idConteudo) {
		this.idConteudo = idConteudo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(int indicacao) {
		this.indicacao = indicacao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Time getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(Time tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
}
