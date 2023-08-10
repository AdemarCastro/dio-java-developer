package banco.model.atores;

import banco.model.dados.Contato;
import banco.model.dados.Endereco;

public class Pessoa {
	
	private String cpf;
	private String nome;
	private Endereco endereco;
	private Contato contato;
	
	public Pessoa(String cpf, String nome) { // Atributos obrigatórios no momento da criação do objeto
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
