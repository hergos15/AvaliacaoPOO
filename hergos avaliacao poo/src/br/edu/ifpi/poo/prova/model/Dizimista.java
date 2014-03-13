package br.edu.ifpi.poo.prova.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "Dizimista.buscarTotos", query="select d from dizimista d"),
	@NamedQuery(name = "Dizimista.buscarCPF", query="select d from d where d.cpf =  :cpf")
})
public class Dizimista {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;

	public Dizimista(String nome, String cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco= endereco;
		this.telefone = telefone;
	}

	public Dizimista(Long id, String nome, String cpf,String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco= endereco;
		this.telefone = telefone;
	}

	public Dizimista() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Dizimista [id=" + id + ", nome=" + nome + ", cpf=" + cpf
				+ ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dizimista other = (Dizimista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public boolean validarNome() {
		String regex= "[a-z]*";
		return this.nome.toLowerCase().matches(regex);
	}

	public boolean testValidarCPF() {
		// TODO Auto-generated method stub
		String regex= "[0-9]*";
		return this.cpf.toLowerCase().matches(regex);
	}

	public boolean testValidarTelefone() {
		String regex = "[0-9]*";
		return this.telefone.toLowerCase().matches(regex);
	}

	
	
	
	

	}


