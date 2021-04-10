package br.com.fiap.apagarEmSeguida;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="T_PDG_FORNECEDOR")
@SequenceGenerator(allocationSize = 1, name = "forn", sequenceName = "SQ_T_PDG_FORNECEDOR")
public class Fornecedor {

	@Id
	@GeneratedValue(generator = "forn", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_fornecedor")
	private int codigo;
	
	@Column(name="nm_fornecedor", nullable = false, length = 60)
	private String nome;
	
	@Column(name="nr_cnpj", nullable = false, length = 18)
	private String cnpj;
	
	@Column(name="ds_unidade", nullable = false, length = 60)
	private String unidade;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="dt_cadastro", nullable = false)
	private Calendar dtCadastro;

	public Fornecedor() {
	}

	public Fornecedor(String nome, String cnpj, String unidade, Calendar dtCadastro) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.unidade = unidade;
		this.dtCadastro = dtCadastro;
	}

	public Fornecedor(int codigo, String nome, String cnpj, String unidade, Calendar dtCadastro) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.unidade = unidade;
		this.dtCadastro = dtCadastro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Calendar getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Calendar dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
}
