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
@Table(name = "T_PDG_FUNCIONARIO")
@SequenceGenerator(name = "func", allocationSize = 1, sequenceName = "SQ_T_PDG_FUNCIONARIO")
public class Funcionario {

	@Id
	@Column(name="cd_funcionario")
	@GeneratedValue(generator = "func", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_funcionario", nullable = false, length = 60)
	private String nome;
	
	@Column(name="nr_cpf", nullable = false, length = 10)
	private String cpf;
	
	@Column(name="ds_cargo", nullable = false, length = 50)
	private String cargo;
	
	@Column(name="ds_dept", nullable = false, length = 50)
	private String departamento;
	
	@Column(name="vl_salario", nullable = false, length = 10, scale = 2)
	private int salario;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="dt_contratacao", updatable = false)
	private Calendar dtContratacao;

	
	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String cargo, String departamento, int salario,
			Calendar dtContratacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.departamento = departamento;
		this.salario = salario;
		this.dtContratacao = dtContratacao;
	}

	public Funcionario(int codigo, String nome, String cpf, String cargo, String departamento, int salario,
			Calendar dtContratacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.departamento = departamento;
		this.salario = salario;
		this.dtContratacao = dtContratacao;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Calendar getDtContratacao() {
		return dtContratacao;
	}

	public void setDtContratacao(Calendar dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	
	
	
}
