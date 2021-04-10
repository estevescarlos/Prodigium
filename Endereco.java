package br.com.fiap.apagarEmSeguida;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PDG_FUNCIONARIO")
@SequenceGenerator(allocationSize = 1, name = "end", sequenceName = "SQ_T_PDG_ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(generator = "end", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_endereco")
	private int codigo;
	
	@Column(name="ds_logradouro", nullable = false, length = 60)
	private String logradouro;
	
	@Column(name="nr_enredeco", nullable = false, length = 5)
	private int numero;
	
	@Column(name="ds_complemento", length = 50)
	private String complemento;
	
	@Column(name="ds_tipo_endereco", nullable = false, length = 60)
	private TipoEndereco tipo;

	public Endereco() {
	}

	public Endereco(String logradouro, int numero, String complemento, TipoEndereco tipo) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.tipo = tipo;
	}

	public Endereco(int codigo, String logradouro, int numero, String complemento, TipoEndereco tipo) {
		this.codigo = codigo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public TipoEndereco getTipo() {
		return tipo;
	}

	public void setTipo(TipoEndereco tipo) {
		this.tipo = tipo;
	}
	
}
