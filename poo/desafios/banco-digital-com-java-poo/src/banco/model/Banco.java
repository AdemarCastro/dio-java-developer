package banco.model;

import banco.model.dados.Endereco;

public class Banco {
	
	private String codigo;
	private String nome;
	private Endereco endereco;
	
	public Banco() { // Banco Padrão
		codigo = "001";
		nome = "Banco do Brasil";
		endereco = new Endereco("58025-110", "255");
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		// Verificação do codigo
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// Verificação do nome
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}
